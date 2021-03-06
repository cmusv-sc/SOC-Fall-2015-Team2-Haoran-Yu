/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package models.metadata;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import util.APICall;
import util.Constants;
import models.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ClimateService {

	private String id;
	private String climateServiceName;
	private String purpose;
	private String url;
	private String scenario;
	private String version;
	private String rootservice;
	private String photo;
	private String rate;

	public ClimateService(){
	}

	public String getRate(){
		return this.rate;
	}

	private void setRate(String rate){
		this.rate = rate;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getRootservice() {
		return rootservice;
	}

	public void setRootservice(String rootservice) {
		this.rootservice = rootservice;
	}

	private static final String GET_CLIMATE_RATE_CALL = Constants.NEW_BACKEND+"climateService/getAllClimateServicesRate/json";

	private static final String GET_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllClimateServices/json";

	private static final String GET_MOST_RECENTLY_ADDED_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllMostRecentClimateServicesByCreateTime/json";
	
	private static final String GET_MOST_RECENTLY_USED_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllMostRecentClimateServicesByLatestAccessTime/json";
	
	private static final String GET_MOST_POPULAR_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllMostUsedClimateServices/json";
	
	private static final String ADD_CLIMATE_SERVICE_CALL = Constants.NEW_BACKEND+"climateService/addClimateService";

	private static final String DELETE_CLIMATE_SERVICE_CALL = Constants.NEW_BACKEND + util.Constants.NEW_DELETE_CLIMATE_SERVICE;
	private static final String EDIT_CLIMATE_SERVICE_CALL = Constants.NEW_BACKEND+ "climateService/"
			+ util.Constants.NEW_EDIT_CLIMATE_SERVICE + "/name/";

	private static final String CLIMATESERVICE_QUERY = Constants.NEW_BACKEND + "climateService/queryClimateService";

	public String getId() {
		return id;
	}

	public String getClimateServiceName() {
		return climateServiceName;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getUrl() {
		return url;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setClimateServiceName(String climateServiceName) {
		this.climateServiceName = climateServiceName;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setUrl(String url) {
		this.url = url;
		setPhoto();
	}

	public static ClimateService find(String id) {
		ClimateService climateService = new ClimateService();
		climateService.setId(id);
		return climateService;
	}

	/**
	 * find a climateService by its name
	 *
	 * @param climateServiceName
	 * @return the founded result. If not found, return null
	 */
	public static ClimateService findServiceByName(String climateServiceName){
		List<ClimateService> allList = all();
		for (ClimateService element : allList) {
			String elementUri = element.getClimateServiceName();
			if (elementUri.equals(climateServiceName))
				return element;
		}
		return null;
	}

	public static HashMap<String, List<ClimateService>> allForVersions() {

		HashMap<String, List<ClimateService>> climateServices = new HashMap<String, List<ClimateService>>();

		JsonNode climateServicesNode = APICall
				.callAPI(GET_CLIMATE_SERVICES_CALL);

		if (climateServicesNode == null || climateServicesNode.has("error")
				|| !climateServicesNode.isArray()) {
			return climateServices;
		}

		for (int i = 0; i < climateServicesNode.size(); i++) {
			JsonNode json = climateServicesNode.path(i);
			ClimateService newService = new ClimateService();
			newService.setId(json.path("id").asText());
			newService.setClimateServiceName(json.get(
					"name").asText());
			newService.setPurpose(json.path("purpose").asText());
			newService.setUrl(json.path("url").asText());
			//newService.setCreateTime(json.path("createTime").asText());
			newService.setScenario(json.path("scenario").asText());
			newService.setVersion(json.path("versionNo").asText());
			newService.setRootservice(json.path("rootServiceId").asText());
			// climateServices.add(newService);

			String serviceName = newService.getClimateServiceName();
			List<ClimateService> list = climateServices.containsKey(serviceName)?
			climateServices.get(serviceName) : new ArrayList<ClimateService>();
			list.add(newService);
			climateServices.put(serviceName, list);

		}
		return climateServices;
	}

    //newly added
	public static List<ClimateService> queryClimateService(String climateServiceName) {
		
		List<ClimateService> serviceset = new ArrayList<ClimateService>();
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();
		queryJson.put("name", climateServiceName);
		
		//Connecting backend
		JsonNode climateServiceNode = APICall.postAPI(CLIMATESERVICE_QUERY, queryJson);
		
		if (climateServiceNode == null || climateServiceNode.has("error")
				|| !climateServiceNode.isArray()) {
			return serviceset;
		}

		for (int i = 0; i < climateServiceNode.size(); i++) {

			JsonNode json = climateServiceNode.path(i);
			ClimateService newService = new ClimateService();
			newService.setId(json.get("id").asText());
			newService.setClimateServiceName(json.get(
					"name").asText());
			newService.setPurpose(json.findPath("purpose").asText());
			newService.setUrl(json.findPath("url").asText());
			newService.setScenario(json.findPath("scenario").asText());
			newService.setVersion(json.findPath("versionNo").asText());
			newService.setRootservice(json.findPath("rootServiceId").asText());
			serviceset.add(newService);
		}
		return serviceset;
	}

    /**
     * Get the rates by service name
     * @return rate
     */
	public String getAllRates(){
		List<Comment> comments = allRates();
		int rates = 0;
		int count = 0;
		String serviceName = getClimateServiceName();
		for (Comment comment : comments) {
			String name = comment.getServiceName();
			if(name.equals(serviceName)){
				rates += Integer.parseInt(comment.getRate());
				count++;
			}
		}
		double result = (double)rates / (double)count;
		setRate(String.format("%.3f", result));
		return count == 0 ? "0.0": getRate();
	}

    /**
     * Get all rates for all services.
     * @return comment list
     */
	public static List<Comment> allRates(){
		List<Comment> comments = new ArrayList<Comment>();

		JsonNode climateServicesRateNode = APICall
				.callAPI(GET_CLIMATE_RATE_CALL);
		System.out.println("jsonnode:" + climateServicesRateNode);

		if (climateServicesRateNode == null || climateServicesRateNode.has("error")
				|| !climateServicesRateNode.isArray()) {
	    	System.out.println("error!"); 
			return comments;
		}

		for (int i = 0; i < climateServicesRateNode.size(); i++) {
			JsonNode json = climateServicesRateNode.path(i);
			Comment newComment = new Comment();
			newComment.setId(Long.parseLong(json.path("id").asText()));
			newComment.setServiceName(json.get(
					"serviceName").asText());
			newComment.setRate(json.path("rate").asText());
			newComment.setComment(json.path("comment").asText());
			comments.add(newComment);
		}
		return comments;
	}

	/**
	 * Generate the list of all sensor categories
	 *
	 * @return a list of all the sensor categories
	 */
	public static List<ClimateService> all() {

		List<ClimateService> climateServices = new ArrayList<ClimateService>();

		JsonNode climateServicesNode = APICall
				.callAPI(GET_CLIMATE_SERVICES_CALL);

		if (climateServicesNode == null || climateServicesNode.has("error")
				|| !climateServicesNode.isArray()) {
			return climateServices;
		}

		for (int i = 0; i < climateServicesNode.size(); i++) {
			JsonNode json = climateServicesNode.path(i);
			ClimateService newService = new ClimateService();
			newService.setId(json.path("id").asText());
			newService.setClimateServiceName(json.get(
					"name").asText());
			newService.setPurpose(json.path("purpose").asText());
			newService.setUrl(json.path("url").asText());
			//newService.setCreateTime(json.path("createTime").asText());
			newService.setScenario(json.path("scenario").asText());
			newService.setVersion(json.path("versionNo").asText());
			newService.setRootservice(json.path("rootServiceId").asText());
			climateServices.add(newService);
		}
		return climateServices;
	}
	
	public static List<ClimateService> getMostRecentlyAdded() {

		List<ClimateService> climateServices = new ArrayList<ClimateService>();

		JsonNode climateServicesNode = APICall
				.callAPI(GET_MOST_RECENTLY_ADDED_CLIMATE_SERVICES_CALL);
		if (climateServicesNode == null || climateServicesNode.has("error")
				|| !climateServicesNode.isArray()) {
			return climateServices;
		}

		for (int i = 0; i < climateServicesNode.size(); i++) {
			JsonNode json = climateServicesNode.path(i);
			ClimateService newService = new ClimateService();
			newService.setId(json.get("id").asText());
			newService.setClimateServiceName(json.get(
					"name").asText());
			newService.setPurpose(json.findPath("purpose").asText());
			newService.setUrl(json.findPath("url").asText());
			newService.setScenario(json.findPath("scenario").asText());
			newService.setVersion(json.findPath("versionNo").asText());
			newService.setRootservice(json.findPath("rootServiceId").asText());
			climateServices.add(newService);
		}
		return climateServices;
	}
	
	public static List<ClimateService> getMostRecentlyUsed() {

		List<ClimateService> climateServices = new ArrayList<ClimateService>();

		JsonNode climateServicesNode = APICall
				.callAPI(GET_MOST_RECENTLY_USED_CLIMATE_SERVICES_CALL);

		if (climateServicesNode == null || climateServicesNode.has("error")
				|| !climateServicesNode.isArray()) {
			return climateServices;
		}

		for (int i = 0; i < climateServicesNode.size(); i++) {
			JsonNode json = climateServicesNode.path(i);
			ClimateService newService = new ClimateService();
			newService.setId(json.get("id").asText());
			newService.setClimateServiceName(json.get(
					"name").asText());
			newService.setPurpose(json.findPath("purpose").asText());
			newService.setUrl(json.findPath("url").asText());
			newService.setScenario(json.findPath("scenario").asText());
			newService.setVersion(json.findPath("versionNo").asText());
			newService.setRootservice(json.findPath("rootServiceId").asText());
			climateServices.add(newService);
		}
		return climateServices;
	}
	
	public static List<ClimateService> getMostPopular() {

		List<ClimateService> climateServices = new ArrayList<ClimateService>();

		JsonNode climateServicesNode = APICall
				.callAPI(GET_MOST_POPULAR_CLIMATE_SERVICES_CALL);

		if (climateServicesNode == null || climateServicesNode.has("error")
				|| !climateServicesNode.isArray()) {
			return climateServices;
		}

		for (int i = 0; i < climateServicesNode.size(); i++) {
			JsonNode json = climateServicesNode.path(i);
			ClimateService newService = new ClimateService();
			newService.setId(json.get("id").asText());
			newService.setClimateServiceName(json.get(
					"name").asText());
			newService.setPurpose(json.findPath("purpose").asText());
			newService.setUrl(json.findPath("url").asText());
			newService.setScenario(json.findPath("scenario").asText());
			newService.setVersion(json.findPath("versionNo").asText());
			newService.setRootservice(json.findPath("rootServiceId").asText());
			climateServices.add(newService);
		}
		return climateServices;
	}

	/**
	 * Create a new climate service
	 *
	 * @param jsonData
	 * @return the response from the API server
	 */
	public static JsonNode create(JsonNode jsonData) {
		System.out.println("frontend create!!!");
		return APICall.postAPI(ADD_CLIMATE_SERVICE_CALL, jsonData);
	}

	/**
	 * Edit a climate service
	 *
	 * @param jsonData
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static JsonNode edit(String climateServiceName, JsonNode jsonData) throws UnsupportedEncodingException {
		return APICall.putAPI(EDIT_CLIMATE_SERVICE_CALL + URLEncoder.encode(climateServiceName, "UTF-8"), jsonData);
	}

	/**
	 * Delete a sensor category
	 *
	 * @param climateServiceId
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static JsonNode delete(String climateServiceId) throws UnsupportedEncodingException {
		return APICall.deleteAPI(DELETE_CLIMATE_SERVICE_CALL
				+ URLEncoder.encode(climateServiceId, "UTF-8"));
	}

	/**
	 * Generate a list of climate service names
	 *
	 * @return a list of climate service names
	 */
	public static List<String> allClimateServiceName() {
		List<ClimateService> allList = all();
		List<String> resultList = new ArrayList<String>();
		for (ClimateService element : allList) {
			String elementName = element.getClimateServiceName();
			if (elementName != null)
				resultList.add(elementName);
		}
		return resultList;
	}

	public void setPhoto(){
		if(url.contains("threeDimVarVertical.html")){
			photo = "/assets/images/3DVerticalProfile.jpeg";
		}else if(url.contains("twoDimZonalMean.html")){
			photo = "http://einstein.sv.cmu.edu:9002/static/twoDimZonalMean/65778f88e3e057738423aa7183f5ee54/nasa_modis_clt_200401_200412_Annual.jpeg";
		}else if(url.contains("twoDimMap.html")){
			photo = "http://einstein.sv.cmu.edu:9002/static/twoDimMap/6879a2eedd1910f4c45e6213d342e066/nasa_modis_clt_200401_200412_Annual.jpeg";
		}else if(url.contains("twoDimSlice3D.html")){
			photo = "http://einstein.sv.cmu.edu:9002/static/twoDimSlice3D/ba6b08d54048d9c8349185d2606d3638/nasa_airs_ta_200401_200412_Annual.jpeg";
		}else if(url.contains("scatterPlot2Vars.html")){
			photo = "/assets/images/ScatterPlot.png";
		}else if(url.contains("conditionalSampling.html")){
			photo = "/assets/images/ConditionalSampling1Variable.jpeg";
		}else if(url.contains("twoDimTimeSeries.html")){
			photo = "/assets/images/TimeSeriesPlot.jpeg";
		}else if(url.contains("threeDimZonalMean.html")){
			photo = "http://einstein.sv.cmu.edu:9002/static/threeDimZonalMean/e4e120045d2bb589eed371e1ca08fd99/nasa_airs_ta_200401_200412_Annual.jpeg";
		}else if(url.contains("diffPlot2Vars.html")){
			photo = "/assets/images/DifferencePlot.png";
		}else if (url.contains("regridAndDownload.html")) {
			photo = "/assets/images/regrid.jpg";
		}else if (url.contains("correlationMap.html")) {
			photo = "/assets/images/correlationMap.png";
		}else if (url.contains("conditionalSampling2Var.html")) {
			photo = "/assets/images/conditionalSampling2Variables.jpeg";
		}
		else{
			photo = "http://upload.wikimedia.org/wikipedia/commons/3/33/White_square_with_question_mark.png";
		}
	}
	public String getPhoto() {
		return photo;
	}

}


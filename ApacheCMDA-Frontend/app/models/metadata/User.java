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

public class User{

	private long id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String middleInitial;
	private String affiliation;
	private String title;
	private String email;
	private String mailingAddress;
	private String phoneNumber;
	private String faxNumber;
	private String researchFields;
	private String highestDegree;


	

	private static final String GET_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllClimateServices/json";

	private static final String GET_MOST_RECENTLY_ADDED_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllMostRecentClimateServicesByCreateTime/json";
	
	private static final String GET_MOST_RECENTLY_USED_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllMostRecentClimateServicesByLatestAccessTime/json";
	
	private static final String GET_MOST_POPULAR_CLIMATE_SERVICES_CALL = Constants.NEW_BACKEND+"climateService/getAllMostUsedClimateServices/json";
	
	private static final String ADD_USER_SERVICE_CALL = Constants.NEW_BACKEND+"/users/add";

	private static final String DELETE_CLIMATE_SERVICE_CALL = Constants.NEW_BACKEND + util.Constants.NEW_DELETE_CLIMATE_SERVICE;
	private static final String EDIT_CLIMATE_SERVICE_CALL = Constants.NEW_BACKEND+ "climateService/"
			+ util.Constants.NEW_EDIT_CLIMATE_SERVICE + "/name/";


	/**
	 * Create a new climate service
	 *
	 * @param jsonData
	 * @return the response from the API server
	 */
	public static JsonNode create(JsonNode jsonData) {
		System.out.println("metadata user");
		return APICall.postAPI(ADD_USER_SERVICE_CALL, jsonData);
	}




}


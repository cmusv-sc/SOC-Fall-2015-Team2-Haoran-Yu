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

package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.data.validation.Constraints;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;
	private String comment;
	private String rate;
	private String serviceName;
	private String hashtag;
	private String atUser;
	
	

	// @OneToMany(mappedBy = "user", cascade={CascadeType.ALL})
	// private Set<ClimateService> climateServices = new
	// HashSet<ClimateService>();

	public Comment() {

	}

	public Comment(String comment, String rate, String serviceName, String hashtag, String atUser) {
		super();
		this.comment = comment;
		this.rate = rate;
		this.serviceName = serviceName;
		this.hashtag = hashtag;
		this.atUser = atUser;
	}

	public String getAtUser(){
		return this.atUser;
	}

	public void setAtUser(String atUser){
		this.atUser = atUser;
	}

	public String getHashTag(){
		return this.hashtag;
	}

	public String setHashTag(String hashtag){
		return this.hashtag;
	}

	public void setServiceName(String serviceName){
		this.serviceName = serviceName;
	}

	public String getServiceName(){
		return this.serviceName;
	}


	public long getId(){
		return this.id;
	}

	public void setId(long id){
		this.id = id;
	}

	public String getComment(){
		return this.comment;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getRate(){
		return this.rate;
	}

	public void setRate(String rate){
		this.rate = rate;
	}


	@Override
	public String toString() {
		return "Comment "+ this.id + ": [" + this.comment +"] Rating:" + this.rate;
	}

}
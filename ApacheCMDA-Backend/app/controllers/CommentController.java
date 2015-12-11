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
package controllers;

import java.util.ArrayList;
import java.util.List;

import models.*;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class CommentController extends Controller {

	private final CommentRepository commentRepository;

	// We are using constructor injection to receive a repository to support our
	// desire for immutability.
	@Inject
	public CommentController(final CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

    public Result addComment() {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("comment not created, expecting Json data");
			return badRequest("comment not created, expecting Json data");
		}


		System.out.println(json);

		// Parse JSON file
		String serviceName = json.path("serviceName").asText();
		String rate = json.path("rate").asText();
		String commentStr = json.path("comment").asText();
		String hashtag = json.path("hash_tag").asText();
        String at = json.path("at_tag").asText();

		try {
			Comment comment = new Comment(serviceName, rate, commentStr,hashtag, at);
			commentRepository.save(comment);
			System.out.println("comment saved: " + comment.getId());
			return created(new Gson().toJson(comment.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("comment not saved: ");
			return badRequest("comment not saved: ");
		}
	}

	public Result getAllComments(String format) {
		Iterable<Comment> commentIterable = commentRepository.findAll();
		List<Comment> commentList = new ArrayList<Comment>();
		for (Comment comment: commentIterable) {
			commentList.add(comment);
		}
		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(commentList);
		}
		return ok(result);
	}
	
}

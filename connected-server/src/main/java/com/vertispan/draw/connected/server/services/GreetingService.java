package com.vertispan.draw.connected.server.services;

/*
 * #%L
 * connected-server
 * %%
 * Copyright (C) 2017 - 2018 Vertispan
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vertispan.draw.connected.shared.data.IsParentRelationship;

public class GreetingService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");

        IsParentRelationship isParentRelationship = new IsParentRelationship();
        isParentRelationship.setParentId(String.valueOf(new Random().nextInt(10)));
        isParentRelationship.setChildId(String.valueOf(new Random().nextInt(10) + 10));

        resp.getWriter().write("{\"parentid\":\"" + String.valueOf(new Random().nextInt(10)) + "\",\"childid\":\"" + String.valueOf(new Random().nextInt(10)) + "\"}");
    }
}

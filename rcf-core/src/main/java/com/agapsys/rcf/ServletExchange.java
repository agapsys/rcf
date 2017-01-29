/*
 * Copyright 2017 Agapsys Tecnologia Ltda-ME.
 *
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
 */
package com.agapsys.rcf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class ServletExchange {
    private final HttpServletRequest servletRequest;
    final HttpServletRequest _getServletRequest() {
        return servletRequest;
    }

    private final HttpServletResponse servletResponse;
    final HttpServletResponse _getServletResponse() {
        return servletResponse;
    }

    ServletExchange(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        if (servletRequest == null)
            throw new IllegalArgumentException("Servlet request cannot be null");

        if (servletResponse == null)
            throw new IllegalArgumentException("Servlet response cannot be null");

        this.servletRequest = servletRequest;
        this.servletResponse = servletResponse;
    }
}

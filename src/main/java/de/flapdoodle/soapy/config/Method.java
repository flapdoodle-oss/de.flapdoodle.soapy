/**
 * Copyright (C) 2013
 *   Michael Mosmann <michael@mosmann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.flapdoodle.soapy.config;

import com.google.common.base.Preconditions;

public class Method {

    private final Name<Method> name;
    private final Name<Type> response;
    private final Name<Type> request;

    public Method(Name<Method> name, Name<Type> response, Name<Type> request) {
        this.name = Preconditions.checkNotNull(name);
        this.response = Preconditions.checkNotNull(response);
        this.request = Preconditions.checkNotNull(request);
    }

    public Name<Method> name() {
        return name;
    }

    public Name<Type> response() {
        return response;
    }

    public Name<Type> request() {
        return request;
    }
    
    
}

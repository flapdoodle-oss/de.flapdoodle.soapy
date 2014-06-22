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

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

public class MethodAlias {

    private final Name<MethodAlias> name;
    private final Name<Method> sourceMethod;
    private final Optional<TypeAlias> request;
    private final Optional<TypeAlias> response;
    
    public MethodAlias(Name<MethodAlias> name, Name<Method> sourceMethod, Optional<TypeAlias> request,Optional<TypeAlias> response) {
        this.name = Preconditions.checkNotNull(name);
        this.sourceMethod = Preconditions.checkNotNull(sourceMethod);
        this.request = Preconditions.checkNotNull(request);
        this.response = Preconditions.checkNotNull(response);
    }

    public Name<MethodAlias> name() {
        return name;
    }

    public Name<Method> sourceMethod() {
        return sourceMethod;
    }

    public Optional<TypeAlias> request() {
        return request;
    }
    
    public Optional<TypeAlias> response() {
        return response;
    }
    
    
}

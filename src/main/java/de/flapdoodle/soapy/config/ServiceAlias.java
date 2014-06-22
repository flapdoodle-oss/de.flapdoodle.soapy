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
import com.google.common.collect.ImmutableList;

public class ServiceAlias {
    private final Name<ServiceAlias> name;
    private final Name<Service> sourceService;
    private final ImmutableList<MethodAlias> methods;

    public ServiceAlias(Name<ServiceAlias> name, Name<Service> sourceService, ImmutableList<MethodAlias> methods) {
        this.name = Preconditions.checkNotNull(name);
        this.sourceService = Preconditions.checkNotNull(sourceService);
        this.methods = Preconditions.checkNotNull(methods);
    }

    public Name<ServiceAlias> name() {
        return name;
    }

    public Name<Service> sourceService() {
        return sourceService;
    }

    public ImmutableList<MethodAlias> methods() {
        return methods;
    }
    
    
}

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

import org.junit.Test;

public class ServiceBuilderTest {

    @Test
    public void creatingSimpleServiceShouldGiveNoError() {
        Type stringType = new TypeBuilder()
            .name("String")
            .build();
        
        Type request=new TypeBuilder()
            .name("request")
            .property(new PropertyBuilder()
                .name("client")
                .type(stringType.name())
                .build())
            .build();
    
        Property nameProperty = new PropertyBuilder()
            .name("name")
            .type(stringType.name())
            .build();
        
        Type response=new TypeBuilder()
            .name("response")
            .property(nameProperty)
            .build();
    
        Method method = new MethodBuilder()
            .name("foo")
            .request(request.name())
            .response(response.name())
            .build();
        
        Service service = new ServiceBuilder()
            .name("fooService")
            .method(method)
            .build();
        
        new ServiceAliasBuilder()
            .name("alias")
            .sourceService(service.name())
            .methods(new MethodAliasBuilder()
                .name("fooBar")
                .sourceMethod(method.name())
                .response(new TypeAliasBuilder()
                    .name("fooResponse")
                    .sourceType(response.name())
                    .property(new PropertyAliasBuilder()
                        .name("nameFoo")
                        .sourceProperty(nameProperty.name())
                        .build())
                    .build())
                .build())
            .build();
    }

}

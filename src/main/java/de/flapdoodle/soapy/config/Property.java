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

public class Property {
    private final Name<Property> name;
    private final Relation relation;
    private final Name<Type> type;

    public Property(Name<Property> name, Relation relation, Name<Type> type) {
        this.name = Preconditions.checkNotNull(name);
        this.relation = Preconditions.checkNotNull(relation);
        this.type = Preconditions.checkNotNull(type);
    }
    
    public Name<Property> name() {
        return name;
    }
    
    public Relation relation() {
        return relation;
    }
    
    public Name<Type> type() {
        return type;
    }
}

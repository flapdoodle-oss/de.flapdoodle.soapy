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


public class PropertyBuilder {
    private Name<Property> name;
    private Relation relation=Relation.One2One;
    private Name<Type> type;

    public PropertyBuilder name(String name) {
        this.name = Name.of(Property.class, name);
        return this;
    }

    public PropertyBuilder relation(Relation relation) {
        this.relation = relation;
        return this;
    }

    public PropertyBuilder type(Name<Type> type) {
        this.type = type;
        return this;
    }

    public Property build() {
        return new Property(name, relation, type);
    }
}
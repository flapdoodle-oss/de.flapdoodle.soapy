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

public class TypeAlias {
    private final Name<TypeAlias> name;
    private final Name<Type> sourceType;
    private final ImmutableList<PropertyAlias> properties;

    public TypeAlias(Name<TypeAlias> name, Name<Type> sourceType, ImmutableList<PropertyAlias> properties) {
        this.name = Preconditions.checkNotNull(name);
        this.sourceType = Preconditions.checkNotNull(sourceType);
        this.properties = Preconditions.checkNotNull(properties);
    }

    public Name<TypeAlias> name() {
        return name;
    }

    public Name<Type> sourceType() {
        return sourceType;
    }

    public ImmutableList<PropertyAlias> properties() {
        return properties;
    }

}

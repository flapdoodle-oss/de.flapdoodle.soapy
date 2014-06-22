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

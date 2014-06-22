package de.flapdoodle.soapy.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

public class Type {

    private final Name<Type> name;
    private final ImmutableList<Name<Type>> baseTypes;
    private final ImmutableList<Property> properties;

    public Type(Name<Type> name, ImmutableList<Name<Type>> baseTypes, ImmutableList<Property> properties) {
        this.name =  Preconditions.checkNotNull(name);
        this.baseTypes = Preconditions.checkNotNull(baseTypes);
        this.properties = Preconditions.checkNotNull(properties);
    }
    
    public Name<Type> name() {
        return name;
    }
    
    public ImmutableList<Name<Type>> baseTypes() {
        return baseTypes;
    }
    
    public ImmutableList<Property> properties() {
        return properties;
    }
}

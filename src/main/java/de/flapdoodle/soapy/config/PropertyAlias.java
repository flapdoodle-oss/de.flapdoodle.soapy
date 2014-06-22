package de.flapdoodle.soapy.config;

import com.google.common.base.Preconditions;

public class PropertyAlias {

    private final Name<PropertyAlias> name;
    private final Name<Property> sourceProperty;

    public PropertyAlias(Name<PropertyAlias> name, Name<Property> sourceProperty) {
        this.name = Preconditions.checkNotNull(name);
        this.sourceProperty = Preconditions.checkNotNull(sourceProperty);
    }
    
    public Name<PropertyAlias> name() {
        return name;
    }
    
    public Name<Property> sourceProperty() {
        return sourceProperty;
    }
}

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

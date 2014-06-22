package de.flapdoodle.soapy.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

public class Service {

    private final Name<Service> name;
    private final ImmutableList<Method> methods;

    public Service(Name<Service> name, ImmutableList<Method> methods) {
        this.name = Preconditions.checkNotNull(name);
        this.methods = Preconditions.checkNotNull(methods);
    }
    
    public Name<Service> name() {
        return name;
    }
    
    public ImmutableList<Method> methods() {
        return methods;
    }
}

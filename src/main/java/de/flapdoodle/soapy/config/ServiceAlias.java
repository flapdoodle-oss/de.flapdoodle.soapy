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

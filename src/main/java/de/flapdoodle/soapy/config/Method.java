package de.flapdoodle.soapy.config;

import com.google.common.base.Preconditions;

public class Method {

    private final Name<Method> name;
    private final Name<Type> response;
    private final Name<Type> request;

    public Method(Name<Method> name, Name<Type> response, Name<Type> request) {
        this.name = Preconditions.checkNotNull(name);
        this.response = Preconditions.checkNotNull(response);
        this.request = Preconditions.checkNotNull(request);
    }

    public Name<Method> name() {
        return name;
    }

    public Name<Type> response() {
        return response;
    }

    public Name<Type> request() {
        return request;
    }
    
    
}

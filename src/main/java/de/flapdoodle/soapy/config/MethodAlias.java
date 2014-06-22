package de.flapdoodle.soapy.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

public class MethodAlias {

    private final Name<MethodAlias> name;
    private final Name<Method> sourceMethod;
    private final ImmutableList<TypeAlias> types;

    public MethodAlias(Name<MethodAlias> name, Name<Method> sourceMethod, ImmutableList<TypeAlias> types) {
        this.name = Preconditions.checkNotNull(name);
        this.sourceMethod = Preconditions.checkNotNull(sourceMethod);
        this.types = Preconditions.checkNotNull(types);
    }

    public Name<MethodAlias> name() {
        return name;
    }

    public Name<Method> sourceMethod() {
        return sourceMethod;
    }

    public ImmutableList<TypeAlias> types() {
        return types;
    }
    
    
}

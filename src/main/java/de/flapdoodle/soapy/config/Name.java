package de.flapdoodle.soapy.config;

import com.google.common.base.Preconditions;

public final class Name<T> {

    private final String value;
    private final Class<T> type;

    public Name(Class<T> type, String value) {
        this.type = Preconditions.checkNotNull(type,"type is null");
        this.value = Preconditions.checkNotNull(value,"value is null for %s",type);
    }
    
    public String asString() {
        return value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Name other = (Name) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    public static <T> Name<T> of(Class<T> type, String name) {
        return new Name<>(type, name);
    }
    
    
}

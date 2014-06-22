package de.flapdoodle.soapy.config;


public class PropertyBuilder {
    private Name<Property> name;
    private Relation relation=Relation.One2One;
    private Name<Type> type;

    public PropertyBuilder name(String name) {
        this.name = Name.of(Property.class, name);
        return this;
    }

    public PropertyBuilder relation(Relation relation) {
        this.relation = relation;
        return this;
    }

    public PropertyBuilder type(Name<Type> type) {
        this.type = type;
        return this;
    }

    public Property build() {
        return new Property(name, relation, type);
    }
}
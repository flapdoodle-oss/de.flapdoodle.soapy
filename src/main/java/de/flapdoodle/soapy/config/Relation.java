package de.flapdoodle.soapy.config;

public enum Relation {
    One2Optional, // 1..?
    One2One, // 1..1 
    One2OneOrMore, // 1..+
    One2Many, // 1..*
    ;
    
    
}

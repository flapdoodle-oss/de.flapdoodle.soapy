package de.flapdoodle.soapy.config;

import org.junit.Test;

public class ServiceBuilderTest {

    @Test
    public void creatingSimpleServiceShouldGiveNoError() {
        Type stringType = new TypeBuilder()
            .name("String")
            .build();
        
        Type request=new TypeBuilder()
            .name("request")
            .property(new PropertyBuilder()
                .name("client")
                .type(stringType.name())
                .build())
            .build();
    
        Property nameProperty = new PropertyBuilder()
            .name("name")
            .type(stringType.name())
            .build();
        
        Type response=new TypeBuilder()
            .name("response")
            .property(nameProperty)
            .build();
    
        Method method = new MethodBuilder()
            .name("foo")
            .request(request.name())
            .response(response.name())
            .build();
        
        Service service = new ServiceBuilder()
            .name("fooService")
            .method(method)
            .build();
        
        new ServiceAliasBuilder()
            .name("alias")
            .sourceService(service.name())
            .methods(new MethodAliasBuilder()
                .name("fooBar")
                .sourceMethod(method.name())
                .type(new TypeAliasBuilder()
                    .name("fooResponse")
                    .sourceType(response.name())
                    .property(new PropertyAliasBuilder()
                        .name("nameFoo")
                        .sourceProperty(nameProperty.name())
                        .build())
                    .build())
                .build())
            .build();
    }

}

package de.flapdoodle.soapy.render;

import de.flapdoodle.soapy.config.Service;
import de.flapdoodle.soapy.config.ServiceAlias;

public interface SoapyRenderer {
    
    void render(NameableOutput output, Service service, ServiceAlias... alias);
}

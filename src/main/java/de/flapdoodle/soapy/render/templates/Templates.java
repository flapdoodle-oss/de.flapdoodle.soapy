package de.flapdoodle.soapy.render.templates;

import org.stringtemplate.v4.STGroupDir;

import com.google.common.base.Preconditions;

public class Templates {

    private STGroupDir stGroupDir;

    private Templates(Class<?> baseClass, String resourceName) {
        stGroupDir = new STGroupDir(Preconditions.checkNotNull(baseClass.getResource(resourceName),"could not find resource for %s.%s",baseClass, resourceName), "UTF-8" , '<', '>');
    }
    
    public static Templates instance() {
        return new Templates(Templates.class, "files");
    }
}

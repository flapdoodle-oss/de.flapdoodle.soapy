package de.flapdoodle.soapy.render.templates;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupDir;

public class StringTemplateTest {

    @Test
    public void loadTemplateFromClasspathAndRenderIt() {
        STGroupDir a=new STGroupDir(getClass().getResource("test"), "UTF-8" , '<', '>');
        ST main = a.getInstanceOf("main");
        assertEquals("Huii", main.render());
    }
}

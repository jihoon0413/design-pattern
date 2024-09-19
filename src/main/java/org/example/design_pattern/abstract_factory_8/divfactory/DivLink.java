package org.example.design_pattern.abstract_factory_8.divfactory;

import org.example.design_pattern.abstract_factory_8.factory.Link;

public class DivLink extends Link {

    public DivLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<div class=\"LINK\"><a href=\"" + url + "\">" + caption + "</a></div>\n";
    }
}

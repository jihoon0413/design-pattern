package org.example.design_pattern._8_abstract_factory.factory;

public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

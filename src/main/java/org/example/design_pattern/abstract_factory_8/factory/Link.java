package org.example.design_pattern.abstract_factory_8.factory;

public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

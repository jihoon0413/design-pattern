package org.example.design_pattern.abstract_factory_8.listfactory;

import org.example.design_pattern.abstract_factory_8.factory.Factory;
import org.example.design_pattern.abstract_factory_8.factory.Link;
import org.example.design_pattern.abstract_factory_8.factory.Page;
import org.example.design_pattern.abstract_factory_8.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

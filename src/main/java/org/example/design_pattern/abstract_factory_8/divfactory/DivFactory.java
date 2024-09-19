package org.example.design_pattern.abstract_factory_8.divfactory;

import org.example.design_pattern.abstract_factory_8.factory.Factory;
import org.example.design_pattern.abstract_factory_8.factory.Link;
import org.example.design_pattern.abstract_factory_8.factory.Page;
import org.example.design_pattern.abstract_factory_8.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}

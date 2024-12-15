package org.example.design_pattern._8_abstract_factory.divfactory;

import org.example.design_pattern._8_abstract_factory.factory.Factory;
import org.example.design_pattern._8_abstract_factory.factory.Link;
import org.example.design_pattern._8_abstract_factory.factory.Page;
import org.example.design_pattern._8_abstract_factory.factory.Tray;

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

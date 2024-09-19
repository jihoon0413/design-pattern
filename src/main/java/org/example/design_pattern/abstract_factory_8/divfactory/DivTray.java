package org.example.design_pattern.abstract_factory_8.divfactory;

import org.example.design_pattern.abstract_factory_8.factory.Item;
import org.example.design_pattern.abstract_factory_8.factory.Tray;

public class DivTray extends Tray {

    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>");
        sb.append(caption);
        sb.append("</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for (Item item: tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}

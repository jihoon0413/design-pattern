package org.example.design_pattern._6_prototype.problem2.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }
    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createCopy();
    }
}

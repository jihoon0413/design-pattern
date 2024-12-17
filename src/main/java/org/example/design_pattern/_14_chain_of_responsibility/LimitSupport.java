package org.example.design_pattern._14_chain_of_responsibility;

import java.util.regex.Pattern;

public class LimitSupport extends Support{

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}

package org.example.design_pattern._14_chain_of_responsibility;

public class SpecialSupport extends Support{

    private int num;

    public SpecialSupport(String name, int num) {
        super(name);
        this.num = num;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == num;
    }
}

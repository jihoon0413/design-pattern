package org.example.design_pattern._14_chain_of_responsibility;

public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public void support(Trouble trouble) {
        if(resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public void support2(Trouble trouble) {
        Support obj = this;
        while (true) {
            if(obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if(obj.next == null) {
                obj.fail(trouble);
                break;
            } else {
                obj = obj.next;
            }
        }
    }


    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by" + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

}

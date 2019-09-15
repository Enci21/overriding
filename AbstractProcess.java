package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    public void process(Orderable item) {
        stepBefore();
        stepAfter();
        action(item);
    }

    public void stepBefore() {
    }

    protected abstract void action(Orderable item);

    public void stepAfter() {
    }
}

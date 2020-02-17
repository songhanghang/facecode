package pattern.mediator;

import java.util.concurrent.ConcurrentHashMap;

public abstract class Product {
    private Mediator mediator;
    public Product(Mediator mediator) {
        this.mediator = mediator;
    }
    abstract void receive(String s);

    void send(String s) {
        mediator.relay(this, s);
    }

}



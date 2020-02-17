package pattern.template;

public abstract class Parent {

    final void template() {
        c();
        b();
        a();
    }
    abstract void a();
    abstract void b();
    abstract void c();
}

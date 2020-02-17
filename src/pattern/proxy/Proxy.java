package pattern.proxy;

public class Proxy implements Feature{
    private Feature server = new Server();
    @Override
    public void call() {
        System.out.println("插入代理逻辑");
        server.call();
    }
}

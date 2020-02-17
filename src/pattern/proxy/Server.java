package pattern.proxy;

public class Server implements Feature{
    @Override
    public void call() {
        System.out.println("打电话给momo");
    }
}

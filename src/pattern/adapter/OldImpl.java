package pattern.adapter;

public class OldImpl implements OldTarget {
    @Override
    public void requestOld() {
        System.out.println("执行旧接口");
    }
}

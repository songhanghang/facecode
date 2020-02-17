package pattern.adapter;

/**
 * 双向适配器
 */
public class DoubleAdapter implements OldTarget, Target {

    private final OldTarget old;
    private final Target target;

    public DoubleAdapter(OldTarget old, Target target) {
        this.old = old;
        this.target = target;
    }
    @Override
    public void requestOld() {
        target.request();
    }

    @Override
    public void request() {
        old.requestOld();
    }
}

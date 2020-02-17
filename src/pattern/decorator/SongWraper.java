package pattern.decorator;

public class SongWraper extends Wrapper {
    public SongWraper(Component target) {
        super(target);
    }

    @Override
    public void operation() {
        System.out.println(target.toString() + " 我会唱歌了");
        super.operation();
    }
}

package pattern.bridge;

/**
 * 使抽象化和实例化分离，使其在自己的维度独立变化。
 */
public abstract class Shape {

    public final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();

}

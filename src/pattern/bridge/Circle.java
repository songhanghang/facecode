package pattern.bridge;

public class Circle extends Shape {

    public Circle(Color feature) {
        super(feature);
    }

    @Override
    void draw() {
        System.out.println("这是圆形" + " color " + color.color());

    }
}

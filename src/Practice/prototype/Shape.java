package Practice.prototype;

class Circle implements Cloneable {

    private int radius;
    private String color;
    private int posi;

    public Circle(int radius, String color, int posi) {
        this.radius = radius;
        this.color = color;
        this.posi = posi;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone(); // shallow copy
    }

    public void setPosi(int posi) {
        this.posi = posi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", posi=" + posi +
                '}';
    }
}

public class Shape {
    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle(10, "black", 20);

        Circle clonedCircle = circle.clone();
        clonedCircle.setPosi(900);

        System.out.println(circle);
        System.out.println(clonedCircle);
    }
}

package creationalDesignPattern.prototype.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        try {
            Shape circle = new Shape("Circle", "Red");
            Shape clonedCircle = (Shape) circle.clone();
            clonedCircle.setColor("Blue");

            System.out.println("Original Circle Color: " + circle.getColor());
            System.out.println("Cloned Circle Color: " + clonedCircle.getColor());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

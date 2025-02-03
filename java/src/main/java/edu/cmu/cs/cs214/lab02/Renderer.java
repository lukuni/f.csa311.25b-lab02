package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
public class Renderer {
    private Shape shape;
// Shape объект хүлээж авдаг конструктор
    public Renderer(Shape shape) {
        this.shape = shape;
    }
// Дүрсийг зурах (Талбайг хэвлэн гаргах)
    public void draw() {
        double area = shape.getArea();
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}

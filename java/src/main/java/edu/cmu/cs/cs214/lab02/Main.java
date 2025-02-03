package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

// Main класс нь програмыг эхлүүлэх цэгийг агуулна
public class Main {
    public static void main(String[] args) {
        // Shape нь интерфэйсийн хэд хэдэн төрлүүдийг үүсгэнэ
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(3.0, 4.0);
        Shape square = new Square(2.0);

        // Renderer нь объектуудыг үүсгэж дүрсийг зурна
        Renderer circleRenderer = new Renderer(circle);
        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer squareRenderer = new Renderer(square);

        // Дүрсийг зурах
        circleRenderer.draw();
        rectangleRenderer.draw();
        squareRenderer.draw();
    }
}

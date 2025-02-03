package edu.cmu.cs.cs214.lab02.shapes;
// Circle класс нь Shape интерфэйсийг хэрэгжүүлнэ
public class Circle implements Shape {
    private double radius;  // Радиус
// Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }
// Радиусын талбайг тооцоолох функц
    public double getArea() {
        return Math.PI * radius * radius;
    }
// Радиусыг авах (getter)
    public double getRadius() {
        return radius;
    }
// Радиусыг тохируулах (setter)
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

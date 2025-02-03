package edu.cmu.cs.cs214.lab02.shapes;
// Rectangle класс нь Shape интерфэйсийг хэрэгжүүлнэ
public class Rectangle implements Shape {
    private double height;  // Өндөр
    private double width;   // Өргөн
// Конструктор
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
// Талбайг тооцоолох функц
    public double getArea() {
        return height * width;
    }
// Өндрийг авах (getter)
    public double getHeight() {
        return height;
    }
// Өндрийг тохируулах (setter)
    public void setHeight(double height) {
        this.height = height;
    }
// Өргөнийг авах (getter)
    public double getWidth() {
        return width;
    }
// Өргөнийг тохируулах (setter)
    public void setWidth(double width) {
        this.width = width;
    }
}

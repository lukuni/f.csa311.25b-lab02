package edu.cmu.cs.cs214.lab02.shapes;
// Square класс нь Shape интерфэйсийг хэрэгжүүлнэ
public class Square implements Shape {
    private double sideLen;  // Квадратын талын урт
// Конструктор
    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
// Талбайг тооцоолох функц
    public double getArea() {
        return sideLen * sideLen;
    }
// Квадратын талын уртыг авах (getter)
    public double getSideLen() {
        return sideLen;
    }
// Квадратын талын уртыг тохируулах (setter)
    public void setSideLen(double sideLen) {
        this.sideLen = sideLen;
    }
}

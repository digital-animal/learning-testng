package com.zahid;

public class Rectangle {
    public double length;
    public double breadth;

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
    
    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }

    @Override
    public String toString() {
        return "Rectangle [breadth=" + breadth + ", length=" + length + "]";
    }
    
}

package com.company;

/**
 * Created by Lill on 8/5/16.
 */
public class Rectangle extends Shape  {

    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }

    @Override
    public int compareTo(Shape o)
    {
        if (o.area() == area())
            return 0;
        else if (o.area() > area())
            return 1;
        else
            return -1;
    }
}

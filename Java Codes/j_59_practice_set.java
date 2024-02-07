package com.company;

class cylinder {
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;  //(Math.PI for exact value)
    }

    public double Volume() {
        return 23.142 * radius * radius * height; //(Math.PI for exact value)
    }
}
    class rectangle{
        private int length;
        private int breadth;

        public rectangle() {
            this.length = 4;
            this.breadth = 5;

        }
        // For custom parameters,
        public rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }

public class j_59_practice_set {
    public static void main(String[] args) {
        //Problem 1: Create a class cylinder and use getters and setters to set its radius and height,

       /* cylinder myCylinder = new cylinder();
        myCylinder.setHeight(23);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(13);
        System.out.println(myCylinder.getRadius());

        */

        //Problem 2: Use Problem 1 to Calculate surface area and volume of the cylinder,

        /*
        cylinder myCylinder = new cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.Volume());

         */

        //Problem 3: Use constructor and repeat problem 1,

        /*
        cylinder myCylinder = new cylinder(9,12);
        //myCylinder.setHeight(23);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(13);
        System.out.println(myCylinder.getRadius());

         */

        //Problem 4: Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters,

        rectangle r = new rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());

    }
}

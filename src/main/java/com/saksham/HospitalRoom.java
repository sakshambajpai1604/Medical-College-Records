package com.saksham;

public class HospitalRoom {
    private double length;
    private double width;
    private String roomType;

    public void setDimensions(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            System.out.println("Error: Dimensions must be positive!");
        }
    }
    public void setRoomType(String roomType) { this.roomType = roomType; }
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public String getRoomType() { return roomType; }

    public double calculateArea() { return length * width; }
    public double calculatePerimeter() { return 2 * (length + width); }
    
    public void displayRoomInfo() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Area: " + calculateArea() + " sq meters");
        System.out.println("Perimeter: " + calculatePerimeter() + " meters");
        System.out.println("----------------------------");
    }
}
package encapsulation;

public class Rectangle {

    //declaring fields with private modifiers for data hiding
    private double length=4;
    private double width=5;

    //Constructors
    Rectangle(){}

    //getter methods
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    //setter methods
    public void setLength(double length){
        this.length=length;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public static void main(String[] args) {
        //rectangleObject creation
        Rectangle rectangleObject = new Rectangle();

        //Calling getter to display
        System.out.println("Before Change");
        System.out.println(rectangleObject.getLength());
        System.out.println(rectangleObject.getWidth());

        //Calling setter to modify
        rectangleObject.setLength(6);
        rectangleObject.setWidth(14);

        //Calling getter to display
        System.out.println("After Change");
        System.out.println(rectangleObject.getLength());
        System.out.println(rectangleObject.getWidth());
    }
}

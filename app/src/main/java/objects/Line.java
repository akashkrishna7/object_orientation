package objects;

public class Line {
    //States
    double length;
    double size;
    String color;

    //Constructor
    Line(double length, double size, String color)
    {
        this.color=color;
        this.length=length;
        this.size=size;

    }

    //behaviour
    public void drawSquare()
    {
        System.out.println("Square is made with 4 lines\n "+length+" as length\n"+color+" as color");

    }

    //main
    public static void main(String[] args) {
        Line lineObject = new Line(5, 2,"Red");
        lineObject.drawSquare();
    }

}

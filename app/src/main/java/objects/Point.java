package objects;

public class Point {

    //States
    String color;
    double size;

    //Constructor
    Point(String color, double size)
    {
        this.color=color;
        this.size=size;
    }

    //behaviour
    public void draw()
    {
        System.out.println("Can Draw");
    }

    public void write()
    {
        System.out.println("Can Write");
    }

    //main
    public static void main(String[] args) {
        //object creation
        Point pointObject = new Point("Blue", 10);

        //calling methods
        pointObject.draw();
        pointObject.write();
    }
}

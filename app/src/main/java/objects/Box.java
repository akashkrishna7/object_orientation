package objects;

public class Box {
    //States
    double length;
    double breadth;
    String color;
    int item=0;

    //Constructor
    Box(double length, double breadth, String color)
    {
        this.breadth=breadth;
        this.length=length;
        this.color=color;
        System.out.println("Data entered!");
    }

    //behaviours
    public double displayLength()
    {
        return length;
    }

    public void addItem()
    {
        item++;
        System.out.println("Item added!\nTotal items:"+item);

    }

    public static void main(String[] args) {
        Box boxObject = new Box(10,20,"Brown");
        boxObject.displayLength();
        boxObject.addItem();
        boxObject.addItem();
    }

}

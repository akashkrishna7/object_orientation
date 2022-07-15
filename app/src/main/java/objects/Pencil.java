package objects;

public class Pencil {

    //variables or states
    String brand;
    String color;
    double price;

    //constructors
    Pencil(String brand, String color, double price)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
        System.out.println("Inserted the states successfully!");
    }

    //Methods or behaviors
    public void write()
    {
        System.out.println("Pencil is writing.");
    }

    public void displayColor()
    {
        System.out.println("Pencil's color is "+color);
    }

    public void displayPrice()
    {
        System.out.println("Pencil's brand is "+brand);
        System.out.println("Pencil's price is "+price);
    }

    //main method
    public static void main(String[] args) {

        //Object creation for Pen
        Pencil pencilObject = new Pencil("Natraj", "Black", 01.50);

        //Calling behaviours
        pencilObject.displayColor();
        pencilObject.displayPrice();
        pencilObject.write();
    }

}

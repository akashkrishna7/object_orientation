package objects;

public class WhiteBoard {
    //States
    String dimension;
    String material;
    boolean magnetic;
    double price;
    String  color;

    //Constructor
    WhiteBoard(String dimension, String material, boolean magnetic, double price, String color){
        this.dimension=dimension;
        this.material=material;
        this.magnetic=magnetic;
        this.price=price;
        this.color=color;
    }

    //Behaviour
    public void draw(){
        System.out.println("We can draw on it!");
    }

    public void magneticDuster(){
        System.out.println("Duster sticks on it properly!");
    }

    public void displayDetails(){
        System.out.println("Dimension is "+dimension);
        System.out.println("Material is "+material);
        System.out.println("Is it magnetic? "+magnetic);
        System.out.println("Price "+price);
        System.out.println("Board color is "+color);
    }

    //main
    public static void main(String[] args) {
        WhiteBoard whiteBoardObject = new WhiteBoard("1.5 x 2","Aluminium", true,2000,"White");
        whiteBoardObject.displayDetails();
        whiteBoardObject.draw();
        whiteBoardObject.magneticDuster();
    }
}

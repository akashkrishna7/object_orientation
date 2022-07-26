package capstoneproject.fruitbowl;

public class Fruits {

    //States
     String fruitName;
     String fruitColor;
     String fruitType;
     String fruitSize;

    //no args constructor.
    public Fruits(){}

    //argument constructor.
    public Fruits(String fruitName, String fruitColor, String fruitType, String fruitSize){
        this.fruitName=fruitName;
        this.fruitColor=fruitColor;
        this.fruitType=fruitType;
        this.fruitSize=fruitSize;
    }

    @Override
    public String toString() {
        return "Name: "+ fruitName + ", Color: " + fruitColor + ", Type: " + fruitType + ", Size: " + fruitSize ;
    }
}

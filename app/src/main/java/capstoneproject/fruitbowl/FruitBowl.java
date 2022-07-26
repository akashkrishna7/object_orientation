package capstoneproject.fruitbowl;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitBowl implements Bowl {
    //Creating object for ArrayList.
    static ArrayList<Fruits> allFruits = new ArrayList<>();

    public static void main(String[] args) {



        //Scanner object creation.
        Scanner input = new Scanner(System.in);

        //Variable to use a condition in loop
        boolean isRunning=true;

        //while loop to take inputs from user.
        while (isRunning) {

            //Taking name of fruit
            System.out.println("Enter the name of the fruit: ");
            String name = input.next();

            //Taking color of fruit
            System.out.println("Enter the color of the fruit: ");
            String color = input.next();

            //Taking type of fruit
            System.out.println("Enter the type of the fruit(Pulpy, Drupe, Legume): ");
            String type = input.next();

            //Taking size of fruit
            System.out.println("Enter the size of the fruit(Small, Medium, Large): ");
            String size = input.next();

            //object reference for fruit type
            Fruits fruitObject = new Fruits(name, color, type, size);
            allFruits.add(fruitObject);

            //Statements to stop the loop
            System.out.println("-------------------------------------------------------");
            System.out.println("Enter N to exit and any alphabet to continue");
            String exitEntry = input.next();

            //Condition to stop loop
            if (exitEntry.equalsIgnoreCase("N")) {

                //to come out of loop
                break;

            }
        }
        //Fetching data from the allFruits ArrayList
        System.out.println("All Fruits ");
        allFruits.forEach(System.out::println);


        //calling sortBySize()
        FruitBowl fruitBowlObject = new FruitBowl();

        //fruitBowlObject.sortBySize(allFruits);
        fruitBowlObject.sortByType(allFruits);
    }

    //method to segregate fruits with their Size
    public void sortBySize(ArrayList<Fruits> allFruits){

        //Create list to hold as layers of the fruit bowl
        ArrayList<Fruits> firstLayer = new ArrayList<>();
        ArrayList<Fruits> secondLayer = new ArrayList<>();
        ArrayList<Fruits> thirdLayer = new ArrayList<>();



        //to sort according to size of fruit

        System.out.println("Sorting according to Size");
        for (Fruits fruitBySize : allFruits) {
            if (fruitBySize.fruitSize.equalsIgnoreCase("Small")) {
                firstLayer.add(fruitBySize);
            }
            else if (fruitBySize.fruitSize.equalsIgnoreCase("Medium")) {

                secondLayer.add(fruitBySize);
            }
            else {
                thirdLayer.add(fruitBySize);
            }
        }//end of for

        //First layer.
        System.out.println("First Layer");
        System.out.println("________________________________________________");
        firstLayer.forEach(System.out::println);
        System.out.println("________________________________________________");

        //Second Layer.
        System.out.println("Second Layer");
        System.out.println("________________________________________________");
        secondLayer.forEach(System.out::println);
        System.out.println("________________________________________________");

        //Third Layer.
        System.out.println("Third Layer");
        System.out.println("________________________________________________");
        thirdLayer.forEach(System.out::println);
        System.out.println("________________________________________________");
    }

    //method to sort by type
    public void sortByType(ArrayList<Fruits> allFruits){

        //Create list to hold as layers of the fruit bowl
        ArrayList<Fruits> firstLayer = new ArrayList<>();
        ArrayList<Fruits> secondLayer = new ArrayList<>();
        ArrayList<Fruits> thirdLayer = new ArrayList<>();

        //Pulpy, Drupe, Legume
        //to sort according to type
        System.out.println("Sorting according to Type");
        for (Fruits fruitByType : allFruits) {
            if (fruitByType.fruitType.equalsIgnoreCase("Pulpy")) {
                firstLayer.add(fruitByType);
            }
            else if (fruitByType.fruitType.equalsIgnoreCase("Drupe")) {

                secondLayer.add(fruitByType);
            }
            else {
                thirdLayer.add(fruitByType);
            }
        }//end of for

        //First layer.
        System.out.println("Pulpy fruits");
        System.out.println("________________________________________________");
        firstLayer.forEach(System.out::println);
        System.out.println("________________________________________________");

        //Second Layer.
        System.out.println("Drupe Fruits");
        System.out.println("________________________________________________");
        secondLayer.forEach(System.out::println);
        System.out.println("________________________________________________");

        //Third Layer.
        System.out.println("Legume");
        System.out.println("________________________________________________");
        thirdLayer.forEach(System.out::println);
        System.out.println("________________________________________________");

    }

}

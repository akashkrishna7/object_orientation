package encapsulation;

import java.util.Scanner;

public class Boy {
    //age field
    private int age=5;

    //no argument constructor
    Boy(){}

    //getter method
    public int getAge(){
        return age;
    }

    //setter method
    public void setAge(int age){
        //if condition to make sure age is not getting decreased
        if(age>5){
            this.age=age;
        }
        else
            System.out.println("Age cannot be decreased");
    }

    public static void main(String[] args) {

        //scanner object creation
        Scanner scannerObject = new Scanner(System.in);

        //class object creation
        Boy boyObject = new Boy();

        //displaying with getter method
        System.out.println("Before Change");
        System.out.println(boyObject.getAge());

        //setting new age with setter method
        System.out.println("Enter new age");
        boyObject.setAge(scannerObject.nextInt());

        //displaying with getter method
        System.out.println("After Change");
        System.out.println(boyObject.getAge());


    }
}

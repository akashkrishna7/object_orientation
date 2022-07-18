package encapsulation;

public class Apples {

    //states
    private String type;
    private String taste;

    Apples(String type, String taste){
        this.type = type;
        this.taste = taste;
    }

    @Override
    public String toString(){
        return "Apple type is " + type + ". Apple taste is " + taste;
    }

    //main
    public static void main(String[] args) {
        Apples apple1 = new Apples("Granny smith","Tart");
        System.out.println(apple1);
        Apples apple2 = new Apples("Fuji","Sweet");
        System.out.println(apple2);
    }
}

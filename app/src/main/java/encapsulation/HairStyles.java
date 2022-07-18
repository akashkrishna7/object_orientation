package encapsulation;

public class HairStyles {

    //states
    private String hairColor;
    private String hairStyle;

    HairStyles(String hairColor,String hairStyle){
    this.hairColor = hairColor;
    this.hairStyle = hairStyle;
    }

    @Override
    public String toString(){
        return "Hair color is " +hairColor + ". Hair Style is " +hairStyle;
    }

    //main
    public static void main(String[] args) {
        HairStyles styles = new HairStyles("Black","Undercut");
        System.out.println(styles);
        HairStyles styles1 = new HairStyles("Brown","High fade");
        System.out.println(styles1);
    }
}

package encapsulation;

public class PumpkinSoup {
    //no argument constructor
    PumpkinSoup(){
        System.out.println("Starting to make Soup");
    }

    //method to heat oil
    public PumpkinSoup heatOil()
    {
        System.out.println("Heat oil in a large saucepan over medium heat ");
        return this;
    }

    //Adding onion and leek
    public PumpkinSoup addOnionAndLeek(int onion, int leek, int time1, int time2){
        System.out.printf("Add %s chopped onion and %s chopped leek and cook for %s to %s minutes until softened but not colored ",onion,leek,time1,time2);
        return this;
    }

    //Adding garlic and spices
    public PumpkinSoup addGarlicAndSpices(int timeInSeconds)
    {
        System.out.printf("Add garlic and spices and stir for %s seconds",timeInSeconds);
        return this;
    }

    //Adding main Ingredients
    public PumpkinSoup addMainIngredients(int pumpkin, int potato)
    {
        System.out.printf("Add %s chopped pumpkin, %s chopped potato and stock and bring to boil ",potato,pumpkin);
        return this;
    }

    //cook soup
    public PumpkinSoup cookSoup(int time)
    {
        System.out.printf("Turn heat low and simmer for %s minutes",time);
        return this;
    }

    //Cool and blend
    public PumpkinSoup coolAndBlend()
    {
        System.out.println("Cool the soup and blend by batch");
        return this;
    }

    //Reheat
    public PumpkinSoup reheat(){
        System.out.println("Reheat soup in a new pan");
        return this;
    }

    //Serve
    public PumpkinSoup serveHot()
    {
        System.out.println("Serve hot with seasoning on top");
        return this;
        //return new Soup();
    }
     //private static class Soup{}

    //main
    public static void main(String[] args) {
        PumpkinSoup soupMaker = new PumpkinSoup();

        //calling methods
        soupMaker
                .heatOil()
                .addOnionAndLeek(1,1,2,3)
                .addGarlicAndSpices(30)
                .addMainIngredients(1,1)
                .cookSoup(30)
                .coolAndBlend()
                .reheat()
                .serveHot();

    }


}

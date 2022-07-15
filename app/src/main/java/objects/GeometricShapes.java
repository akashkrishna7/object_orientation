package objects;

public class GeometricShapes {
    //States
    String shape;
    int noOfShapes=0;
    double sizeOfShape;


    //Constructors
    GeometricShapes(){}
    GeometricShapes(String shape, double sizeOfShape)
    {
        this.shape=shape;
        this.sizeOfShape=sizeOfShape;
    }

    //behaviours
    public void displayAll()
    {
        System.out.println("The Shape is "+shape);
        System.out.println("Size of Shape is "+sizeOfShape);
    }

    //main
    public static void main(String[] args) {
        GeometricShapes geometricShapesObject1 = new GeometricShapes("Square",5);
        GeometricShapes geometricShapesObject2 = new GeometricShapes("Circle",6);
        GeometricShapes geometricShapesObject3 = new GeometricShapes("Rectangle",5);
        geometricShapesObject1.displayAll();
        geometricShapesObject2.displayAll();
        geometricShapesObject3.displayAll();

    }
}

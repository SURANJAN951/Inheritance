package Inheritance;

class Car{
    public void Color(){
        System.out.println("my car color is black");
    }
    public void Speed(){
        System.out.println("Car speed is 200km/hr");
    }

}

class Tata extends Car {
    @Override
    // @Override=I am changing this method in my child.
    //This annotation is used to indicate that a method
    // in a subclass is overriding a method with the
    // same signature in its superclass. This
    // annotation is optional but highly recommended
    // because it helps improve code readability and
    // catch errors at compile-time if the method
    // signature in the superclass changes.
    public void Speed(){
        System.out.println("Car speed is 300km/hr");
    }
    //specialized method
    public void Cost(){
        System.out.println("The cose of my Car is 90L");
    }
}

public class Inherit {
    public static void main(String[] args) {
       //Tata T = new Tata(); tight coupling
        Car C = new Tata(); // Loose coupling
       C.Speed();
       //C.Cost(); Can't get called
        ((Tata) C).Cost();//down casting
        //Think example of Cigarette,papa,behaviour
    }
}

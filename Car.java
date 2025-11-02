public class Car{
    //variables
    int speed;
    String model;

    //Methods
    void start(){
        System.out.println("The car starts moving");
    }
    //Main method
    public static void main(String[] args){
        Car c= new Car();
        c.model="Honda";
        c.speed=180;
        c.start();
    }
}


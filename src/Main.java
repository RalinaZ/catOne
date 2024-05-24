public class Main{
    public static void main (String[] args) {
        Car newCar = new Car();
        newCar.build();
        newCar.buy();
    }
}
class Car {
    public void build(){

        System.out.println("You must build a new car");
    }
    public  void buy(){
        System.out.println("I will buy this car");
    }
    int carSpped;
}
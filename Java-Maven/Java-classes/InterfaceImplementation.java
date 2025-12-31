public class InterfaceImplementation implements Car {
    public void move() {
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {
        Car c1 = new Car() {
            public void move() {
                System.out.println("Anonymous class implementation of Interface ");
            }
        };

        Car c2 = () -> System.out.println("Anonymous Lambda expression");
        c1.move();
        c2.move();
    }
}

class Car {
    private String model = "Tesla";
    public void showModel() {
        System.out.println("Car model: " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.showModel();
    }
}

public class Driver2 {
    public static void main(String[] args) {
        HGV hgv = new HGV(400, 6, 2);
        Car car = new Car("Cargo?", 3, 1);

        System.out.println("HGV tax: " + hgv.calculateDuty());
        System.out.println("Car tax: " + car.calculateDuty());
    }
}

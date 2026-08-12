import java.util.Scanner;

public class TollBooth {

  
    record Vehicle(String number, String type) {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int bike = 0;
        int car = 0;
        int truck = 0;

        while (true) {
            System.out.print("Enter Vehicle Number (done to close): ");
            String number = sc.next();

           
            if (number.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Vehicle Type (bike/car/truck): ");
            String type = sc.next().toLowerCase();

            
            Vehicle v = new Vehicle(number, type);

           
            int toll = switch (v.type()) {
                case "bike" -> {
                    bike++;
                    yield 10;
                }
                case "car" -> {
                    car++;
                    yield 50;
                }
                case "truck" -> {
                    truck++;
                    yield 100;
                }
                default -> {
                    System.out.println("Invalid Vehicle Type!");
                    yield 0;
                }
            };

           System.out.println("Toll = " + toll);
            total += toll;
        }
        System.out.println("\n--- Summary Report ---");
        System.out.println("Total Bikes: " + bike);
        System.out.println("Total Cars: " + car);
        System.out.println("Total Trucks: " + truck);
        System.out.println("Grand Total Collected: " + total);
        
        sc.close();
    }
}

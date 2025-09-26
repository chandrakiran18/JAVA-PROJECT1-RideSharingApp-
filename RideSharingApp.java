import java.util.Scanner;

public class RideSharingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type (car/bike/auto): ");
        String vehicleType = sc.nextLine().toLowerCase();
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter number of passengers: ");
        int passengers = sc.nextInt();
        double fare = 0;
        if (vehicleType.equals("car")) {
            fare = distance * 10;
        } else if (vehicleType.equals("bike")) {
            fare = distance * 5;
        } else if (vehicleType.equals("auto")) {
            fare = distance * 8;
        } else {
            System.out.println("Invalid input. Please try again.");
            sc.close();
            return;
        }
        if (distance > 20) {
            fare = fare * 0.9;
        }
        double perPerson = fare / passengers;
        System.out.println("Total fare: " + fare+" Rupees");
        System.out.println("Fare per passenger: ₹" + perPerson);
        sc.close();
    }
}

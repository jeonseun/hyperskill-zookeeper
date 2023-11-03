import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationInDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInHotel = scanner.nextInt();

        int totalFoodCost = durationInDays * foodCostPerDay;
        int flightCost = oneWayFlightCost * 2;
        int hotelCost = costOfOneNightInHotel * (durationInDays - 1);
        System.out.println(totalFoodCost + flightCost + hotelCost);
    }
}
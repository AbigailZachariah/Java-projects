import java.util.Scanner;

public class temperatureConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        int choice;

        do {
            System.out.println("******Temperature Converter******");
            System.out.println("1.°C to °F");
            System.out.println("2.°F to °C");
            System.out.println("3.°C to K");
            System.out.println("4.K to °C");
            System.out.println("5.°F to K");
            System.out.println("6.K to °F");
            System.out.println("7.Exit");

            System.out.print("Enter a choice:");
            choice = sc.nextInt();

            if(choice==7) break;

            System.out.print("Enter the temperature: ");
            temp = sc.nextDouble();

            switch (choice) {
                case 1 -> {
                    newTemp = (temp * 9 / 5) + 32;
                    System.out.printf("Temperature:%.1f °F", newTemp);
                    System.out.println("\n");
                }
                case 2 -> {
                    newTemp = (temp - 32) * 5 / 9;
                    System.out.printf("Temperature:%.1f °C", newTemp);
                    System.out.println("\n");
                }
                case 3 -> {
                    newTemp = temp + 273.15;
                    System.out.printf("Temperature:%.1f K", newTemp);
                    System.out.println("\n");
                }
                case 4 -> {
                    newTemp = temp - 273.15;
                    System.out.printf("Temperature:%.1f °C", newTemp);
                    System.out.println("\n");
                }
                case 5 -> {
                    newTemp = (temp - 32) * 5 / 9 + 273.15;
                    System.out.printf("Temperature:%.1f K", newTemp);
                    System.out.println("\n");
                }
                case 6 -> {
                    newTemp = (temp - 273.15) * 9 / 5 + 32;
                    System.out.printf("Temperature:%.1f °F", newTemp);
                    System.out.println("\n");
                }
                default -> System.out.println("Enter number between 1 and 7!!");
            }
        } while (choice != 7);
        sc.close();

    }
}

import java.util.Scanner;
public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To Temperature Converter!");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number between 1 and 6.");
            return;
        }

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter temperature in Celsius: ");
                if (scanner.hasNextDouble()) {
                    double celsius = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            case 2 -> {
                System.out.print("Enter temperature in Fahrenheit: ");
                if (scanner.hasNextDouble()) {
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            case 3 -> {
                System.out.print("Enter temperature in Celsius: ");
                if (scanner.hasNextDouble()) {
                    double celsius = scanner.nextDouble();
                    System.out.println("Temperature in Kelvin: " + celsiusToKelvin(celsius));
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            case 4 -> {
                System.out.print("Enter temperature in Kelvin: ");
                if (scanner.hasNextDouble()) {
                    double kelvin = scanner.nextDouble();
                    System.out.println("Temperature in Celsius: " + kelvinToCelsius(kelvin));
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            case 5 -> {
                System.out.print("Enter temperature in Fahrenheit: ");
                if (scanner.hasNextDouble()) {
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(fahrenheit));
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            case 6 -> {
                System.out.print("Enter temperature in Kelvin: ");
                if (scanner.hasNextDouble()) {
                    double kelvin = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(kelvin));
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            default -> System.out.println("Invalid choice! Please enter a number between 1 and 6.");
        }
    }
}
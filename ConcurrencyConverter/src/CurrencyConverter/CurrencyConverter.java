package CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.print("Choose an option (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        
        double convertedAmount = 0.0;
        
        switch (choice) {
            case 1:
                convertedAmount = convertUsdToEur(amount);
                System.out.printf("%.2f USD = %.2f EUR%n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = convertEurToUsd(amount);
                System.out.printf("%.2f EUR = %.2f USD%n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
    
    public static double convertUsdToEur(double usd) {
        return usd * 0.85; // Example conversion rate
    }
    
    public static double convertEurToUsd(double eur) {
        return eur * 1.18; // Example conversion rate
    }
}


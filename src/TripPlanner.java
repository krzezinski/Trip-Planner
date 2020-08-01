import java.util.Scanner;

/**
 * Trip Planner
 *
 * @author  krzezinski
 * @version 1.0
 * @since   2020-07-22
 */

public class TripPlanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        userGreeting(input);
        printSeparator();
        travelTimeBudget(input);
        printSeparator();
        timeDifference(input);
        printSeparator();
        countryArea(input);
    }

    public static void printSeparator() {
        System.out.println("***********\n\n");
    }

    // Part 1
    public static void userGreeting(Scanner input){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String userName = input.nextLine();
        System.out.print("Nice to meet you " + userName + ", where are you traveling to? ");
        String userDestination = input.nextLine();
        System.out.println("Great! " + userDestination + " sounds like a great trip");
    }

    // Part 2
    public static void travelTimeBudget(Scanner input){
        final String localCurrencySymbol = "USD";
        System.out.print("How many days are you going to spend traveling? ");
        int daysTraveling = input.nextInt();
        System.out.print("How much money, in " + localCurrencySymbol + ", are you planning to spend on your trip? ");
        int moneyToSpent = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String destinationCurrencySymbol = input.next();
        System.out.print("How many " + destinationCurrencySymbol + " are in 1 " + localCurrencySymbol + "? ");
        double destinationCurrencyConversion = input.nextDouble();
        int hoursTraveling = daysTraveling * 24;
        int minutesTraveling = hoursTraveling * 60;
        System.out.println("If you are traveling for " + daysTraveling + " days that is the same as " + hoursTraveling + " hours or " + minutesTraveling + " minutes");
        double moneyToSpentDay = moneyToSpent / ((double)daysTraveling);
        System.out.println("\nIf you are going to spend $" + moneyToSpent + " " + localCurrencySymbol + " that means per day you can spend up to $" + moneyToSpentDay + " " + localCurrencySymbol);
        double moneyToSpentDestination = moneyToSpent * destinationCurrencyConversion;
        double moneyToSpentDestinationDay = moneyToSpentDestination / ((double)daysTraveling);
        System.out.println("Your total budget in " + destinationCurrencySymbol + " is " + roundNumbers(moneyToSpentDestination) + " " + destinationCurrencySymbol + ", which per day is " + roundNumbers(moneyToSpentDestinationDay) + " " + destinationCurrencySymbol);
    }

    // Part 3
    public static void timeDifference(Scanner input){
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDiffHours = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + (timeDiffHours + 24) % 24 + ":00 in your travel destination and when it is noon at home it will be " + (timeDiffHours + 12) % 24 + ":00");
    }

    // Part 4
    public static void countryArea(Scanner input){
        System.out.print("What is the square area of your destination country in km2? ");
        double areaKM2 = input.nextDouble();
        double areaMiles2 = areaKM2 * 0.386102;
        System.out.println("In miles2 that is " + roundNumbers(areaMiles2)); //1973000
    }

    // Part 5
    public static double roundNumbers(Double numToRound){
        return (Double)(((int)(numToRound * 100)) / 100.0);
    }

    // Part 6 - Hacker Problem - How Far?
    /**
     * For extra fun, calculate the distance between the user’s home and their travel destination using
     * the Haversine formula.
     * https://en.wikipedia.org/wiki/Haversine_formula
     * To do this you’ll need to ask the user to enter the longitude and latitude for their home and their
     * travel destination. You’ll also need to do some pretty fancy math.
     */
}
import java.util.Scanner;

public class SwitchExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Exercice 1 Determinate if the day is a weekday");
        System.out.print("Enter your day number from 0 to 6: ");
        System.out.println(isWeekday(userInput.nextInt()));
        System.out.println();

        System.out.println("Exercice 2 Determinate name of Month");
        System.out.print("Enter your month number from 0 to 12: ");
        System.out.println(determinateNameOfMonth(userInput.nextInt()));
        System.out.println();

        System.out.println("Exercice 3 : Determinate name of day");
        System.out.print("Enter a number of day from 0 to 6: ");
        System.out.println(determinateNameOfDay(userInput.nextInt()));
        System.out.println();
    }

    public static boolean isWeekday(int dayNumber)
    {
        return switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> true;
            default -> false;
        };
    }

    public static String determinateNameOfMonth(int monthNumber)
    {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "not a valid month number";
        };
    }

    public static String determinateNameOfDay (int dayNumber)
    {
        return switch (dayNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "not a valid day number";
        };
    }
}

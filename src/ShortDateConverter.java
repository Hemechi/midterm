import java.util.Scanner;

public class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDateStr = scanner.nextLine();

        int year = 0;
        int month = 0;
        int day = 0;

        // Extract year, month, and day from the short date
        int separatorIndex = shortDateStr.indexOf('-');
        if (separatorIndex != -1) {
            year = Integer.parseInt(shortDateStr.substring(0, separatorIndex));
            int secondSeparatorIndex = shortDateStr.indexOf('-', separatorIndex + 1);
            if (secondSeparatorIndex != -1) {
                month = Integer.parseInt(shortDateStr.substring(separatorIndex + 1, secondSeparatorIndex));
                day = Integer.parseInt(shortDateStr.substring(secondSeparatorIndex + 1));
            }
        }

        // Convert month number to month name
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid month number.");
                System.exit(0);
        }

        // Display the full date representation
        String fullDate = monthName + " " + day + ", " + year;
        System.out.println("Full date representation: " + fullDate);
    }
}
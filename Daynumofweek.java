import java.util.Scanner;
class DayOfWeek 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day name Monday : ");
        String day = scanner.nextLine();
        int dayNumber = 0;
        switch (day) 
        {
            case "monday":
                dayNumber = 1;
                break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber = 4;
                break;
            case "friday":
                dayNumber = 5;
                break;
            case "saturday":
                dayNumber = 6;
                break;
            case "sunday":
                dayNumber = 7;
                break;
            default:
                System.out.println("Invalid day name!");
                scanner.close();
                return;
        }
        System.out.println("Day number of " + " is '': " + dayNumber);
        scanner.close();
    }   
}

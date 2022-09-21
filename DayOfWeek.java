public class DayOfWeek {

    public static void main(String[] args) {

        int day = 4;
        String dayName = "";

        if (day == 1) {
            dayName = "Monday";
        }
        if (day == 2) {
            dayName = "Tuesday";
        }
        if (day == 3) {
            dayName = "Wednesday";
        }
        if (day == 4) {
            dayName = "Thursday";
        }
        if (day == 5) {
            dayName = "Friday";
        }
        if (day == 6) {
            dayName = "Saturday";
        }
        if (day == 7) {
            dayName = "Sunday";
        }

        System.out.println("The day is " + dayName);

    }
    
}

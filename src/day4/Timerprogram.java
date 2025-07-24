package day4;

public class Timerprogram {

    public static void main(String[] args) {
        String[] tasks = {
            "Doing breakfast",
            "Doing Java programs",
            "Doing Lunch",
            "Practice codes"
        };

        int[] times = {9, 11, 13, 15};
        String str = "";

        for (int i = 0; i < tasks.length; i++) {
            if (times[i] < 12) {
                str = "am";
            } else {
                str = "pm";
            }

            int displayTime = times[i] <= 12 ? times[i] : times[i] - 12;

            System.out.println("Now time is: " + displayTime + " " + str);
            System.out.println("So your task is: " + tasks[i]);
        }
    }
}

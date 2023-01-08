package ca.vanier;

public class ScoreManager {

    public static String execute(String[] args) {
        //Identify a variable to recieve a input number
        int num = Integer.parseInt(args[0]);

        //Condition, returns true / false if the score received is equal or greater than 6
        if (num >= 0 && num < 6) {
            return "True";
        }
        return "False";
    }

}

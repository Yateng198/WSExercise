package ca.vanier;

public class ScoreManager {

    public static String execute(String[] args) {
        //identify a variable to recieve a input number
        int num = Integer.parseInt(args[0]);

        //condition
        if (num >= 6) {
            return "true";
        }
        return "false";
    }

}

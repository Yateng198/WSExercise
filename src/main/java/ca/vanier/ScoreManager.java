package ca.vanier;

public class ScoreManager {

    public static String execute(String[] args) {

        int num = Integer.parseInt(args[0]);

        if (num >= 0 && num < 6) {
            return "true";
        }
        return "false";
    }

}

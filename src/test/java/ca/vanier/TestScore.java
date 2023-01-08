package ca.vanier;

import org.junit.Assert;
import org.junit.Test;

public class TestScore {
    //Test the execute method by hard coding a parameter
    @Test
    public void testExecute(){
        String[] args = {"4"};
        String result = ScoreManager.execute(args);
        //returns true / false if args[0] is equal or greater than 6
        //We are hard coding args[0] to be 4 which means result should be true as we expected in the Assert
        Assert.assertEquals("True", result);
        //Test pass will print this message
        System.out.println("Test pass!");

    }
}


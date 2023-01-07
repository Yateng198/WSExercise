package ca.vanier;

import org.junit.Assert;
import org.junit.Test;

public class TestScore {
    
    @Test
    public void testExecute(){
        String[] args = {"4"};
        String result = ScoreManager.execute(args);
        Assert.assertEquals("true", result);
        System.out.println("Test pass!");

    }
}


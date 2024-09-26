package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

//BalancedBracket test_balancedBracket = new BalancedBrackets("Launch[code]")   ;

    @Test
    public void emptyTest() {
        String message = "balanced brackets around characters returned true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBracketsTwo.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void noBrackets(){
        String testData = "sup";
        boolean result = BalancedBracketsTwo.hasBalancedBrackets(testData);
        assertTrue(result);
    }
    @Test
    public void oneBracket(){
        String testData = "[hi";
       // boolean result = BalancedBracketsTwo.hasBalancedBrackets(testData);
        assertFalse(BalancedBracketsTwo.hasBalancedBrackets(testData));
    }

}


//     * These strings have balanced brackets:
//        *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//        *
//        * While these do not:
//        *   "[LaunchCode", "Launch]Code[", "[", "]["
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
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
}

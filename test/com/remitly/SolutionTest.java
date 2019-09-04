package com.remitly;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

public class SolutionTest {

    @Test
    public void testBasicCaseFromQuestion() {
        Solution solution = new Solution(new Dictionary());

        // Positive case
        Assert.that(solution.renameThisMethodForYourAnswer("thisisawesome"), "Basic positive case from problem description should be true.");

        // Negative case
        Assert.that(!solution.renameThisMethodForYourAnswer("asdf"), "Basic negative case from problem description should be false.");
    }
}

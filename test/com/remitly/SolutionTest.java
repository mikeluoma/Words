package com.remitly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testBasicCaseFromQuestion() {
        Solution solution = new Solution(new Dictionary());

        // Positive case
        Assert.assertTrue("Basic positive case from problem description should be true.", solution.renameThisMethodForYourAnswer("thisisawesome"));

        // Negative case
        Assert.assertFalse("Basic negative case from problem description should be false.", solution.renameThisMethodForYourAnswer("asdf"));
    }
}

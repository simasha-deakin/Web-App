package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {
    
	@Test
	public void testTrueAdd() {
		Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	}

	@Test
    public void testTrueSubtract() {
        Assert.assertEquals(MathQuestionService.q2Subtraction("5", "3"), 2, 0);
    }

    @Test
    public void testAddZero() {
        Assert.assertEquals(MathQuestionService.q1Addition("0", "0"), 0, 0);
    }

    @Test
    public void testSubtractZero() {
        Assert.assertEquals(MathQuestionService.q2Subtraction("0", "0"), 0, 0);
    }

    @Test
    public void testAddNegativeNumbers() {
        Assert.assertEquals(MathQuestionService.q1Addition("-3", "5"), 2, 0);
    }    

    @Test
    public void testSubtractNegativeNumbers() {
        Assert.assertEquals(MathQuestionService.q2Subtraction("-3", "-5"), 2, 0);
    }

    @Test
    public void testAddLargeNumber() {
        Assert.assertEquals(MathQuestionService.q1Addition("1000000000", "2000000000"), 3000000000.0, 0);
    }

    @Test
    public void testSubtractLargeNumber() {
        Assert.assertEquals(MathQuestionService.q2Subtraction("2000000000", "1000000000"), 1000000000.0, 0);
    }

    @Test
    public void testTrueMultiplication() {
        Assert.assertEquals(MathQuestionService.q3Multiplication("3", "4"), 12, 0);
    }

    @Test
    public void testMultiplyZero() {
        Assert.assertEquals(MathQuestionService.q3Multiplication("0", "1000"), 0, 0);
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        Assert.assertEquals(MathQuestionService.q3Multiplication("-2", "-3"), 6, 0);
    }

}
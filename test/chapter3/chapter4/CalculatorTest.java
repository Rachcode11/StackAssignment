package chapter3.chapter4;

import Chapter4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
         calculator = new Calculator(23456,3000,5000,2000,7000);
    }

    @Test
    public void testCalculatorExists() {
        assertNotNull(calculator);
    }
    @Test
    public void testForAccountNo(){
        calculator.setAccountNo(23456);
        assertEquals(23456,calculator.getAccountNo());
    }
    @Test
    public void testForStartBalance(){
        calculator.setStartBalance(3000);
        assertEquals(3000,calculator.getStartBalance());
    }
    @Test
    public void testForCreditLimit(){
        calculator.setCreditLimit(5000);
        assertEquals(5000,calculator.getCreditLimit());
    }
    @Test
    public void testForTotalCharges(){
        calculator.setTotalCharges(2000);
        assertEquals(2000,calculator.getTotalCharges());
    }
    @Test
    public void testForTotalCredit(){
        calculator.setTotalCredit(7000);
        assertEquals(7000,calculator.getTotalCredit());
    }
}


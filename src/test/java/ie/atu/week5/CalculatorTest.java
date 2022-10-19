package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calculator();
    }

    @Test
    void addTest(){
        assertEquals(3, myCalc.add(1, 2));
    }

    @Test
    void SubtractTest(){
        assertEquals(3, myCalc.subtract(5, 2));
    }

    @AfterEach
    void tearDown() {

    }
}
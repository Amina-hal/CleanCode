package com.capgemini.cleancode.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdditionCalculator(){
        //Arrange
        Addition addition = new Addition();
        addition.setLeft(3);
        addition.setRight(4);
        System.out.print("test jenkins");

        //Acte
        Calculator calculator = new Calculator();
        calculator.calculate(addition);

        //Assert
       assertEquals(7, addition.getResult(), 0);




    }
}

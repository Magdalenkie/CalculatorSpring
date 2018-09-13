package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double addResult = calculator.add(5, 5);
        double subResult = calculator.sub(11, 2);
        double mulResult = calculator.mul(1, 1);
        double divResult = calculator.div(15, 3);

        //then
        Assert.assertEquals(10, addResult, 0.01);
        Assert.assertEquals(9, subResult, 0.01);
        Assert.assertEquals(1, mulResult, 0.01);
        Assert.assertEquals(5, divResult, 0.01);
    }
}


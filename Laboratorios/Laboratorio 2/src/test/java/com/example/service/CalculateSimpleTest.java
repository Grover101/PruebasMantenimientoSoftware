package com.example.service;

import static org.junit.Assert.assertEquals;

import com.example.model.OperationModel;

import org.junit.Test;

public class CalculateSimpleTest {

    CalculateSimple calc = new CalculateSimple();

    @Test
    public void testAdd() {
        OperationModel operation = new OperationModel(5, 3);
        int esperado = 8;
        int result = calc.add(operation);
        assertEquals(esperado, result);
    }

    @Test
    public void testSubtract() {
        OperationModel operation = new OperationModel(8, 5);
        int esperado = 3;
        int result = calc.subtract(operation);
        assertEquals(esperado, result);
    }

    @Test
    public void testMultiply() {
        OperationModel operation = new OperationModel(4, 9);
        int esperado = 36;
        int result = calc.multiply(operation);
        assertEquals(esperado, result);
    }

    @Test
    public void testDivide() {
        OperationModel operation = new OperationModel(10, 2);
        double esperado = 5;
        double result = calc.divide(operation);
        assertEquals(esperado, result, 0.0);
    }

    @Test
    public void testFactorial() {
        OperationModel operation = new OperationModel(5);
        int esperado = 120;
        int result = calc.factorial(operation);
        assertEquals(esperado, result);
    }

    @Test
    public void testFibonacci() {
        OperationModel operation = new OperationModel(8);
        int esperado = 21;
        int result = calc.fibonacci(operation);
        assertEquals(esperado, result);
    }

    @Test
    public void testSqrt() {
        OperationModel operation = new OperationModel(3);
        double esperado = 1.73;
        double result = calc.sqrt(operation);
        assertEquals(esperado, result, 0.9);
    }

    @Test
    public void testPower() {
        OperationModel operation = new OperationModel(8);
        int esperado = 64;
        int result = calc.power(operation);
        assertEquals(esperado, result);
    }

    @Test
    public void testClearSimple() {
        OperationModel operation = new OperationModel();
        int esperado = 0;
        OperationModel result = calc.clearSimple(operation);
        assertEquals(esperado, result.getA() + result.getB());
    }

    @Test
    public void testClearAdvanced() {
        OperationModel operation = new OperationModel();
        int esperado = 0;
        OperationModel result = calc.clearAdvanced(operation);
        assertEquals(esperado, result.getC());
    }
}

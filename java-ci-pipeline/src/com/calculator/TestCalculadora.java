package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCalculadora {

    private Calculadora calculadora;

    public void escenario(){
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar(){
        escenario();
        assertTrue(calculadora.sumar(2,2)==(2+2));
        assertEquals(3.0,calculadora.sumar(2,1));
    }

    @Test
    public void testRestar(){
        escenario();
        assertTrue(calculadora.restar(2,2)==(2-2));
        assertEquals(3.0,calculadora.restar(5,2), 0.001);
    }

    @Test
    public void testMultiplicar(){
        escenario();
        assertTrue(calculadora.multiplicar(2,2)==(2*2));
        assertEquals(6.0,calculadora.multiplicar(2,3));
    }

    @Test
    public void testDividir(){
        escenario();
        assertTrue(calculadora.dividir(2,2)==(2/2));
        assertEquals(5.0,calculadora.dividir(10,2));
    }
}
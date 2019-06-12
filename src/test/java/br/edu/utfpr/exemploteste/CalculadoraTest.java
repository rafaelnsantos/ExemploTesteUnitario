package br.edu.utfpr.exemploteste;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora calculadora;
    
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }
    
     @Test
     public void somaTest() {
         assertEquals(4, calculadora.somar(2, 2), 0.1);
     }
     
     @Test
     public void subtrairTest() {
         assertEquals(5, calculadora.subtrair(10, 5), 0.1);
     }
     
     @Test
     public void multiplicarTest() {
         assertEquals(12, calculadora.multiplicar(3, 4), 0.1);
     }
     
     @Test public void dividirTest() {
        try {
            assertEquals(5, calculadora.dividir(10, 2), 0.1);
        } catch (DivisaoPorZeroException ex) {
            Logger.getLogger(CalculadoraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     @Test(expected = DivisaoPorZeroException.class)
     public void divisaoPorZeroTest() throws DivisaoPorZeroException{
        calculadora.dividir(4, 0);
     }
}

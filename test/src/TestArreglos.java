//Clase de pruebas para mi clase Arreglos.java

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestArreglos {
    
    //Prueba de la funcion mayor
    @Test
    public void testMayorAlInicio() {
        int[] arreglo = {9, 8, 7};
        int resultado = Arreglos.mayor(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMayorEnMedio() {
        int[] arreglo = { 8,9, 7};
        int resultado = Arreglos.mayor(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

     @Test
    public void testMayorAlFinal() {
        int[] arreglo = { 8,7,9};
        int resultado = Arreglos.mayor(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMayorNegativos() {
        int[] arreglo = { -8,-7,-9};
        int resultado = Arreglos.mayor(arreglo);
        int esperado = -7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMayorArreglconCeros() {
        int[] arreglo = { 8,-7,0};
        int resultado = Arreglos.mayor(arreglo);
        int esperado = 8;
        assertEquals(esperado, resultado);
    }

     @Test
    public void testMayorArreglconUnElemento() {
        int[] arreglo = {4};
        int resultado = Arreglos.mayor(arreglo);
        int esperado = 4;
        assertEquals(esperado, resultado);
    }

        @Test
    public void testMayorArregloVacio() {
        int[] arreglo = {};
        int resultado = Arreglos.mayor(arreglo);
        int esperado = -2147483648;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorAlInicio() {
        int[] arreglo = { 7, 8, 9};
        int resultado = Arreglos.menor(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorEnMedio() {
        int[] arreglo = { 9, 7, 8};
        int resultado = Arreglos.menor(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorAlFinal() {
        int[] arreglo = { 9, 8, 7};
        int resultado = Arreglos.menor(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorNegativos() {
        int[] arreglo = { -9, -7, -8};
        int resultado = Arreglos.menor(arreglo);
        int esperado = -9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorArregloConCeros() {
        int[] arreglo = { 0, -7, 8};
        int resultado = Arreglos.menor(arreglo);
        int esperado = -7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorArregloConUnElemento() {
        int[] arreglo = { 4};
        int resultado = Arreglos.menor(arreglo);
        int esperado = 4;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorArregloVacio() {
        int[] arreglo = {};
        int resultado = Arreglos.menor(arreglo);
        int esperado = 2147483647;
        assertEquals(esperado, resultado);
    }
}
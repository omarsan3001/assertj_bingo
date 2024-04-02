package org.iesvdm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.iesvdm.UtilesArrays.*;
import static org.junit.jupiter.api.Assertions.*;
public class UtilesArraysTest {

    @Test
    public void testLimpiar() {
        int[] array = {1, 2, 3};

        int[] nuevo = limpiar();

        assertArrayEquals(new int[]{}, nuevo);
    }

    @Test
    public void testRellenar() {
        int[] array = {1, 2, 3};
        int numeroElementos = 5;

        int[] nuevo = rellenar(array, numeroElementos);

        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nuevo);
    }
    @Test
    public void testRellenarConValor() {
        int[] array = {1, 2, 3};
        int numeroElementos = 2;
        int valor = 7;

        int[] nuevo = rellenar(array, numeroElementos, valor);

        assertArrayEquals(new int[]{7, 7}, nuevo);
    }

    @Test
    public void testInsertarAlFinal() {
        int[] array = {1, 2, 3};
        int elemento = 4;

        int[] nuevo = insertarAlFinal(array, elemento);

        assertArrayEquals(new int[]{1, 2, 3, 4}, nuevo);
    }

    @Test
    public void testInsertarAlPrincipio() {
        int[] array = {1, 2, 3};
        int elemento = 0;

        int[] nuevo = insertarAlPrincipio(array, elemento);

        assertArrayEquals(new int[]{0, 1, 2, 3}, nuevo);
    }

    @Test
    public void testInsertarEnPosicion() {
        int[] array = {1, 2, 3};
        int elemento = 4;
        int posicion = 1;

        int[] nuevo = insertarEnPosicion(array, elemento, posicion);

        assertArrayEquals(new int[]{1, 4, 2, 3}, nuevo);
    }

    @Test
    public void testInsertarEnMedio() {
        int[] array = {1, 3, 5};
        int elemento = 4;

        int[] nuevo = insertarOrdenado(array, elemento);

        assertArrayEquals(new int[]{1, 3, 4, 5}, nuevo);
    }

    @Test
    public void testEliminarUltimo() {
        int[] array = {1, 2, 3, 4};
        int[] esperado = {1, 2, 3};

        int[] nuevo = eliminarUltimo(array);

        assertArrayEquals(esperado, nuevo);
    }

    @Test
    public void testEliminarPrimero() {
        int[] array = {1, 2, 3, 4};
        int[] esperado = {2, 3,4};

        int[] nuevo = eliminarPrimero(array);

        assertArrayEquals(esperado, nuevo);
    }

    @Test
    public void testEliminarPosicion() {
        int posicion = 1;
        int[] array = {1, 2, 3, 4};
        int[] esperado = {1, 3,4};

        int[] nuevo = eliminarPosicion(array,posicion);

        assertArrayEquals(esperado, nuevo);
    }

    @Test
    public void testEliminar() {
        int elemento = 1;
        int[] array = {1, 1, 3, 4};
        int[] esperado = {3,4};

        int[] nuevo = eliminar(array,elemento);

        assertArrayEquals(esperado, nuevo);
    }

    @Test
    public void testOrdenar() {
        int[] array = {3, 1, 4, 2};
        int[] esperado = {1, 2, 3, 4};

        ordenar(array);

        assertArrayEquals(esperado, array);
    }

    @Test
    public void testDesordenar() {
        int[] array = {1, 2, 3, 4, 5};
        int[] copiaOriginal = Arrays.copyOf(array, array.length);
        desordenar(array);

        assertNotEquals(copiaOriginal, array);
    }

    @Test
    public void testInvertir() {
        int[] array = {1, 2, 3, 4, 5};
        int[] esperado = {5, 4, 3, 2, 1};

        int[] nuevo = invertir(array);

        assertArrayEquals(esperado, nuevo);
    }

    @Test
    public void testImprimir(){
        int[] array = {1, 2, 3, 4, 5};
        int[] copiaOriginal = Arrays.copyOf(array, array.length);
        imprimir(array);
        assertArrayEquals(array, copiaOriginal);
    }

    @Test
    public void testEstaOrdenado(){
        int[] array = {1, 2, 3, 4, 5};

        assertTrue(estaOrdenado(array));
    }

    @Test
    public void testBuscarElemento() {
        int[] array = {1, 2, 3, 4, 5};
        int elemento = 3;
        int esperado = 2;

        int posicion = buscar(array, elemento);

        assertEquals(esperado, posicion);
    }

    @Test
    public void testPartirPor() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicionInicio = 2;
        int posicionCorte = 7;
        int[] esperado = {3, 4, 5, 6, 7};

        int[] nuevo = partirPor(array, posicionInicio, posicionCorte);

        assertArrayEquals(esperado, nuevo);
    }

    @Test
    public void testSonIguales() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        assertTrue(sonIguales(array1, array2));
    }

    @Test
    public void testElementosIguales() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int posicionAComparar = 2;

        boolean iguales = elementosIguales(array1, array2, posicionAComparar);

        assertTrue(iguales);
    }

    @Test
    public void testConcatenarArraysCorrectos() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] esperado = {1, 2, 3, 4, 5, 6};

        int[] nuevo = concatenarArrays(array1, array2);

        assertArrayEquals(esperado, nuevo);
    }

}

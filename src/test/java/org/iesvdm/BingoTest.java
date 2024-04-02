package org.iesvdm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.iesvdm.Bingo.*;
import static org.junit.jupiter.api.Assertions.*;
public class BingoTest {
    @Test
    public void testRellenarNumerosCarton() {
        int[][] carton = new int[9][3];

        rellenarNumerosCarton(carton);

        for (int i = 0; i < carton.length; i++) {

            for (int j = 0; j < carton[i].length; j++) {
                    assertTrue(carton[i][j] > 0);
            }
        }
    }
    @Test
    public void ponerBlancosTest(){
        int[][] carton = new int[9][3];

        ponerBlancos(carton);

        boolean hayBlancos = false;
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] == -1) {
                    hayBlancos = true;
                    break;
                }
            }
        }

        assertTrue(hayBlancos);
    }

    @Test
    public void testBuscarFila() {
        int[][] arrayBi = new int[3][3];
        arrayBi[0][0] = -1;

        boolean esta = buscarFila(arrayBi, 0, 0);

        assertTrue(esta);
    }

    @Test
    public void testBuscarColumnas() {
        int[][] arrayBi = new int[3][3];
        arrayBi[0][0] = -1;
        arrayBi[1][0] = -1;

        boolean esta2Veces = buscarColumna(arrayBi, 0);

        assertTrue(esta2Veces);
    }

    @Test
    public void testBuscarValorRepetido() {
        int[] array = {1, 2, 3, 4, 2};
        int elemento = 2;

        boolean esta = buscarValorRepetido(array, elemento);

        assertTrue(esta);
    }

    @Test
    public void testPintarCarton() {
        int[][] carton = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] bolas = {1, 5, 9};

        int aciertos = pintarCarton(carton, bolas);

        assertEquals(3, aciertos);
    }

    @Test
    public void testInsertarAlFinal() {
        int[] array = {1, 2, 3};
        int elemento = 4;

        int[] nuevoArray = insertarAlFinal(array, elemento);

        assertArrayEquals(new int[]{1, 2, 3, 4}, nuevoArray);
    }

    @Test
    public void testOrdenar() {
        int[] array = {3, 1, 4, 2};

        int[] ordenado = ordenar(array);

        assertArrayEquals(new int[]{1, 2, 3, 4}, ordenado);
    }

}

package Ordenacao;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] v){
        int aux;
        int j;
        for (int i = 1; i < v.length; i++) {
            aux = v[i];
            j = i-1;
            while (j >= 0 && v[j] > aux) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = aux;
        }
    }
    public static void main(String[] args) {
        int[] vetor = new int[100000];
        for(int i = 0; i < 100000; i++){
            vetor[i] = 100000 - i;
        }
        long tempo = System.currentTimeMillis();
        sort(vetor);
        for(int i : vetor){
            System.out.print(i + " ");
        }
        System.out.println();
        long diferenca = System.currentTimeMillis() - tempo;
        System.out.println(diferenca+ "ms");
    }
}

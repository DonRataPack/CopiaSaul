package ejercicios_aleatorios.max_number;
import java.util.*;
public class MaxNumber {
    public static void main(String[] args) {
        OptionalDouble numMax = null , numMin = null;
        double numeros [] = new double[10];

        for (int i = 0; i < numeros.length ; i++) {
            numeros [i] = (short) (Math.random() * 1000);
            numMax = Arrays.stream(numeros).max();
            numMin = Arrays.stream(numeros).min();
        }
        System.out.println("Valor maximo: "+ numMax);
        System.out.println("Valor minimo: "+ numMin);
    }
}

package ejercicios_aleatorios_test.desplazamiento_y_distancia_test;

import ejercicios_aleatorios.desplazamiento_y_distancia.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test (expected = Exception.class)
    public void should_return_an_exception_when_the_array_is_empty(){
        int[] arrayPosition = {2, 7, 11, 15};
    }
}

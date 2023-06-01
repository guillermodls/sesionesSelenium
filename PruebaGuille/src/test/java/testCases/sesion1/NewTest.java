package testCases.sesion1;

import testCases.sesion2.ExplicacionClases;

import java.util.ArrayList;
import java.util.List;

public class NewTest {
    public static void main(String[] args) {
        int limit = 0;
       /* while (limit <5){
            System.out.println(limit);
            limit++;
        }*/
//        int i;
//
//        for (i=0; i <10 ; i++){
//            System.out.println(i);
//        }
//
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);

        for (int elemento: listaNumeros) {
            System.out.println(elemento);
        }



        System.out.println("lala");

    }
}

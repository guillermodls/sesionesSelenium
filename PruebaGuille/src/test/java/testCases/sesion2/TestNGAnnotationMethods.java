package testCases.sesion2;

import org.testng.annotations.Test;

public class TestNGAnnotationMethods extends TestNGBaseClass{

    @Test
    public void miTest1(){
        //Esto se ejecuta segundo
        System.out.println("Estoy ejecutando el test case 1");
    }

    @Test
    public void miTest2(){
        //Esto se ejecuta segundo
        System.out.println("Estoy ejecutando el test case 2");
    }

    @Test
    public void miTest3(){
        //Esto se ejecuta segundo
        System.out.println("Estoy ejecutando el test case 3");
    }

}

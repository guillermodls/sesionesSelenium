package testCases.sesion2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNGBaseClass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Estoy ejecutando el BeforeMethod de la clase base");
    }

    @AfterMethod
    public void afterMethod(){
        //Esto se ejecuta tercero
        System.out.println("Estoy ejecutando el after Method de la clase base");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Estoy ejecutando el before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Estoy ejecutando el after class");
    }
}

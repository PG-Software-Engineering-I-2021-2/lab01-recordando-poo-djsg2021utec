package cs.ing.software.lab1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Labo1Test {
    @Test
    public void Test01(){
        Automovil car1= new Automovil( 10, 0.9, 100);
        Assert.assertEquals( car1.conduccion(4),"Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible");
    }
    @Test
    public void Test02(){
        Automovil car2 = new Automovil(10, 0.9, 100);
        Assert.assertEquals( car2.conduccion(12),"Vehiculo necesita reabastecimiento de combustible");
    }
    @Test
    public void Test03(){
        Automovil car3 = new Automovil(10, 0.9, 100);
        Assert.assertEquals( car3.conduccion(6),"Vehiculo viajo 6.0 km y aun tiene 4.60 de combustible");
    }
    @Test
    public void Test05(){
        Camion cam1 = new Camion(10,1.6,100);
        Assert.assertEquals( cam1.conduccion(4),"Camion viajo 4.0 km y aun tiene 3.60 de combustible");
    }
    @Test
    public void Test06(){
        Camion cam01  = new Camion(20,1.6,100);
        Assert.assertEquals( cam01 .conduccion(8),"Camion viajo 8.0 km y aun tiene 7.20 de combustible");
    }
    @Test
    public void Test07(){
        Camion cam02  = new Camion(10, 1.6, 100);
        Assert.assertEquals( cam02 .conduccion(10),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test08(){
        Camion cam03  = new Camion(5, 1.6, 100);
        Assert.assertEquals( cam03.conduccion(1),"Camion viajo 1.0 km y aun tiene 3.40 de combustible");
    }
    @Test
    public void Test09(){
        Camion cam04  = new Camion(40, 1.6, 105);
        Assert.assertEquals( cam04 .conduccion(100),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test10(){
        Camion cam05 = new Camion(40,1.6,150);
        Assert.assertEquals( cam05 .conduccion(100),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test12() {
        Automovil auto3 = new Automovil(25.8,0.91,105.6);
        Assert.assertEquals(auto3.conduccion(4),"Vehiculo viajo 4.0 km y aun tiene 22.16 de combustible");
    }
    @Test
    public void Test13() {
        Automovil auto4 = new Automovil(25.8,1.1,105.6);
        Assert.assertEquals(auto4.conduccion(7.9),"Vehiculo viajo 7.9 km y aun tiene 17.11 de combustible");

    }
    @Test
    public void Test14() {
        Automovil auto5 = new Automovil(8.9,0.9,120);
        Assert.assertEquals(auto5.conduccion(10.6),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test15() {
        Automovil auto6 = new Automovil(50.5,0.91,105.6);
        Assert.assertEquals(auto6.conduccion(20.3),"Vehiculo viajo 20.3 km y aun tiene 32.03 de combustible");

    }
    @Test
    public void Test16() {
        Automovil auto6 = new Automovil(50.5,0.91,105.6);
        Assert.assertEquals(auto6.conduccion(100),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test17() {
        Automovil auto7 = new Automovil(100,0.78,105.6);
        Assert.assertEquals(auto7.conduccion(2),"Vehiculo viajo 2.0 km y aun tiene 98.44 de combustible");

    }
    @Test
    public void Test18() {
        Automovil auto8 = new Automovil(50.5,0.78,105.6);
        Assert.assertEquals(auto8.abastecer(20.8),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test19() {
        Camion cam06 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam06.abastecer(14.5),"La cantidad de combustible del camion es: 64.275");

    }
    @Test
    public void Test20() {
        Camion cam07 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam07.abastecer(100),"Camion no se puede reabastecer el tanque, esta lleno");

    }
    @Test
    public void Test21() {
        Camion cam08 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam08.abastecer(5.5),"La cantidad de combustible del camion es: 55.725");

    }
    @Test
    public void Test22() {
        Camion cam09 = new Camion(50.5,0.78,105.6);
        Assert.assertEquals(cam09.abastecer(5.5),"La cantidad de combustible del camion es: 55.725");

    }
    @Test
    public void Test23() {
        Camion cam10 = new Camion(50.5,1.7,105.6);
        Assert.assertEquals(cam10.abastecer(10),"La cantidad de combustible del camion es: 60.0");

    }
    @Test
    public void Test24() {
        Automovil auto09 = new Automovil(50.5,0.88,105.6);
        Assert.assertEquals(auto09.abastecer(5.5),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test25() {
        Automovil auto10 = new Automovil(50.5,0.98,105.6);
        Assert.assertEquals(auto10.abastecer(6.78),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test26() {
        Camion cam11 = new Camion(50.5,1.6,50);
        Assert.assertEquals(cam11.abastecer(5.5),"Camion no se puede reabastecer el tanque, esta lleno");

    }@Test
    public void Test27() {
        Automovil auto11 = new Automovil(50.5,0.78,105.6);
        Assert.assertEquals(auto11.abastecer(5.5),"La cantidad de combustible del vehiculo es: 101.0");

    }@Test
    public void Test28() {
        Automovil auto12 = new Automovil(10,0.78,105.6);
        Assert.assertEquals(auto12.abastecer(30),"La cantidad de combustible del vehiculo es: 20.0");

    }@Test
    public void Test29() {
        Automovil auto13 = new Automovil(50.5,0.78,105.6);
        Assert.assertEquals(auto13.abastecer(5.5),"La cantidad de combustible del vehiculo es: 101.0");

    }
    @Test
    public void Test30() {
        Automovil auto14 = new Automovil(50.5,0.78,98.6);
        Assert.assertEquals(auto14.conduccion(8.6),"Vehiculo viajo 8.6 km y aun tiene 43.79 de combustible");

    }




    //Auto 3

    //Auto 3



}

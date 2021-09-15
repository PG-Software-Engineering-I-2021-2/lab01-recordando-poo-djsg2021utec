package cs.ing.software.lab1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Labo1Test {
    @Test
    public void Test01(){
        Automovil car1= new Automovil( 10, 0.9, 100);
        Assert.assertEquals( car1.fuelCantidad(4),"Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible");
    }
    @Test
    public void Test02(){
        Automovil car2 = new Automovil(10, 0.9, 100);
        Assert.assertEquals( car2.fuelCantidad(12),"Vehiculo necesita reabastecimiento de combustible");
    }
    @Test
    public void Test03(){
        Automovil car3 = new Automovil(10, 0.9, 100);
        Assert.assertEquals( car3.fuelCantidad(6),"Vehiculo viajo 6.0 km y aun tiene 4.60 de combustible");
    }
    @Test
    public void Test05(){
        Camion cam1 = new Camion(10,1.6,100);
        Assert.assertEquals( cam1.fuelCantidad(4),"Camion viajo 4.0 km y aun tiene 3.60 de combustible");
    }
    @Test
    public void Test06(){
        Camion cam01  = new Camion(20,1.6,100);
        Assert.assertEquals( cam01 .fuelCantidad(8),"Camion viajo 8.0 km y aun tiene 7.20 de combustible");
    }
    @Test
    public void Test07(){
        Camion cam02  = new Camion(10, 1.6, 100);
        Assert.assertEquals( cam02 .fuelCantidad(10),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test08(){
        Camion cam03  = new Camion(5, 1.6, 100);
        Assert.assertEquals( cam03.fuelCantidad(1),"Camion viajo 1.0 km y aun tiene 3.40 de combustible");
    }
    @Test
    public void Test09(){
        Camion cam04  = new Camion(40, 1.6, 105);
        Assert.assertEquals( cam04 .fuelCantidad(100),"Camion necesita reabastecimiento de combustible");
    }
    @Test
    public void Test10(){
        Camion cam05 = new Camion(40,1.6,150);
        Assert.assertEquals( cam05 .fuelCantidad(100),"Camion necesita reabastecimiento de combustible");
    }



}

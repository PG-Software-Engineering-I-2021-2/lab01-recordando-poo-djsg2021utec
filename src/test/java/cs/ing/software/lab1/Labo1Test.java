package cs.ing.software.lab1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Labo1Test {
    @Test
    public void Test01(){
        Automovil car1= new Automovil( 0.9, 100, 10);
        Assert.assertEquals( car1.fuelCantidad(4),"El automovil viajó 4.0 km y aún tiene 6.40 de combustible");
    }
    @Test
    public void Test02(){
        Automovil car2 = new Automovil(0.9, 100, 10);
        Assert.assertEquals( car2.fuelCantidad(12),"El automovil necesita reabastecimiento de combustible");
    }
    @Test
    public void Test03(){
        Automovil car3 = new Automovil(0.9, 100, 10);
        Assert.assertEquals( car3.fuelCantidad(6),"El automovil viajó 6.0 km y aún tiene 4.60 de combustible");
    }
    @Test
    public void Test04(){
        Camion cam1 = new Camion(1.6, 100, 10);
        Assert.assertEquals( cam1.fuelCantidad(4),"El camion viajó 4.0 km y aún tiene 3.60 de combustible");
    }


}

package cs.ing.software.lab1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Labo1Test {
    @Test
    public void Test01(){
        Automovil toyota= new Automovil( 0.9, 100, 10);
        Assert.assertEquals( toyota.conduccion(4),"El automovil viajó 4.0 km y aún tiene 6.40 de combustible");
    }
    @Test
    public void Test02(){
        Automovil carro1 = new Automovil(10.0,100.0,1.9);
        Assert.assertEquals( carro1.conduccion(6.0),"Vehiculo viajó 4.0 y aún tiene 6.40 de combustible");
    }
    @Test
    public void Test03(){
        Automovil carro1 = new Automovil(10.0,100.0,0.9);
        Assert.assertEquals( carro1.conduccion(3.0),"Vehiculo viajó 4.0 y aún tiene 6.40 de combustible");
    }


}

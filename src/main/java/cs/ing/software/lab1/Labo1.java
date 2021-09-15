package cs.ing.software.lab1;
import java.util.logging.Logger;



public class Labo1 {
    static final Logger logger = Logger.getLogger(Labo1.class.getName());
    static double consumoVehiculo = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadTotal = 100;
    static double fuelCantidad = 10;
    public static void main(String[ ] args) {



//Auto 1
        Automovil toyota = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        logger.info(toyota.fuelCantidad(4));

//Auto 2
        Automovil ford = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        logger.info(ford.fuelCantidad(12));

//Auto 3

//Camion 1
        Camion cam01 = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        logger.info(cam01.fuelCantidad(4));
//Camion 2
        Camion cam02 = new Camion(20,consumoCamion,capacidadTotal);
        logger.info(cam02.fuelCantidad(8));
//Camion 3
        Camion cam03 = new Camion(10,consumoCamion,capacidadTotal);
        logger.info(cam03.fuelCantidad(10));
//Camion 4
        Camion cam04 = new Camion(5,consumoCamion,capacidadTotal);
        logger.info(cam04.fuelCantidad(1));
//Camion 5
        Camion cam05 = new Camion(40,consumoCamion,105);
        logger.info(cam05.fuelCantidad(100));
    }
}

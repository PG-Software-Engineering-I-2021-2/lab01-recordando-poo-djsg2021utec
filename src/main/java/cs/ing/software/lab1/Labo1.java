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
        Automovil auto1 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        logger.info(auto1.conduccion(4));

//Auto 2
        Automovil auto2 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        logger.info(auto2.conduccion(12));

//Auto 3
        Automovil auto3 = new Automovil(25.8,0.91,105.6);
        logger.info(auto3.conduccion(4));
//Auto 3
        Automovil auto4 = new Automovil(25.8,1.1,105.6);
        logger.info(auto4.conduccion(7.9));

    }
}

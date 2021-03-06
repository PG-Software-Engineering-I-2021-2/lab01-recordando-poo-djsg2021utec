package cs.ing.software.lab1;
import java.util.logging.Logger;



public class Labo1 {
    static final Logger logger = Logger.getLogger(Labo1.class.getName());
    static double consumoVehiculo = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadTotal = 100;
    static double fuelCantidad = 10;
    String pruebaAuto(double km){
        Automovil auto1 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        return (auto1.conduccion(km));
    }
    String pruebaCamion(double km){
        Camion cam1 = new Camion(fuelCantidad,consumoVehiculo,capacidadTotal);
        return (cam1.conduccion(km));
    }

    public static void main(String[ ] args) {

//Auto 1
        Automovil auto1 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        String r1 = auto1.conduccion(4);
        logger.info(r1);

//Auto 2
        Automovil auto2 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        String r2 = auto2.conduccion(12);
        logger.info(r2);



    }
}

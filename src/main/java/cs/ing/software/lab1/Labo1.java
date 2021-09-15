package cs.ing.software.lab1;
import java.util.logging.Logger;

import java.lang.*;
import java.text.DecimalFormat;

public class Labo1 {
    static final Logger logger = Logger.getLogger(Labo1.class.getName());
    static double ConsumoAutomovil = 0.9;
    static double ConsumoCamion = 1.6;
    static double VolumenTanque = 100;

    public static void main(String[ ] args) {
        double cantidad= 10;
        Automovil toyota= new Automovil( ConsumoAutomovil, VolumenTanque, cantidad);
        logger.info(toyota.conduccion(4));
        Automovil hyundai= new Automovil( ConsumoAutomovil, VolumenTanque, cantidad);
        logger.info(toyota.conduccion(12));
        Camion volvo = new Camion(ConsumoCamion, VolumenTanque, cantidad);
        logger.info(volvo.conduccion(4));
    }
}

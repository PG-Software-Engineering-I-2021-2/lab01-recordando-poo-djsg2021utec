package cs.ing.software.lab1;
import java.lang.*;
import java.text.DecimalFormat;

public class Camion extends Vehiculo{
    public Camion(double _consumo, double _capacidad, double _cantidad) {
        super(_consumo, _capacidad, _cantidad);
    }
    DecimalFormat df1 = new DecimalFormat("0.00");
    DecimalFormat df2 = new DecimalFormat("0.0");

    String abastecer(double litros){
        double disponible = this.capacidad - this.cantidad;
        if (litros > disponible){
            return  "El camion no se puede reabastecer, el tanque esta lleno";
        }
        else {
            this.cantidad += litros;
            return  "La cantidad de combustible es: "+cantidad;
        }
    }
    String conduccion(double distancia){
        double requiere = distancia*consumo;
        if (cantidad-requiere<0){
            return "El camion necesita reabastecimiento de combustible";
        }
        else{
            this.cantidad -= requiere;
            return ("El camion viajó "+ df2.format(distancia) +" km y aún tiene "+df1.format(cantidad)+ " de combustible");
        }
    }
}

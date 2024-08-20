package Gestion;

import java.util.List;
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class Parqueadero {
	private List<Vehiculo> vehiculos;
    private List<Vehiculo> historial;

    private static final double Tarifa_AUTOMOVIL = 2000; 
    private static final double Tarifa_MOTOCICLETA = 1500; 
    private static final double Tarifa_CAMION = 4000; 

    public Parqueadero() {
        this.vehiculos = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculo.setHoraEntrada(LocalDateTime.now());
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo registrado: " + vehiculo.getPlaca());
    }

    
    public double registrarSalida(String placa) {
        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);
        if (vehiculo == null) {
            System.out.println("Vehiculo no encontrado.");
            return 0;
        }

        vehiculo.setHoraSalida(LocalDateTime.now());
        double costoTotal = calcularCosto(vehiculo);
        vehiculos.remove(vehiculo);
        historial.add(vehiculo);
        System.out.println("Vehiculo con placa " + vehiculo.getPlaca() + " ha salido. Costo total: $" + costoTotal);
        return costoTotal;
    }

    private Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }
 
    private double calcularCosto(Vehiculo vehiculo) {
        long horas = Duration.between(vehiculo.getHoraEntrada(), vehiculo.getHoraSalida()).toHours();
        if (Duration.between(vehiculo.getHoraEntrada(), vehiculo.getHoraSalida()).toMinutesPart() > 0) {
            horas++;
        }

        double tarifa = 0;
        switch (vehiculo.getTipo()) {
            case "Automovil":
                tarifa = Tarifa_AUTOMOVIL;
                break;
            case "Motocicleta":
                tarifa = Tarifa_MOTOCICLETA;
                break;
            case "Camion":
                tarifa = Tarifa_CAMION;
                break;
        }
        return horas * tarifa;
    }

    public List<Vehiculo> getVehiculosPresentes() {
        return new ArrayList<>(vehiculos);
    }

    public List<Vehiculo> getReporteDelDia() {
        return new ArrayList<>(historial);
    }

}

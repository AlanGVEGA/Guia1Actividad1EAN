package Gestion;

import java.time.LocalDateTime;

public class Vehiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String tipo;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSalida;

	public Vehiculo(String placa, String marca, String modelo,String tipo, LocalDateTime horaEntrada) {
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.tipo=tipo;
		this.horaEntrada=horaEntrada;
		this.horaSalida=horaSalida;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	public LocalDateTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalDateTime horaSalida) {
		this.horaSalida = horaSalida;
	}
	
}

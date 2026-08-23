package dev.arribas.confiteria.comun;

import java.util.List;
import java.util.ArrayList;

public class Respuesta<T> {
	private T datos;
	private List<Mensaje> mensajes;
	
	public void addMensaje(Mensaje mensaje) {
		if (this.mensajes == null) {
			mensajes = new ArrayList<Mensaje>();
		}
		mensajes.add(mensaje);
	}

	public T getDatos() {
		return datos;
	}

	public void setDatos(T datos) {
		this.datos = datos;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
}

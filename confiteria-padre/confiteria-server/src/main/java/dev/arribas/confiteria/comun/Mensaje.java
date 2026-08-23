package dev.arribas.confiteria.comun;

public class Mensaje {
	private String mensaje;
	private Integer codigo;
	private String tipo;
	private String origen;
	
	public Mensaje(String mensaje, Integer codigo, String origen) {
		this.mensaje = mensaje;
		this.codigo = codigo;
		this.origen = origen;
	}

	public Mensaje(String mensaje, Integer codigo, String tipo, String origen) {
		this.mensaje = mensaje;
		this.codigo = codigo;
		this.tipo = tipo;
		this.origen = origen;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	
}

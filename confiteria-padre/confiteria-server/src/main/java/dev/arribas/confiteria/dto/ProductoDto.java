package dev.arribas.confiteria.dto;

import java.math.BigDecimal;
import java.util.Set;
import dev.arribas.confiteria.comun.Alergeno;

public class ProductoDto {
	private Integer idProducto;
	private Integer idCategoria;
	private String nombre;
	private BigDecimal precio;
	private String descripcion;
	private Integer stock;
	private String foto;
	private Set<Alergeno> alergenos;
	private boolean sinGluten;
	private boolean sinAzucar;
	private boolean vegano;
	
	public ProductoDto() {}
	
	public ProductoDto(Integer idProducto, Integer idCategoria, String nombre, BigDecimal precio, String descripcion,
			Integer stock, String foto, Set<Alergeno> alergenos, boolean sinGluten, boolean sinAzucar, boolean vegano) {
		this.idProducto = idProducto;
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stock = stock;
		this.foto = foto;
		this.alergenos = alergenos;
		this.sinGluten = sinGluten;
		this.sinAzucar = sinAzucar;
		this.vegano = vegano;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Set<Alergeno> getAlergenos() {
		return alergenos;
	}

	public void setAlergenos(Set<Alergeno> alergenos) {
		this.alergenos = alergenos;
	}

	public boolean isSinGluten() {
		return sinGluten;
	}

	public void setSinGluten(boolean sinGluten) {
		this.sinGluten = sinGluten;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public boolean isSinAzucar() {
		return sinAzucar;
	}

	public void setSinAzucar(boolean sinAzucar) {
		this.sinAzucar = sinAzucar;
	}
	
	
	
}

package dev.arribas.confiteria.iface;

import java.util.List;
import dev.arribas.confiteria.dto.ProductoDto;
import dev.arribas.confiteria.comun.ExcepcionBase;

public interface IServicioProductos {
	public ProductoDto getProductoById(Integer id) throws ExcepcionBase;
	public List<ProductoDto> getListaProductos(ProductoDto filtro) throws ExcepcionBase;
	public List<ProductoDto> getListaProductosPorNombre(String valor) throws ExcepcionBase;
}
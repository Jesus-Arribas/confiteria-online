package dev.arribas.confiteria.iface;

import java.util.List;
import dev.arribas.confiteria.comun.ExcepcionBase;
import dev.arribas.confiteria.dto.CategoriaDto;

public interface IServicioCategorias {
	public List<CategoriaDto> getListaCategorias() throws ExcepcionBase;
}

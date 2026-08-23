package dev.arribas.confiteria.servicios;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import dev.arribas.confiteria.iface.IServicioCategorias;
import dev.arribas.confiteria.dto.CategoriaDto;
import dev.arribas.confiteria.comun.ExcepcionBase;

@Service
public class ServicioCategoriasImpl implements IServicioCategorias {
	private List<CategoriaDto> listaCategorias = null;
	
	public ServicioCategoriasImpl() {
		listaCategorias = new ArrayList<CategoriaDto>();
		listaCategorias.add(new CategoriaDto(1, "Tartas"));
		listaCategorias.add(new CategoriaDto(2, "Pasteles"));
		listaCategorias.add(new CategoriaDto(3, "Pastas"));
	}
	
	@Override
	public List<CategoriaDto> getListaCategorias() throws ExcepcionBase {
		List<CategoriaDto> lista = new ArrayList<>();
		lista.addAll(listaCategorias);
		return lista;
	}
}
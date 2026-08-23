package dev.arribas.confiteria.controller.rest;

import java.util.List;
import org.slf4j.*;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import dev.arribas.confiteria.comun.*;
import dev.arribas.confiteria.dto.CategoriaDto;
import dev.arribas.confiteria.iface.IServicioCategorias;

@RestController
public class CategoriaApiController {
	Logger logger = LoggerFactory.getLogger(CategoriaApiController.class);
	
	@Autowired
	private IServicioCategorias servicioCategorias;
	
    @GetMapping(value = "/api/categorias", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Respuesta<List<CategoriaDto>>> getListaCategorias() throws ExcepcionBase {
		List<CategoriaDto> categorias = servicioCategorias.getListaCategorias();
		Respuesta<List<CategoriaDto>> response = new Respuesta<>();
		
		if (categorias == null || categorias.isEmpty()) {
			return new ResponseEntity<Respuesta<List<CategoriaDto>>>(response,HttpStatus.NO_CONTENT);
		} else {
			response.setDatos(categorias);
			return new ResponseEntity<Respuesta<List<CategoriaDto>>>(response,HttpStatus.OK);
		}
	}
}
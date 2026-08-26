package dev.arribas.confiteria.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dev.arribas.confiteria.comun.Constantes;
import dev.arribas.confiteria.comun.ExcepcionBase;
import dev.arribas.confiteria.comun.Mensaje;
import dev.arribas.confiteria.comun.Respuesta;
import dev.arribas.confiteria.dto.ProductoDto;
import dev.arribas.confiteria.iface.IServicioProductos;

@RestController
public class ProductoApiController {
	Logger logger = LoggerFactory.getLogger(CategoriaApiController.class);
	
	@Autowired
	private IServicioProductos servicioProductos;
	
	@GetMapping(value = "/api/productos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Respuesta<ProductoDto>> getProductoById(@PathVariable(value = "id") Integer id) {
		Respuesta<ProductoDto> response = new Respuesta<>();
		try {
			ProductoDto producto = servicioProductos.getProductoById(id);
			response.setDatos(producto);
			return new ResponseEntity<Respuesta<ProductoDto>>(response, HttpStatus.OK);
		} catch (ExcepcionBase e) {
			response.addMensaje(new Mensaje(e.getMessage(), e.getCodigo(), "W"));
			if (Constantes.CODIGO_ERROR_ELEMENTO_NO_ENCONTRADO == e.getCodigo()) {
				return new ResponseEntity<Respuesta<ProductoDto>>(response, HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<Respuesta<ProductoDto>>(response, HttpStatus.OK);
			}
		}
	}
	
	@PostMapping(value = "/api/productos/filtro", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Respuesta<List<ProductoDto>>> getListaProductos(
			@RequestBody ProductoDto filtro) throws ExcepcionBase {
		List<ProductoDto> productos = servicioProductos.getListaProductos(filtro);
		Respuesta<List<ProductoDto>> response = new Respuesta<>();
		response.setDatos(productos);
		return new ResponseEntity<Respuesta<List<ProductoDto>>>(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/api/productos/nombre", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Respuesta<List<ProductoDto>>> getListaProductosPorNombre(
			@RequestParam(name="valor") String valor) throws ExcepcionBase {
		List<ProductoDto> productos = servicioProductos.getListaProductosPorNombre(valor);
		Respuesta<List<ProductoDto>> response = new Respuesta<>();
		response.setDatos(productos);
		return new ResponseEntity<Respuesta<List<ProductoDto>>>(response, HttpStatus.OK);
	}
}

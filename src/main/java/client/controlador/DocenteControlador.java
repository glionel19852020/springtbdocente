package client.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client.modelo.Docente;
import client.servicio.DocenteServicio;
import client.utilitarios.ResponseDTO;

@RestController
@RequestMapping("/docente")
public class DocenteControlador {
	
	@Autowired
	DocenteServicio servicio;
	
	
	
	@GetMapping
	public ResponseDTO listar() {
		
		return servicio.findALL();
	
	}
	
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Docente docente) {
		
		return servicio.crear(docente);
		
	}
	
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Docente docente) {
		
		return servicio.actualizar(docente);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id) {
		
		return servicio.borrar(id);
	
	}
	
	
	

}

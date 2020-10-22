package client.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.modelo.Docente;
import client.repositorio.docenteRepositorio;
import client.utilitarios.Messages;
import client.utilitarios.ResponseDTO;

@Service
public class DocenteServicio {
	
	@Autowired
	docenteRepositorio repositoriobd;
	
	
	public ResponseDTO findALL() {
		
		ResponseDTO res= new ResponseDTO();
		try {
			
			res.setRespuesta(repositoriobd.findAll());
			
		}catch(Exception e){
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
		}
		
		return res;
		
	}
	
	
	
	public ResponseDTO crear(Docente docente) {
		
		ResponseDTO res= new ResponseDTO();
		try {
			
			res.setRespuesta(repositoriobd.save(docente));
			
		}catch(Exception e) {
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
				
		}
		
		return res;
		
	}
	

	public ResponseDTO actualizar(Docente docente) {
		
		ResponseDTO res = new ResponseDTO();
		
		try {
			if(repositoriobd.existsById(docente.getIdDocente())) {
				res.setRespuesta(repositoriobd.save(docente));
				res.setCodigo(Messages.CODE_UPDATE_SUCCES);
				res.setMensaje(Messages.MSG_UPDATE_OK);
				
			}else {
				
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
				
			}
			
			
			
		}catch(Exception e) {
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
		}
		
		return res;
		
	}
	
	
	public ResponseDTO borrar(Long id) {
		ResponseDTO res= new ResponseDTO();
		
		try {
			if(repositoriobd.findById(id)!=null) {
				repositoriobd.deleteById(id);
				res.setCodigo(Messages.CODE_DELETE_SUCCESS);
				res.setMensaje(Messages.MSG_DELETE_OK);
				
			}else {
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);	
				
			}
			
		}catch(Exception e) {
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();	
			
		}
		
		return res;
		
	}
	

	
	
}

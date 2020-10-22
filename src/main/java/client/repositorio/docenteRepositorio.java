package client.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client.modelo.Docente;

@Repository
public interface docenteRepositorio extends JpaRepository<Docente, Long> {

	
	
}

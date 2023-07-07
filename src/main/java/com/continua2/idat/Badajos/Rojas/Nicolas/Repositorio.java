package com.continua2.idat.Badajos.Rojas.Nicolas;

import com.continua2.idat.Badajos.Rojas.Nicolas.Cursos_Modelos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends JpaRepository<Cursos_Modelos, Integer> {

}

package com.continua2.idat.Badajos.Rojas.Nicolas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/curso")
public class Cursos {

    @Autowired
    private Repositorio _repositorio;


    @GetMapping(path="/listar")
    public @ResponseBody Iterable<Cursos_Modelos> getAllCurso() {

        return _repositorio.findAll();
    }

    @PostMapping(path="/nuevo")
    public @ResponseBody String addNewCurso (@RequestParam String curso, @RequestParam String credito) {

        Cursos_Modelos c = new Cursos_Modelos();
        c.setCurso(curso);
        c.setCredito(credito);
        _repositorio.save(c);
        return "Guardado";
    }

    @GetMapping(path="/ver/{id}")
    public @ResponseBody Cursos_Modelos getCurso(@PathVariable Integer id) {
        return _repositorio.findById(id).get();
    }

    @DeleteMapping(path="/eliminar")
    public @ResponseBody String deleteCurso(@RequestParam Integer id) {
        Cursos_Modelos c = new Cursos_Modelos();
        c.setId(id);
        _repositorio.delete(c);
        return "Eliminado";
    }


}

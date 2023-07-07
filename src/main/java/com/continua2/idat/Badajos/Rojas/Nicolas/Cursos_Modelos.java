package com.continua2.idat.Badajos.Rojas.Nicolas;
import jakarta.persistence.*;

@Entity
public class Cursos_Modelos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String curso;

    private String credito;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

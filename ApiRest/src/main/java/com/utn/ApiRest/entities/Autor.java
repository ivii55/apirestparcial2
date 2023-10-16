package com.utn.ApiRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name = "autor")
public class Autor extends Base {

        //private static final long serialVersionUID = 1L;

        //@Id
        // @GeneratedValue(strategy = GenerationType.IDENTITY)
        //private Long id;

        @Column(name = "nombre")
        private String nombre;

        @Column(name = "apellido")
        private String apellido;

        @Column(name = "biografia", length = 1500)
        private String biografia;
    /*
    public AutorEntity() {

    }

    public AutorEntity(String nombre, String apellido, String biografia) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.biografia = biografia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    */


}


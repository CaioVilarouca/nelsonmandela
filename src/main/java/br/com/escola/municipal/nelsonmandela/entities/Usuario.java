package br.com.escola.municipal.nelsonmandela.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Usuario extends AbastractBaseEntity {

    private static final long serialVersionUID = 4188995060570039379L;

    @Column(name = "nome")
    private String nome;

    @Column (name = "sobrenome")
    private String sobrenome;
}

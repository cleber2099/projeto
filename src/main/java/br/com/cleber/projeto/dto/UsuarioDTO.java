package br.com.cleber.projeto.dto;

import br.com.cleber.projeto.entity.UsuarioEntity;
import org.springframework.beans.BeanUtils;

public class UsuarioDTO {

    public UsuarioDTO(UsuarioEntity usuario){
        BeanUtils.copyProperties(usuario, this);
    }
    public UsuarioDTO(){

    }

    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

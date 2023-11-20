package br.com.cleber.projeto.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cleber.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
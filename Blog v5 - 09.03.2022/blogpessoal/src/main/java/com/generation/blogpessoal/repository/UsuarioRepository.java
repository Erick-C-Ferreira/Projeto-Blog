package com.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import com.generation.blogpessoal.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	/**
	 * Método que busca um usuário pelo seu usuario (email).
	 * 
	 * select * from tb_usuarios where usuario = "usuario procurado"
	 */
	public Optional<Usuario> findByUsuario(String usuario);
			/*Optional está servindo para encapsular o erro verificar se existe o objeto*/
	
	//Método criado para a Sessão de testes
		public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
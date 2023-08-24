package br.com.senai.usuariosmarketplace.core.service;

import br.com.senai.usuariosmarketplace.core.domain.Usuario;

public interface UsuarioServiceInterface {
	
	public Usuario criarNovo(String nome, String senha);
	
	public Usuario atualizarNomeESenha(String login, String nome, String senhaAntiga, String senhaNova);

	public Usuario buscarUsuarioPor(String login);
	
	public String resetarSenhaPor(String login);
}

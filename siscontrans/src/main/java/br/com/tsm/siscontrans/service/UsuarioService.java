package br.com.tsm.siscontrans.service;

import br.com.tsm.siscontrans.model.Usuario;

public interface UsuarioService {
	
	public Usuario findUsuarioByLogin(String login);

}

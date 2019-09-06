package br.com.tsm.siscontrans.service.impl;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.tsm.siscontrans.model.Usuario;
import br.com.tsm.siscontrans.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService, Serializable {

	private static final long serialVersionUID = -7487831373779757150L;

	@Override
	public Usuario findUsuarioByLogin(String login) {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setLogin("alessandro");
		usuario.setSenha("123456");
		usuario.setNome("Alessandro Mariano");
		usuario.setDataCriacao(new Date());
		usuario.setDataUltimoAcesso(new Date());
		
		return usuario;
	}
}

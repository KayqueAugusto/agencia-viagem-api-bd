package com.agencia.viagem.security;

import com.agencia.viagem.model.Usuario;
import com.agencia.viagem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("🔍 Procurando usuário: " + username); // 👈 print 1

        Usuario usuario = repository.findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

        System.out.println("✅ Encontrado: " + usuario.getLogin() + " | Role: " + usuario.getRole()); // 👈 print 2

        return new UserDetailsImpl(usuario);
    }
}

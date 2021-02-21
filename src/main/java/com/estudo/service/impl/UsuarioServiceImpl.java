package com.estudo.service.impl;

import com.estudo.domain.entity.Usuario;
import com.estudo.domain.repository.UsuarioRepository;
import com.estudo.exception.SenhaInvalidaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository repository;

    @Transactional
    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public UserDetails autenticar(Usuario usuario){
        UserDetails userDetails = loadUserByUsername(usuario.getLogin());
        boolean senhasIguais = passwordEncoder.matches(usuario.getSenha(), userDetails.getPassword());
        if(senhasIguais){
            return userDetails;
        }
        throw new SenhaInvalidaException();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if(!username.equals("fulano")){
//            throw new UsernameNotFoundException("Usuário não encontrado na base.");
//        }
//        return User.builder()
//                .username("fulano")
//                .password(passwordEncoder.encode("123"))
//                .roles("USER", "ADMIN")
//                .build();
        Usuario usuario = repository.findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado na base de dados"));
        String[] roles = usuario.isAdmin() ? new String[]{"ADMIN", "USER"}: new String[]{"USER"};

        return User.builder()
                .username(usuario.getLogin())
                .password(usuario.getSenha())
                .roles(roles)
                .build();
    }
}

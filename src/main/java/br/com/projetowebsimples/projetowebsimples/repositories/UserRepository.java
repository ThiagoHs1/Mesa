package br.com.projetowebsimples.projetowebsimples.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetowebsimples.projetowebsimples.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

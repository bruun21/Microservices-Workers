package bruun1.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bruun1.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email); //Macete de usar o próprio nome do atributo neste método depois do by para o JPA fazer a busca automática
}

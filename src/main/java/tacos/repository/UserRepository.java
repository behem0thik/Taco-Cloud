package tacos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.model.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}

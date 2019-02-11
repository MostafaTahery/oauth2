package co.nilin.security.oauth2.data.repository;

import co.nilin.security.oauth2.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUsername(String username);

}

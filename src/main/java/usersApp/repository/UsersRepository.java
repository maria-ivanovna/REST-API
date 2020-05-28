package usersApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usersApp.entity.User;

public interface UsersRepository extends JpaRepository<User, Long> {
}

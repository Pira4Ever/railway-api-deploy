package edu.octavio.railway_api_deploy.domain.repository;

import edu.octavio.railway_api_deploy.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

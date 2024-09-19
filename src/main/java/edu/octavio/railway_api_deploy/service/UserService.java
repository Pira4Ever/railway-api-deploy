package edu.octavio.railway_api_deploy.service;

import edu.octavio.railway_api_deploy.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}

package com.bloom.mvcspring.tut.Repos;

import com.bloom.mvcspring.tut.DAO.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// репозиторій дозволяє отримати повний список полів або отримати їх по іднетифікатору
public interface UserRepository extends CrudRepository<User, Integer> {
}

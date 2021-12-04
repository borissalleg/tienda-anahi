package edu.iud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.iud.app.model.userModel;
@Repository
public interface userRepository extends JpaRepository<userModel, Integer> {
    
}

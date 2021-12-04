package edu.iud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.iud.app.model.userTypeModel;
@Repository
public interface userTypeRepository extends JpaRepository<userTypeModel, Integer>{
    
}

package edu.iud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.iud.app.model.productModel;

@Repository
public interface productRepository extends JpaRepository<productModel,Integer>{

}
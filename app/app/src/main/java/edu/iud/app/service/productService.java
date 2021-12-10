package edu.iud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import edu.iud.app.model.productModel;
import edu.iud.app.repository.productRepository;

@Service
@Repository
public class productService {
    @Autowired
    private productRepository productos;

    
    public List<productModel> listarProductos(){
        return productos.findAll();
    }
}

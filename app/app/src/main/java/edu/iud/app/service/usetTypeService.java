package edu.iud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import edu.iud.app.model.userTypeModel;
import edu.iud.app.repository.userTypeRepository;


@Service
@Repository
public class usetTypeService {
    @Autowired
    public userTypeRepository typeUser;
    
    public List<userTypeModel> listarTipoUsuarios(){
        return typeUser.findAll();


    }
}

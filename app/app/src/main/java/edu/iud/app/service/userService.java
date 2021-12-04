package edu.iud.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import edu.iud.app.model.userModel;
import edu.iud.app.repository.userRepository;

@Service
@Repository
public class userService {
    @Autowired
    public userRepository usuarios; 
    
    public List<userModel> listarUsuarios(){
        return usuarios.findAll();
        


    }

}

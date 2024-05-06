package com.pos.pi_cafe.services;

import com.pos.pi_cafe.Repositories.LoginRepository;
import com.pos.pi_cafe.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Employee authenticate(Long employeeId, String password) {
        return loginRepository.findByEmployeeIdAndPassword(employeeId, password);
    }
}

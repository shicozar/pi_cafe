package com.pos.pi_cafe.Controllers;

import com.pos.pi_cafe.services.LoginService;
import com.pos.pi_cafe.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public ResponseEntity<Employee> authenticate(@RequestBody AuthRequest authRequest) {
        Long employeeId = authRequest.getEmployeeId();
        String password = authRequest.getPassword();

        Employee employee = loginService.authenticate(employeeId, password);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    public static class AuthRequest {
        private Long employeeId;
        private String password;

        public Long getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(Long employeeId) {
            this.employeeId = employeeId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}




package com.pos.pi_cafe.Repositories;

import com.pos.pi_cafe.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeIdAndPassword(Long employeeId, String password);

}

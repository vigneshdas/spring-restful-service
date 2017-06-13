package com.bytestree.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bytestree.restful.model.Employee;
/**
 * 
 * @author BytesTree
 *
 */

//Here At repository will directly call CrudRepository by default
//Removing @ Repository will not hit to DB
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

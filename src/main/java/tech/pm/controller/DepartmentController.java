package tech.pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.pm.model.entity.Department;
import tech.pm.model.repository.DepartmentJpaRepository;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

  @Autowired
  private DepartmentJpaRepository departmentJpaRepository;

  @GetMapping(value = "/all")
  public List<Department> findAll() {
    return departmentJpaRepository.findAll();
  }

  @GetMapping(value = "/{name}")
  public Department findByName(@PathVariable final String name) {
    return departmentJpaRepository.findByTitle(name);
  }

  @DeleteMapping(value = "/delete/{id}")
  public void delete(@PathVariable("id") long id) {
    departmentJpaRepository.deleteById(id);
  }

  @PostMapping(value = "/saveDepartment")
  public void saveDepartment(@RequestBody Department department) {
    departmentJpaRepository.save(department);
  }
}

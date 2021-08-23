package tech.pm.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.pm.model.entity.Department;

import java.util.List;

@Repository
public interface DepartmentJpaRepository extends JpaRepository<Department, Long> {
  Department findByTitle(String title);
  List<Department> findAll();

}

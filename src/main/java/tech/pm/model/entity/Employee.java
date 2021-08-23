package tech.pm.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
  @Id
  @Column(name = "employee_id")
  long id;
  @Column
  String firstname;
  @Column
  String lastname;
  @Column
  String email;
  @ManyToOne
  @JoinColumn(name = "department_id", referencedColumnName = "department_id")
  Department department;


}

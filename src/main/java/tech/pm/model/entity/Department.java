package tech.pm.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department")
public class Department {
  @Id
  @Column(name = "department_id")
  private long id;
  @Column
  private String title;

  @OneToMany(cascade = CascadeType.ALL)
  private List<Employee> employeelist;


}

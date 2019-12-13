package comm.example.model.table_per_subclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "REGULAR_EMPLOYEE")
@PrimaryKeyJoinColumn(name = "ID")
@Data
@EqualsAndHashCode(callSuper = false)
public class Regular_Employee extends Employee {

	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
	private int bonus;

}

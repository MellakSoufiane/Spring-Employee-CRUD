package fr.formation.domain;


import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long deptId;

	    @Column(
	            columnDefinition = "TEXT"
	    )
	    private String departName;

	    @OneToMany(
	            fetch = FetchType.EAGER,
	            mappedBy = "departement",
	            cascade = CascadeType.ALL
	              // this one should be EAGER , to get the departments
	    )
	    private List<Employee> employees;
	
}

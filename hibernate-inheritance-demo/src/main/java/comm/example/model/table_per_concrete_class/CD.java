package comm.example.model.table_per_concrete_class;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "cd")
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class CD {
	@Id
	
	private int id;
	private String title;
	private String artist;
	private Date purchaseDate;
	private double cost;

	public CD() {
	}

	public CD(String title, String artist, Date purchaseDate, double cost) {
		this.title = title;
		this.artist = artist;
		this.purchaseDate = purchaseDate;
		this.cost = cost;
	}
}
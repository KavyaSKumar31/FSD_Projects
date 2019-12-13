package comm.example.model.table_per_concrete_class;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "icd")
@Data
@EqualsAndHashCode(callSuper = false)
@AttributeOverrides({
	
	@AttributeOverride(name = "title",column = @Column(name="title")),
	@AttributeOverride(name = "artist",column = @Column(name="artist")),
	@AttributeOverride(name = "purchaseDate",column = @Column(name="purchaseDate")),
	@AttributeOverride(name = "cost",column = @Column(name="cost")),
	
	
	
})
public class InternationalCD extends CD {
	private String languages;
	private int region;

	public InternationalCD() {
	}

	public InternationalCD(String title, String artist, Date purchaseDate, double cost, String language, int region) {
		super(title, artist, purchaseDate, cost);
		languages = language;
		this.region = region;
	}
}
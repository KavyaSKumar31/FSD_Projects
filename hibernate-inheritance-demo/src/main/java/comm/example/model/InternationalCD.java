package comm.example.model;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)

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
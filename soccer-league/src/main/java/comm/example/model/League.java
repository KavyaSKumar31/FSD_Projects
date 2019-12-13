package comm.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "league")
@Immutable
public class League {
	@Id
	@Column(name = "league_id")
	private int id;
	@NotNull
	private String season = null;
	@Min(value = 2019)
	@Max(value = 2020)
	private int year = -1;
	@Length(min = 8)
	private String title = null;
	public League(String season, int year, String title) {
		super();
		this.season = season;
		this.year = year;
		this.title = title;
	}

}

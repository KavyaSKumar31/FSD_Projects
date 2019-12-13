package comm.example.springdemo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {

	@NotNull
	@Size(min = 3, message = "first name must be atleast 3 char(s) long..")
	private String firstName;
	@NotNull
	@Size(min = 3, message = "last name must be atleast 3 char(s) long..")
	private String lastName;
	@NotNull
	@Min(value = 0,message = "minimum value can't be negetive")
	@Max(value = 10,message = "maximum value can't be greater than 10")
	private int freePass;
	@Pattern(regexp = "^\\d{3}\\s?\\d{3}$",message = "invalid postal code")
	private String postalCode;
	@NotNull
	@Email(message = "invalid email")
	private String email;

}

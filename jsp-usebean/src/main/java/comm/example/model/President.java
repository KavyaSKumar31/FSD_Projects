package comm.example.model;

import java.io.Serializable;

public class President implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String presidentName;
	private int presidentAge;
	private int joiningYear;
	private int releaseYear;
	public President() {
		super();
	}
	public String getPresidentName() {
		return presidentName;
	}
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}
	public int getPresidentAge() {
		return presidentAge;
	}
	public void setPresidentAge(int presidentAge) {
		this.presidentAge = presidentAge;
	}
	public int getJoiningYear() {
		return joiningYear;
	}
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	@Override
	public String toString() {
		return "President [presidentName=" + presidentName + ", presidentAge=" + presidentAge + ", joiningYear="
				+ joiningYear + ", releaseYear=" + releaseYear + "]";
	}
	
	

}

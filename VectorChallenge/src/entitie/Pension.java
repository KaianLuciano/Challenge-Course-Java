package entitie;

public class Pension {
	private int bedroom;
	private String name;
	private String email;
	
	public Pension(int bedroom, String name, String email) {
		this.bedroom = bedroom;
		this.name = name;
		this.email = email;
	}
	
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroomUser) {
		bedroom = bedroomUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String nameUser) {
		name = nameUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emailUser) {
		email = emailUser;
	}
	
	
}

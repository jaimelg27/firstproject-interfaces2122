package inversiones;

public class clientobject {
	private String dni;
	private String name;
	private String surname;
	private String telephonenum;
	private String email;
	private String address;
	private String postalcode;
	private String country;
	private String password;
	private String telpassword;
	private String cuenta;
	private double saldocuenta;
	private int accionesana;
	private int accionesaena;
	private int accionesfer;
	private int accionesiag;
	private int accionesmel;
	private int accionesrep;
	private int accionestef;
	public clientobject(String dni, String name, String surname, String telephonenum, String email, String address,
			String postalcode, String country, String password, String telpassword, String cuenta, double saldocuenta,
			int accionesana, int accionesaena, int accionesfer, int accionesiag, int accionesmel, int accionesrep,
			int accionestef) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.telephonenum = telephonenum;
		this.email = email;
		this.address = address;
		this.postalcode = postalcode;
		this.country = country;
		this.password = password;
		this.telpassword = telpassword;
		this.cuenta = cuenta;
		this.saldocuenta = saldocuenta;
		this.accionesana = accionesana;
		this.accionesaena = accionesaena;
		this.accionesfer = accionesfer;
		this.accionesiag = accionesiag;
		this.accionesmel = accionesmel;
		this.accionesrep = accionesrep;
		this.accionestef = accionestef;
	}
	@Override
	public String toString() {
		return "clientobject [dni=" + dni + ", name=" + name + ", surname=" + surname + ", telephonenum=" + telephonenum
				+ ", email=" + email + ", address=" + address + ", postalcode=" + postalcode + ", country=" + country
				+ ", password=" + password + ", telpassword=" + telpassword + ", cuenta=" + cuenta + ", saldocuenta="
				+ saldocuenta + ", accionesana=" + accionesana + ", accionesaena=" + accionesaena + ", accionesfer="
				+ accionesfer + ", accionesiag=" + accionesiag + ", accionesmel=" + accionesmel + ", accionesrep="
				+ accionesrep + ", accionestef=" + accionestef + ", getDni()=" + getDni() + ", getName()=" + getName()
				+ ", getSurname()=" + getSurname() + ", getTelephonenum()=" + getTelephonenum() + ", getEmail()="
				+ getEmail() + ", getAddress()=" + getAddress() + ", getPostalcode()=" + getPostalcode()
				+ ", getCountry()=" + getCountry() + ", getPassword()=" + getPassword() + ", getTelpassword()="
				+ getTelpassword() + ", getCuenta()=" + getCuenta() + ", getSaldocuenta()=" + getSaldocuenta()
				+ ", getAccionesana()=" + getAccionesana() + ", getAccionesaena()=" + getAccionesaena()
				+ ", getAccionesfer()=" + getAccionesfer() + ", getAccionesiag()=" + getAccionesiag()
				+ ", getAccionesmel()=" + getAccionesmel() + ", getAccionesrep()=" + getAccionesrep()
				+ ", getAccionestef()=" + getAccionestef() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTelephonenum() {
		return telephonenum;
	}
	public void setTelephonenum(String telephonenum) {
		this.telephonenum = telephonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelpassword() {
		return telpassword;
	}
	public void setTelpassword(String telpassword) {
		this.telpassword = telpassword;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldocuenta() {
		return saldocuenta;
	}
	public void setSaldocuenta(double saldocuenta) {
		this.saldocuenta = saldocuenta;
	}
	public int getAccionesana() {
		return accionesana;
	}
	public void setAccionesana(int accionesana) {
		this.accionesana = accionesana;
	}
	public int getAccionesaena() {
		return accionesaena;
	}
	public void setAccionesaena(int accionesaena) {
		this.accionesaena = accionesaena;
	}
	public int getAccionesfer() {
		return accionesfer;
	}
	public void setAccionesfer(int accionesfer) {
		this.accionesfer = accionesfer;
	}
	public int getAccionesiag() {
		return accionesiag;
	}
	public void setAccionesiag(int accionesiag) {
		this.accionesiag = accionesiag;
	}
	public int getAccionesmel() {
		return accionesmel;
	}
	public void setAccionesmel(int accionesmel) {
		this.accionesmel = accionesmel;
	}
	public int getAccionesrep() {
		return accionesrep;
	}
	public void setAccionesrep(int accionesrep) {
		this.accionesrep = accionesrep;
	}
	public int getAccionestef() {
		return accionestef;
	}
	public void setAccionestef(int accionestef) {
		this.accionestef = accionestef;
	}
}
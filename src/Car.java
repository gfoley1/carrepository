public abstract class Car {
	private String car;
	private String driver;
	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	//this method is implemented
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	//this method is required but not implemented
	abstract String SubmitContent(); //an abstract method
}
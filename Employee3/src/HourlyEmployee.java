
public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	public HourlyEmployee (String firstN, String lastN, String ssn, double hourlyW, double hourlyH) {
		super(firstN,lastN,ssn);
		setWage(hourlyW);
		setHours(hourlyH);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double hourlyW) {
		wage = hourlyW;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hourlyH) {
		hours = hourlyH;
	}
	
	public double earnings() {
		if(getHours() <= 40)
			return getWage() * getHours();
		else 
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
			
	}
	
	public String toString() {
		return "\nHourly Employee: " + super.toString() 
		+ "\nHourly Wage: " + getWage() 
		+ "\nHours worked: " + getHours();
	}

}

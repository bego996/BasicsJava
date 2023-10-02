package at.htl.klu5AAIF;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;

import java.time.LocalDate;

/**
 * @author Christian Stingl
 * @version 1.0 (08.05.2020)
 */
public class Student
{
	// Properties
	private String surname;					// verpflichtend			
	private String firstname;				// verpflichtend				
	private char sex; 						// verpflichtend							
	private LocalDate dateOfBirth;
	private double weight;
	private int height;
	private String className;
	
	
	// Constructors
	// 1.
	/**
	 * Test
	 * @param surname
	 * @param firstname
	 * @param sex m, w or d
	 * @param dateOfBirth
	 * @param weight in kg
	 * @param height in cm
	 * @param className
	 */
	public Student(String surname, String firstname, char sex, LocalDate dateOfBirth, double weight, int height, String className) {
		super();
		this.surname = HTLUtilities.requireNonNullAndNonEmpty(surname, "surname");
		this.firstname = HTLUtilities.requireNonNullAndNonEmpty(firstname, "firstname");
		
		if (Character.toString(sex).matches("m|w|d"))	
			this.sex = sex;
		else
			throw new IllegalArgumentException("Sex must be m or w or d");
		
		LocalDate left = LocalDate.now().minusYears(100).minusDays(1);
		LocalDate right = LocalDate.now().plusDays(1);
		if (dateOfBirth == null || dateOfBirth.isAfter(left) && dateOfBirth.isBefore(right))
				this.dateOfBirth = dateOfBirth;
		else
			throw new IllegalArgumentException(String.format("Date of birth must be 'null' or between %s and %s", left.plusDays(1), right.minusDays(1)));
		
		if (weight >= 0 && weight < 200)
			this.weight = weight;
		else
			throw new IllegalArgumentException("Weight must be non-negative and smaller than 200");
		
		if (height >= 0 && height < 200)
			this.height = height;
		else
			throw new IllegalArgumentException("Height must be non-negative and smaller than 200");
		
		if (className != null && className.length() == 5)
			this.className = className;
		else
			throw new IllegalArgumentException("Class name must have exactly 5 characters");
	}	

	
	// 2.
	/**
	 * Konstruktor zum Anlegen eines Sch�lers bzw. einer Sch�lerin
	 * @param surname not null and not emtpy
	 * @param firstname not null and not emtpy
	 * @param sex m, w or d
	 * @param weight in kg
	 * @param height in cm
	 * @param className exactly 5 characters
	 */
	public Student(String surname, 
				   String firstname, 
				   char sex,
				   double weight, 
				   int height,
				   String className)
	{
		this(surname, firstname, sex, null, weight, height, className);
	}
	
	
	// 3.
	/**
	 * Konstruktor zum Anlegen eines Sch�lers bzw. einer Sch�lerin
	 * @param surname not null and not emtpy
	 * @param firstname not null and not emtpy
	 * @param sex m, w or d
	 * @param className exactly 5 characters
	 */
	public Student(String surname, 
				   String firstname, 
				   char sex,
				   String className)
	{
		this(surname, firstname, sex, null, 0, 0, className);
	}
	
	
	
	// toString
	@Override
	public String toString()
	{
		return String.format("%s %s (%c, %s)", this.firstname, this.surname, this.sex, this.className);
	}


	
	// Getter and Setter
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getFirstname()
	{
		return this.firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public char getSex()
	{
		return this.sex;
	}
	public void setSex(char sex)
	{
		this.sex = sex;
	}

	public LocalDate getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public double getWeight()
	{
		return this.weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public int getHeight()
	{
		return this.height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}

	public String getClassName()
	{
		return this.className;
	}
	public void setClassName(String className)
	{
		this.className = className;
	}
}

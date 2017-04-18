
public class restaurant {
/*Men�s identificados por nombre ej. �stamppot boerenkool�, cantidad de calor�as del plato,
 *  ej. 564.65 kcal, tiempo de cocinado estimado, j. 45 min (s�lo valores integer),
 *  el pecio por persona(double) ej. 20.5, y el n�mero de botellas inclu�das, ej. 0.5. */
	
	/*	-Define the attributes of the class, their types (e.g. String) and visibility.
		-Add the constructor in the class
		-Define the getter and setter methods for each of the attributes
		-Pay attention to the Java naming conventions for classes and methods */
	
	//Atributos
	private String name;
	private double kcal;
	private int cookingTime;
	private double price;
	private double wine;
	
	//constructor vac�o
	public restaurant(){}
	
	//Constructor con par�metros
	public restaurant(String name, double kcal, int cookingTime, double price, double wine){
		this.setName(name);
		this.setKcal(kcal);
		this.setCookingTime(cookingTime);
		this.setPrice(price);
		this.setWine(wine);
	}
	
	//Setters
	public void setName(String name){
		this.name=name;
	}
	
	public void setKcal(double kcal){
		this.kcal=kcal;
	}
	
	public void setCookingTime(int cookingTime){
		this.cookingTime=cookingTime;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public void setWine(double wine){
		this.wine=wine;
	}
	
	
	//Getters
	public String getName(){
		return this.name;
	}
	
	public double getKcal(){
		return this.kcal;
	}
	
	public int getCookingTime(){
		return this.cookingTime;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public double getWine(){
		return this.wine;
	}	
	
	//Otros m�todos
	
	
	/*	Exercise 2
		Add a method in your class to print the details of the menus in the format below:
		Menu <name> contains <calories> calories, comes with <number of wine bottles> bottles
		and cost <price>.
		Note that <name>, <calories>, <number of wine bottles> and <price> correspond to the
		attributes of your class.
		You are free to use any name for your method*/
	
	public void detailMenu(){		
		System.out.println("El men� "+getName()+" contiene "+getKcal()+" calor�as, viene con "+getWine()+" botellas de vino y cuesta "+getPrice());
	}
	
}
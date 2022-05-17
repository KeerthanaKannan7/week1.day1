package assignments1.week1day1;

public class Car 
{
	public void applyBreak() 
	{
		System.out.println("Brake Applied");
	}
	public void applyGear() 
	{
		System.out.println("Gear Applied");
	}
	public void switchonAc() 
	{
		System.out.println("AC ON");
	} 
	public void applyAcclerate() 
	{
		System.out.println("Acclerate Applied");
	}
	
	public static void main(String[] args) 
	{
		Car DetailsOfCar = new Car ();
		DetailsOfCar.applyBreak();
		DetailsOfCar.applyGear();
		DetailsOfCar.switchonAc();
		DetailsOfCar.applyAcclerate();
	}
}
class MyCar
{
	public static void main(String[] args) 
	{
	Car DetailsOfCarA = new Car();
	DetailsOfCarA.applyBreak();
	DetailsOfCarA.applyGear();
	DetailsOfCarA.switchonAc();
	DetailsOfCarA.applyAcclerate();
	}
}

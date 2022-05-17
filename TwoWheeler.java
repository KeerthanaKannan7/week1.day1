package assignments1.week1day1;

public class TwoWheeler {
	
	//Global Variable
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 9876543210L;	
	
	public void DetailsOfTwoWheeler() 
	{
		System.out.println("Number of Wheels = " + noOfWheels);
		System.out.println("Number of Mirrors = " + noOfMirrors);
		System.out.println(chassisNumber);		
		
		//Local Variable	
		boolean isPunctured = false;
		String bikeName = "Fasicno";
		double runningKM = 150.56;		
		System.out.println("Punture or Not: " + isPunctured);
		System.out.println("Bike Name: " + bikeName);
		System.out.println(runningKM);
	}
	
	public static void main(String[] args) 
	{
		TwoWheeler MyTwoWheeler = new TwoWheeler();
		MyTwoWheeler.DetailsOfTwoWheeler();
	}

}

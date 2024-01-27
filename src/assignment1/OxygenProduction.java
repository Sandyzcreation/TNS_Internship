package assignment1;

import java.util.Scanner;

public class OxygenProduction {

	//public static void main(String[] args) {

		       //Scanner input = new Scanner(System.in);

		       // Step 1: Read input values from the user

		       //System.out.println("Enter the floor area of the room(m*m)");

		       //double floorArea = input.nextDouble();

		       //System.out.println("Enter the plant area of a single plant(in cm2)");

		       //double plantArea = input.nextDouble();

		       // Step 2: Convert plant area to square meters

		       //plantArea = plantArea / 10000;

		       // Step 3: Calculate total number of plants

		       //double totalPlants = floorArea / plantArea;

		       // Step 4: Round total plants to the nearest and lowest multiple of 10
		       //totalPlants = Math.round(totalPlants / 10) * 10;

		       // Step 5: Calculate total oxygen production

		       //double totalOxygen = totalPlants * 0.9;

		       // Step 6: Print output

		      // System.out.printf("Total plants placed on floor area %.2f*%.2f is %.0f plants produces %.2f litres of oxygen in a day\n", floorArea, floorArea, totalPlants, totalOxygen);

		       //input.close();

		  // }

		//}


	//}

//}

 public static void main(String args[])
 {
 
 Scanner sc= new Scanner(System.in);

 System.out.println("Enter the length of the room(in m)");
 double l= sc.nextDouble();

Outer : {

 if(l<=0)
 {
 System.out.println("Invalid length");
 break Outer;
 }

 System.out.println("Enter the breadth of the room(in m)");
 double b= sc.nextDouble();

 if(b<=0)
 {
 System.out.println("Invalid breadth");
 break Outer;
 }

 System.out.println("Enter the plant area of a single plant(in cm2)");
 double plantArea= sc.nextDouble();

 if(plantArea<=0)
 {
 System.out.println("Invalid plant area");
 break Outer;
 }

 int totalPlants= (int)((l*b)/(plantArea/10000));

 if(totalPlants%10!=0)
 {
 int rem=totalPlants%10;
 totalPlants=totalPlants-rem;
 }

 double production= 0.9*totalPlants;

 System.out.println("Total number of plants is "+totalPlants);

 System.out.printf("Total oxygen production is %.2f litres",production);
 }
 }
}

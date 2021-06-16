/***********************************
 * Object Orientation Program
 * Module 1 - Assignment
 * This is the driven class.
 ************************************/

package Assignments;

import java.util.Scanner;

public class MapleTree 
{
	private String plantDate, heightDate;
	private double height;
	Scanner stdIn = new Scanner(System.in);
	
	public MapleTree()
{
}
	public void plant()
	{
		System.out.print("Enter plant date (dd/mm/yyyy): ");
		plantDate = stdIn.nextLine();
	}
	public void germinate()
	{
		System.out.print("Enter germination date (dd/mm/yyyy): ");
		heightDate = stdIn.nextLine();
		System.out.print("Enter observed height in meters: ");
		height = stdIn.nextDouble();
	}
	public void dumpData()
	{
		System.out.println("Plant date = "+ plantDate);
		System.out.println("Germinate date = "+ heightDate);
		System.out.println("Initial height = "+ height + " meters");
	}
}

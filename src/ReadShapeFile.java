/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author Luc Saunders-Grant
 *
 */

import java.awt.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile 
{
	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * @param in the scanner of the file
	 * @return the constructed queue
	 */
	private static Queue readDataFile (Scanner in) 
	{
		Queue shapeQueue = new Queue ();
		//loop to determine which shape is being created
		while(in.hasNext())
		{
			String type = in.next();
			//Case statement used to switch between different constructor methods for each shape
			switch (type)
			{
			case "circle":
				shapeQueue.enqueue(createCircle(in));
				break;
				
			case "oval":
				shapeQueue.enqueue(createOval(in));
				break;
				
			case "rect":
				shapeQueue.enqueue(createRectangle(in));
				break;
				
			case "square":
				shapeQueue.enqueue(createSquare(in));
				break;
			
			case "arc":
				shapeQueue.enqueue(createArc(in));
			
			}
		}
			
		
		return shapeQueue;
	}
	
	/**
	 * Method to read the file and return a queue of shapes from this file.  The program should handle
	 * the file not found exception here and shut down the program gracefully.
	 * @param filename the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue readFile (String filename) 
	{
		File shapeFile = new File (filename);
		Scanner in = null; 
		try
		{
			in = new Scanner(shapeFile);
		}
		catch (FileNotFoundException e)
		{
			//Error message for FileNotFoundExeption then program closes
			System.out.println("Could not find the file: " + filename);
			System.exit(1);
		}
		
		
		return ReadShapeFile.readDataFile(in);
	}
	
	// below are the 5 different constructors used to construct the shapes
	/**
	 * @param in In is the scanner of the file
	 * @return Returns a circle object for the queue
	 */
	private static Circle createCircle(Scanner in)
	{
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int diameter = in.nextInt();
		Color c = new Color(in.nextInt(),in.nextInt(),in.nextInt());
		int insertionTime = in.nextInt();
		return new Circle(insertionTime, x, y, vx, vy, diameter, c, isFilled);
	}
	
	
	/**
	 * @param in In is the scanner of the file
	 * @return Returns an oval object for the queue
	 */
	private static Oval createOval(Scanner in)
	{
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int width = in.nextInt();
		int height =in.nextInt();
		Color c = new Color(in.nextInt(),in.nextInt(),in.nextInt());
		int insertionTime = in.nextInt();
		return new Oval(insertionTime, x, y, vx, vy, width, height, c, isFilled);
	}
	
	
	/**
	 * @param in In is the scanner of the file
	 * @return Returns a square object for the queue
	 */
	private static Square createSquare(Scanner in)
	{
		
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int side = in.nextInt();
		Color c = new Color(in.nextInt(),in.nextInt(),in.nextInt());
		int insertionTime = in.nextInt();
		return new Square(insertionTime, x, y, vx, vy, side, c, isFilled);
	}
	
	
	/**
	 * @param in In is the scanner of the file
	 * @return Returns a rectangle object for the queue
	 */
	private static Rectangle createRectangle(Scanner in)
	{
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int width = in.nextInt();
		int height =in.nextInt();
		Color c = new Color(in.nextInt(),in.nextInt(),in.nextInt());
		int insertionTime = in.nextInt();
		return new Rectangle(insertionTime, x, y, vx, vy, width, height, c, isFilled);
	}
	
	
	/**
	 * @param in In is the scanner of the file
	 * @return Returns an Arc object for the queue
	 */
	private static Arc createArc(Scanner in)
	{
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int width = in.nextInt();
		int height = in.nextInt();
		int sAngle = in.nextInt();
		int aAngle = in.nextInt();
		Color c = new Color(in.nextInt(),in.nextInt(),in.nextInt());
		int insertionTime = in.nextInt();
		return new Arc(insertionTime, x, y, vx, vy, width, height, sAngle, aAngle, c, isFilled);
	}
	
}
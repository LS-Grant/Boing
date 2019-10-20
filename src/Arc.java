/**
 * Arc.Java
 * @version 1.0.0
 * @author Luc Saunders-Grant
 */
import java.awt.*;

/**
 * An Arc is a curve that a brought about by connecting two points on an angle
 * the arc can be filled in displaying the entire angle, or non-filled meaning
 * that it only shows the curve of the arc rather than the whole angle. It's position
 * is determined by the upper left corner of the rectangle bounding the arc as well as
 * both the starting and arcing angles of the shape.
 */
public class Arc extends ClosedShape 
{
	//This creates a variable for the: width, height, starting angle and arcing angle points
	private int width, height, sAngle, aAngle;

	/**
	 * Creates an arc.
	 * @param insertionTime determines when the shape will display on screen
	 * @param x The arcs' x Position in window.
	 * @param y The arcs' y Position in window.
	 * @param vx Display the arcs' x Velocity.
	 * @param vy Display the arcs' y Velocity.
	 * @param width sets the width of the box containing the arc (in pixels).
	 * @param height sets the height of the box containing the arc (in pixels).
	 * @param sAngle sets the starting angle of the arc
	 * @param aAngle sets the arcing angle of the arc
	 * @param colour determines the colour of the arc or angle.
	 * @param isFilled If true the full angle is displayed, if false the just the curve is shown.
	 */
	public Arc (int insertionTime, int x, int y, int vx, int vy, int width, int height, int sAngle, int aAngle, Color colour, boolean isFilled) 
	{
		super (insertionTime, x, y, vx, vy, colour, isFilled);
		this.width = width;
		this.height = height;
		this.sAngle = sAngle;
		this.aAngle = aAngle;
	}

	/**
     * Converts the properties of the arc to string format.
     */
    public String toString () 
    {
    	String result = "This is an arc\n";
    	result += super.toString ();
	result += "Its width is " + this.width + " , its height is " + this.height + " , its starting angle is " + this.sAngle + 
			" and its arcing angle is " + this.aAngle + "\n";
    	return result;
    }

	/**
	 * @param width sets the width.
	 */
 	public void setWidth (int width) 
 	{
		this.width = width;
	}

 	/**
 	 * @param height sets the height.
 	 */
 	public void setHeight (int height) 
 	{
		this.height = height;
	}
 	
 	/**
 	 * @param sAngle sets the Starting angle
 	 */
 	public void setStartAngle (int sAngle) 
 	{
		this.sAngle = sAngle;
	}
 	
 	/**
 	 * @param aAngle sets the Arcing angle
 	 */
 	public void setArcAngle (int aAngle) 
 	{
		this.aAngle = aAngle;
	}

 	/**
 	 * @return returns The width of the angle.
 	 */
 	public int getWidth() 
 	{
		return width;
	}
 	/**
 	 * @return returns The height of the angle.
 	 */
	public int getHeight() 
 	{
		return height;
	}
 	
	/**
	 * @return returns the starting angle
	 */
 	public int getStartAngle() 
 	{
		return sAngle;
	}
 	
 	
 	/**
	 * @return returns the arcing angle
	 */
 	public int getArcAngle() 
 	{
		return aAngle;
	}
 	

 	/**
 	 * This method draws the arc.
 	 * @param g The graphics object of the drawable component.
 	 */
	public void draw (Graphics g) 
	{
		g.setColor (colour);
		if (isFilled) 
		{
			g.fillArc( xPos, yPos, width, height, sAngle, aAngle);
		} 
		else 
		{
			g.drawArc( xPos, yPos, width, height, sAngle, aAngle);
		}
	}
}

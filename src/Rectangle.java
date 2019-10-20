/**
 * Rectangle.Java
 * @version 1.0.0
 * @author Luc Saunders-Grant
 */

import java.awt.Color;
import java.awt.Graphics;

/**
 * Rectangle is a shape that can be drawn to the screen, it can
 * be filled with colour or it can be opaque. The position of the
 * rectangle is determined by the x,y co-ordinates at it's creation.
 */


public class Rectangle extends ClosedShape 
{
	// Creates the width and height variables of the rectangle
	private int width, height;

	/**
     * Creates a rectangle.
     * @param insertionTime determines when the shape will display on screen
     * @param x Rectangles x position in window.
     * @param y Rectangles y position in window.
     * @param vx Displays the Rectangles x velocity.
     * @param vy Displays the Rectangles y velocity.
     * @param width The Rectangles width (in pixels).
	 * @param height The Rectangles height (in pixels)
     * @param colour The colour of the fill or the border.
     * @param isFilled If true the full angle is displayed, if false the just the curve is shown.
     */
	
	public Rectangle (int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled) 
	{
		super (insertionTime, x, y, vx, vy, colour, isFilled);
		this.width = width;
		this.height = height;
	}

	/**
	 * converts the properties of a rectangle to string
	 */
    public String toString () 
    {
    	String result = "This is a rectangle\n";
    	result += super.toString ();
	result += "Its width is " + this.width + " and its height is " + this.height + "\n";
    	return result;
    }

    /**
     * @param width sets the width of the rectangle
     */
 	public void setWidth (int width) 
 	{
		this.width = width;
	}

 	/**
 	 * @param height sets the height of the rectangle
 	 */
 	public void setHeight (int height) 
 	{
		this.height = height;
	}

 	/**
 	 * @return Returns how wide the rectangle is
 	 */
 	public int getWidth() 
 	{
		return width;
	}

 	/**
 	 * @return Returns how high the rectangle is
 	 */
 	public int getHeight() 
 	{
		return height;
	}

 	/**
 	 * This method draws the rectangle.
 	 * @param g The graphics object of the drawable component.
 	 */
	public void draw (Graphics g) 
	{
		g.setColor (colour);
		if (isFilled) 
		{
			g.fillRect( xPos, yPos, width, height );
		} 
		else 
		{
			g.drawRect( xPos, yPos, width, height );
		}
	}
}


/**
 * Square.Java
 * @version 1.0.0
 * @author Luc Saunders-Grant
 */

import java.awt.*;

/**
 * Square is a shape that can be drawn to the screen, it can
 * be filled with colour or it can be opaque. The position of the
 * Square is determined by the x,y co-ordinates at it's creation.
 */

public class Square extends ClosedShape 
{
   //creates the variable that holds the squares side lengths
	private int side;

	/**
     * Creates a Square.
     * @param insertionTime determines when the shape will display on screen
     * @param x Squares x position in window.
     * @param y Squares y position in window.
     * @param vx Displays the Squares x velocity.
     * @param vy Displays the Squares y velocity.
     * @param sides The side length of the square.
     * @param colour The colour of the fill or the border.
     * @param isFilled If true the full angle is displayed, if false the just the curve is shown.
     */
	
    public Square (int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled) 
    {
    	super (insertionTime, x, y, vx, vy, colour, isFilled);
    	this.side = side;
    }
    
    /**
	 * converts the properties of a square to string
	 */ 
    
    public String toString () 
    {
    	String result = "This is a square\n";
    	result += super.toString ();
	result += "the length of each side is" + this.side + "\n";
    	return result;
    }
    
    /**
     * @param side Sets the value for the length of each side of the square
     */
    public void setSide (int side) 
    {
    	this.side = side;
    }
    
    /**
     * @return Returns the side value of the square
     */
    public int getSide() 
    {
    	return side;
    }

    /**
     * @return Returns the side value which is also the width value of the square
     */
 	public int getWidth() 
 	{
		return side;
	}

 	/**
 	 * Returns the side value which is also the height value of the square
 	 */
 	public int getHeight() 
 	{
		return side;
	}
    
 	/**
 	 * This method draws the square.
 	 * @param g The graphics object of the drawable component.
 	 */
    public void draw (Graphics g) 
    {
    	g.setColor( colour );
    	if (isFilled) 
    	{
    		g.fillRect( xPos, yPos, side, side) ;
    	} 
    	else 
    	{
    		g.drawRect( xPos, yPos, side, side );
	    }
    }
}

/**
 * Write a description of class Pieces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.image.BufferedImage;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
public abstract class Piece
{
    private int xPos;
    private int yPos;
    
    public Piece(int x, int y)
    {
        xPos=x;
        yPos=y;
    }
    public abstract String getName();
    
    public int getX()
    {
        return xPos;
    }
    public int getY()
    {
        return yPos;
    }
    public void setPos(int x, int y)
    {
        xPos=x;
        yPos=y;
    }
    public abstract BufferedImage getImage();
    public abstract List<Point> listOfPositions();
    
    
}

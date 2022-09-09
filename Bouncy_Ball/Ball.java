import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
    private int offsetY = 1;
    private int offsetX = 1;
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        x += offsetX;
        y += offsetY;
        
        if(y >= getWorld().getHeight() || y <=0){
            offsetY *= -1;
        }
        
        if(x >= getWorld().getWidth() || x <=0){
            offsetX *= -1;
        }
        
        setLocation(x, y);
    }
}

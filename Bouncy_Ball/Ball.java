import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
    public void act()
    {
        move(5);
        if(isAtEdge()){
            turn(15);
    }
    }
}

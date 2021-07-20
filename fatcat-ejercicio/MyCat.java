import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        /*
        eat();
        wait(30);
        dance();
        wait(60);
        sleep(2);
        wait(20);
        shoutHooray();
        */
       /*
       if (isSleepy())
       {
           sleep(3);
       }
       if (isHungry())
       {
           eat();
       }*/
       
       /*
       dance();  /*bailar cansa al gato*/
       /*if (isSleepy())
       {
           sleep(3);
           shoutHooray();
           
       }
       else
       {
           shoutHooray();
       }*/
       
       if(isAlone())
       {
           
        sleep(10);
       } 
       else
       {
           shoutHooray();
       }
}
}

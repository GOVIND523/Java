/*

$ Inheritance

          # Object Oriented Programming allows to inherit commonly used state and 
             behaviour from other classes.

          # Keyword "extends" is used to inherit the class properties.

*/

class Bicycle
{
          int speed = 0;
          void gear( int newValue )
          {
                    speed = speed + ( newValue * 20 );
          } 
}

class dirtbike extends Bicycle
{
          int limit;
          int checkLimit()
          {
                    if( speed <= 40 )
                    {
                              limit = 0;
                    }
                    else
                    {
                              limit = 1;
                    }
                    return limit;
          }
}

class BicycleSpeedLimit
{
          public static void main(String args[])
          {
                    dirtbike bike1 = new dirtbike();

                    //object bike1 of class bicycle
                    bike1.gear( 2 );    //setting gear
                    int isLimited = bike1.checkLimit();     //Checking Limit
                    
                    //checking the limit
                    if( isLimited == 1 )
                    {
                              System.out.print("Not In Limit");
                    }
                    else
                    {
                              System.out.print("In Limit");
                    }
          }
}
/*
$ Object 
          # Real world objects share two characteristics they have state and 
             behaviour.
          
          # Software objects are conceptually similar to real world objects.
             The object stores the states in fields and its behaviour in 
             methods.

          # Object oriented programming has followwing benefits.
             + Modularity - Each object can have a independent source code and 
                converted to modules
             + Information hiding or abstraction - Internal details can be hidden
                using object oriented programming.
             + Code re-use - Code can be reused for different objects.
             + Pluggability and debugging ease - If a bolt breaks you can replace 
                it not the entire machine.

$ Class
          # In object oriented programming we say that bicycle is an instance of the 
             class of objects known as bicycles.
          
$ Code depicting class and objects

*/

class bicycle
{
   int cadenece = 0;
   int speed = 0;
   int gear = 1;

   void changeCadence( int newValue )
   {
      cadenece = neValue;
   } 

   void changeGear( int newValue )
   {
      gear = newValue;
   }

   void speedUp( int increment )
   {
      speed = speed + increment;
   }

   void applyBrakes( int decrement )
   {
      speed = speed - decrement;
   }

   void printStates()
   {
      System.out.print("Cadence : " + cadenece + "Gear : " + gear + "Speed : " + speed );
   }
}

class BicycleDemo
{
   public static void main( String args[] )
   {
      //objects of bicycle class
      Bicycle bike1 = new Bicycle();
      Bicycle bike2 = new Bicycle();

      //Invoking methods on objects
      //BIKE ONE 
      bike1.changeCadence( 50 );
      bike1.speedUp( 10 );
      bike1.changeGear( 2 );
      bike1.printStates();

      //BIKE TWO
      bike2.changeCadence( 50 );
      bike2.speedUp( 10 );
      bike2.changeGear( 2 ); 
      bike2.changeCadence( 40 );
      bike2.speedUp( 10 );
      bike2.changeGear( 3 );
      bike2.printStates();
   }
}

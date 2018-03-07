//package hashcode2018;
 
import java.io.*; 
import java.util.Scanner;
import java.util.ArrayList;
 
public class Main 
{ 
   
  public static String fileName = "a_example.in"; 
  public static Scanner inFile = null; 
  public static int[][] map; 
  public static int[] input; 
  static final int row = 0, column = 1, vehicle = 2, ride = 3, bonus = 4, steps = 5; 
  
  public static void main(String[] args) 
  { 
    try
    {


      input = new int[6]; 
      int i=0; 
      int c=0;
      
      int step=0;
      
      readFile(); 
      while(i < 6) 
      { 
        input[i] = Integer.parseInt(inFile.next()); 
        i++; 
      }
      
      int[][] rideFrom = new int[input[ride]][2]; 
      int[][] rideTo = new int[input[ride]][2]; 
      int[] earliestStart = new int[input[ride]]; 
      int[] latestFinish = new int[input[ride]];
      
      Ride[] rides = new Ride[input[ride]];
      
      Vehicle[] vehicles=new Vehicle[input[vehicle]];
      
      map = new int [input[row]][input[column]]; 
      
      for (int a = 0; a < input[row]; a++) 
      { 
        for (int b = 0; b < input[column]; b++) 
        { 
          map[a][b] = 0; 
        } 
      }
      
      for (i = 0; i < input[ride]; i++) 
      {
        rideFrom[i][0] = Integer.parseInt(inFile.next()); 
        rideFrom[i][1] = Integer.parseInt(inFile.next()); 
        rideTo[i][0] = Integer.parseInt(inFile.next()); 
        rideTo[i][1] = Integer.parseInt(inFile.next()); 
        earliestStart[i] = Integer.parseInt(inFile.next()); 
        latestFinish[i] = Integer.parseInt(inFile.next());
      }

      for (i=0;i<rides.length;i++)
      {
        Coordinate start_intersection = new Coordinate(rideFrom[i][0], rideFrom[i][1]);
        Coordinate final_intersection = new Coordinate(rideTo[i][0], rideTo[i][1]);
        int earliestTime = earliestStart[i];
        int latestTime = latestFinish[i];

        rides[i]=new Ride(i, start_intersection, final_intersection, earliestTime, latestTime);
      }
      
      for (i=0;i<vehicles.length;i++)
      {
      vehicles[i]=new Vehicle();
      }

      
      sortRides(rides);

      for (Ride ride : rides)
      {
        System.out.println(ride.getId());
        System.out.println(ride.getStartIntersection());
      }
      for (i=0;i<vehicles.length;i++)
      {
        vehicles[i].assignRide(rides[c]);
        c++;
      }
      
      
      while (step < steps)
      {
        moveAllVehicles(step, vehicles);

        //We check if a vehicle is free and assign a new ride to it
        for (Vehicle vehicle : vehicles)
          if (!vehicle.isInRide())
            if (c < rides.length)
            {
              vehicle.assignRide(rides[c]);
              c++;
            }
        
        step++;
      }

      //Create the submit file
      BufferedWriter writer = new BufferedWriter(new FileWriter("submission.txt"));
      for (Vehicle vehicle : vehicles)
      {
        ArrayList<Integer> vehicleRides = vehicle.getRides();
        String numOfRides = (new Integer(vehicleRides.size())).toString();
        String rideIds = "";
        for (int rideId : vehicleRides)
          rideIds += rideId + " ";

        writer.write(numOfRides + " " + rideIds);
        writer.newLine();
      }
      writer.close();
    }
    catch (IOException e)
    {
      ;
    }
  } 
  
  public static void sortRides(Ride[] ride) {
      for(int i=1; i<ride.length; i++) {
         int temp=0;
         if(ride[i-1].earliest > ride[i].earliest) {
            temp = ride[i-1].earliest;
            ride[i-1].earliest = ride[i].earliest;
            ride[i].earliest = temp;
         }
      }
   }

  public static void moveAllVehicles(int step, Vehicle[] vehicles)
  {
    for (Vehicle vehicle : vehicles)
      vehicle.moveVehicle(step);
  }
 
   
  public static void readFile() 
  { 
    try 
    { 
      inFile = new Scanner(new File(fileName)); 
    } 
    catch (FileNotFoundException fnfe) 
    { 
      System.out.println("File not found."); 
    } 
  }
 
} 

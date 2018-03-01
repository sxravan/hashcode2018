package hashcode2018; 
 
import java.io.*; 
import java.util.Scanner; 
 
public class Main 
{ 
   
  public static String fileName = "a_example.in"; 
  public static Scanner inFile = null; 
  public static int[][] map; 
  public static int[] input; 
  static final int row = 0, column = 1, vehicle = 2, rides = 3, bonus = 4, steps = 5; 
 
  public static void main(String[] args) 
  { 
    input = new int[6]; 
    int i=0; 
    int[][] rideFrom = new int[3][2]; 
    int[][] rideTo = new int[3][2]; 
    int earliestStart = 0; 
    int latestFinish = 0; 
     
    readFile(); 
    while(i < 6) 
    { 
      input[i] = Integer.parseInt(inFile.next()); 
      i++; 
    } 
     
    map = new int [input[row]][input[column]]; 
     
    for (int a = 0; a < input[row]; a++) 
    { 
      for (int b = 0; b < input[column]; b++) 
      { 
        map[a][b] = 0; 
      } 
    } 
     
    for (i = 0; i < 3; i++) 
    { 
      rideFrom[i][0] = Integer.parseInt(inFile.next()); 
      rideFrom[i][1] = Integer.parseInt(inFile.next()); 
      rideTo[i][0] = Integer.parseInt(inFile.next()); 
      rideTo[i][1] = Integer.parseInt(inFile.next()); 
      earliestStart = Integer.parseInt(inFile.next()); 
      latestFinish = Integer.parseInt(inFile.next()); 
    } 
     
//    while(i < 6) 
//    { 
//      System.out.print(input[i]); 
//      i++; 
//    } 
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
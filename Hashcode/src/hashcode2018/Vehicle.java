package hashcode2018;

public class Vehicle
{
  private Coordinate currentPosition;
  private Coordinate startIntersection;
  private Coordinate finalIntersection;

  private Coordinate nextGoToPosition;

  private int phase;

  private int rideStatus;

  private Ride assignedRide;

  private static int PHASE_GO_TO_START_INTERSECTION = 1;
  private static int PHASE_WAITING = 2;
  private static int PHASE_GO_TO_FINAL_INTERSECTION = 3;
 
  private static int DOING_RIDE = 1;
  private static int NOT_DOING_RIDE = 2;


  public Vehicle()
  {
    this.currentPosition.setX(0);
    this.currentPosition.setY(0);
  }

  public void assignRide(Ride ride)
  {
    this.assignedRide = ride;
    startIntersection = ride.getStartIntersection();
    finalIntersection = ride.getFinalIntersection();
    phase = PHASE_GO_TO_START_INTERSECTION;
    rideStatus = DOING_RIDE;
  }

  public void moveVehicle(int step)
  {
    //Encoded as a series of ifs and not a switch so that changes from a phase to another (e.g. from start to waiting) in the same step takes effect immediately

    if (phase == PHASE_GO_TO_START_INTERSECTION)
      if (currentPosition.equals(startIntersection))
<<<<<<< HEAD
        phase = PHASE_WAITING;
=======
        phase = WAITING;
>>>>>>> master
      else
        moveVehicleTowardsDesiredCoordinate(startIntersection);

    if (phase == PHASE_WAITING)
<<<<<<< HEAD
      if (step >= assignedRide.getEarliest())
=======
      if (step >= ride.getEarliest())
>>>>>>> master
        phase = PHASE_GO_TO_FINAL_INTERSECTION;

    if (phase == PHASE_GO_TO_FINAL_INTERSECTION)
      if (currentPosition.equals(finalIntersection))
        rideStatus = NOT_DOING_RIDE;
      else
        moveVehicleTowardsDesiredCoordinate(finalIntersection);
<<<<<<< HEAD
  }
  
  public void moveVehicleTowardsDesiredCoordinate(Coordinate st)
  {
	  int x = st.getX();
	  int y = st.getY();
	  
	  int a = currentPosition.getX();
	  int b = currentPosition.getY();
	  
	  if (x > a)
		  a++;
	  else if (x < a)
		  a--;
	  else if (y > b)
		  b++;
	  else if (y < b)
		  b--;
	  
=======
    }
>>>>>>> master
  }
}
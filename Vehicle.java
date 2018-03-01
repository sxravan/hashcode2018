public class Vehicle
{
  private Coordinate currentPosition;
  private Coordinate startIntersection;
  private Coordinate finalIntersection;

  private Coordinate nextGoToPosition;

  private int phase;

  private Ride assignedRide

  private int PHASE_GO_TO_START_INTERSECTION = 1;
  private int PHASE_WAITING = 2;
  private int PHASE_GO_TO_FINAL_INTERSECTION = 3;


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
  }

  public void moveVehicle(int step)
  {
    switch (phase)
    {
      case PHASE_GO_TO_START_INTERSECTION:
        if (currentPosition.equals(startIntersection))
          if (step < ride.getEarliest())
            phase = WAITING;
          else 
            moveVehicleTowardsDesiredCoordinate(startIntersection);
        break;
      case PHASE_WAITING:

    }
  }



}
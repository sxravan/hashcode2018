//package hashcode2018;

public class Ride {
	
	Coordinate start_intersection;
	Coordinate final_intersection;
	int earliest;
	int latest;
	int id;

	public Ride(int id,Coordinate s,Coordinate f,int e,int l)
  {
    start_intersection=s;
    final_intersection=f;
    earliest=e;
    latest=l;
    this.id=id;
  }
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	public void setStartIntersection(int x, int y)
	{
		start_intersection = new Coordinate(x, y);
	}
	
	public Coordinate getStartIntersection()
	{
		return start_intersection;
	}
	
	public void setFinalIntersection(int x, int y)
	{
		final_intersection = new Coordinate(x, y);
	}
	
	public Coordinate getFinalIntersection()
	{
		return final_intersection;
	}
	
	public void setEarliest(int e)
	{
		earliest = e;
	}
	
	public int getEarliest()
	{
		return earliest;
	}
	
	public void setLatest(int l)
	{
		latest = l;
	}
	
	public int getLatest()
	{
		return latest;
	}
	
}
public class Coordinate
{
  private int x;
  private int y;

  public Coordinate(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  public int getX(int x)
  {
    this.x = x;
  }

  public int getY(int y)
  {
    this.y = y;
  }

  public boolean equals(Coordinate coordinate)
  {
    if (this.x = coordinate.getX() && this.y == coordinate.getY())
      return true;
    else
      return false;
  }
}
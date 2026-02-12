package geometry;

public class Point {
    private float x;
    private float y;

    public Point()
    {
        x = 0f;
        y = 0f;
    }
    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public Point (Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX()
    {
        return this.x;
    }

    public void setX(float x)
    {
        this.x = x;
    }
}
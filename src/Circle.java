public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
        toString();

    }

    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
     */
    public double area()
    {
        double area = Math.PI * (radius * radius);
        return area;

    }

    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * d
       (d = diameter = 2 * r)
     */
    public double circumference()
    {
       return (2 * radius);
    }

    /* Updates the radius of the circle to newRadius
     */
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }

    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below
     */
    public String toString(){
        return "Radius: " + radius;
        String area = "Area" + area();
    }
}

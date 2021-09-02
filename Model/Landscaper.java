package Model;
public class Landscaper extends Record
{
    
    public Landscaper(int id, String name)
    {
       super(id,name);
    }

    public String toString()
    {
         return "Landscaper: " + super.toString();
    }
    
}

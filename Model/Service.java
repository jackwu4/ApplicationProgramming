package Model;
public class Service extends Record
{
    int cost = 0;
    public Service(int id, String name, int cost)
    {
       super(id,name);
       this.cost = cost;
    }
    
    public int getCost()
    {
        return cost;
    }
    public String toString()
    {
         return "Service: " + super.toString();
    }
    
}

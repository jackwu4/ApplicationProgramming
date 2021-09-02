package Model;
public class Customers extends Records
{
    

    public Customers()
    {
        
    }

    public void add(String name)
    {
        id++;
        records.add(new Customer(id, name));
        updateViews();
    }
    
    public Customer find(int id)
    {
        return (Customer)super.find(id);
    }
}

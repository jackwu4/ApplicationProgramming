package Model;
public class Services extends Records
{
    

    public Services()
    {
        
    }

    public void add(String name,int cost)
    {
        id++;
        records.add(new Service(id,name,cost));
        updateViews();
    }
    
    public Service find(int id)
    {
        return (Service)super.find(id);
    }
}

package Model;
public class Landscapers extends Records 
{
    

    public Landscapers()
    {
        
    }

    public void add(String name)
    {
        id++;
        records.add(new Landscaper(id, name));
        updateViews();
    }
    
    public Landscaper find(int id)
    {
        return (Landscaper)super.find(id);
    }
}

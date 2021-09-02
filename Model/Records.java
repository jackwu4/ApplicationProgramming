//S218
package Model;
import java.util.*;
public class Records extends Updater
{
    protected LinkedList<Record> records = new LinkedList<Record>();
    protected int id = 0;
    protected void add(Record record)
    {
        records.add(record);
    }
    public Record find(int id)
    {   
        for(Record record : records)
        {  
            if (record.matches(id))
                return record;  
        }
        return null;    
    } 
    public int readInt(String message)
    {   
        System.out.print("\t" + message);
        return In.nextInt();    
    }
    public String readName(String message)
    {   
        System.out.print("\t" + message + " name: ");
        return In.nextLine();    
    }
    public int size()
    {   
        return records.size();    
    }
    public String show()
    {
        String str = "";
        for(Record record : records)
        {
            str += record.show();
        }
        return str;
    }
}

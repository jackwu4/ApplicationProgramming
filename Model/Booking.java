package Model;
public class Booking
{
    private int id;
    private Landscaper landscaper;
    private Customer customer;
    private Service service;
    
    public Booking(Landscaper landscaper, Customer customer, Service service, int id)
    {
       this.landscaper = landscaper;
       this.customer = customer;
       this.service = service;
       this.id = id;
    }
    
    public String show()
    {
        String str = "";
        str += "Booking object used: \n" + landscaper.show() + customer.show() + service.show();
        str += "Bookings \n";
        str += "\t" + toString() + "Landscaper: " + landscaper.getName() + " Customer: " + 
        customer.getName() + " Service: " + service.getName() + " cost $" + service.getCost() + "\n \n";
        return str;
    }
    
    public String toString()
    {
        return id + " ";
    }
   
}


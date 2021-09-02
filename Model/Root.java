//S218
package Model;
import java.util.*;
public class Root extends Updater
{
    private Landscapers landscapers;// = new Landscapers();
    private Customers customers;// = new Customers();
    private Services services;// = new Services();
    private LinkedList<Booking> bookings = new LinkedList<Booking>();
    private int bookingId = 1;    
    public Root(Landscapers landscapers, Customers customers, Services services)
    {
        //menu();
        this.landscapers = landscapers;
        this.customers = customers;
        this.services = services;
    }
    public Landscapers landscapers()
    {
        return landscapers;
    }
    public Customers customers()
    {
        return customers;
    }
    public Services services()
    {
        return services;
    }
    public void booking(int landscaperId, int customerId, int serviceId)
    {
        Landscaper landscaper;
        Customer customer;
        Service service;
        do
        {
            landscaper = landscapers.find(landscaperId);
        }while(landscaper == null);
        do
        {
            customer = customers.find(customerId);
        }while(customer == null);
        do
        {
            service = services.find(serviceId);
        }while(service == null);
        bookings.add(new Booking(landscaper, customer, service, bookingId));
        updateViews();
    }
    public String report()
    {
        String str = "";
        for(Booking booking : bookings)
        {
            str += booking.show();
        }
        str += "Objects created: \n" + landscapers.show();
        str += customers.show();
        str += services.show();
        return str;
    }
    private void exit()
    {
        System.out.println("Goodbye");
    }
    public String toString()
    {
        return bookingId + " ";
    }
}

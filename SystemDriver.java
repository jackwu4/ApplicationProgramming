import Model.*;
import java.util.*;
public class SystemDriver
{
    public static void main(String[] args)
    {
        Landscapers landscapers = new Landscapers();
        Customers customers = new Customers();
        Services services = new Services();
        Root root = new Root(landscapers, customers, services);
        new MainWindow(root);
    }
}

import Model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainPanel extends JPanel
{
    private Root root;
    private LandscaperPanel landscaperPanel;
    private CustomerPanel customerPanel;
    private ServicePanel servicePanel;
    private BookingPanel bookingPanel;
    public MainPanel(Root root)
    {
        this.root = root;
        setup();
        build();
        
    }

    private void setup()
    {
        setLayout(new GridLayout(4,1));
    }

    private void build()
    {
        landscaperPanel = new LandscaperPanel(root);
        landscaperPanel.setBorder(BorderFactory.createLineBorder(Color.blue));
        customerPanel = new CustomerPanel(root);
        customerPanel.setBorder(BorderFactory.createLineBorder(Color.blue));
        servicePanel = new ServicePanel(root);
        servicePanel.setBorder(BorderFactory.createLineBorder(Color.blue));
        bookingPanel = new BookingPanel(root);
        bookingPanel.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(landscaperPanel);
        add(customerPanel);
        add(servicePanel);
        add(bookingPanel);
    }
    
    // private class Tabber extends JTabbedPane
    // {
        // public Tabber(Root root)
        // {
            // add("Landscaper", new LandscaperPanel(root));
            // add("Customer", new CustomerPanel(root));
            // add("Service", new ServicePanel(root));
            // add("Booking", new BookingPanel(root));
        // }
    // }
}

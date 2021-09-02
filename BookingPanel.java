import Model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BookingPanel extends JPanel implements MyObserver
{
    private Root root;
    private JTextField landscaperId = new JTextField(3);
    private JTextField customerId = new JTextField(3);
    private JTextField serviceId = new JTextField(3);
    private JButton set = new JButton("Set");
    public BookingPanel(Root root)
    {
        this.root = root;
        root.attach(this);
        build();
        setup();
        
    }

    private void build()
    {   
        add(new JLabel("Landscaper ID: "));
        add(landscaperId);
        add(new JLabel("Customer ID: "));
        add(customerId);
        add(new JLabel("Service ID: "));
        add(serviceId);
        add(set);
    }

    private void setup()
    {
        set.addActionListener(new SetListener());
    }
    public int getLandscaperId()
    {
        return Integer.parseInt(landscaperId.getText());
    }
    public int getCustomerId()
    {
        return Integer.parseInt(customerId.getText());
    }
    public int getServiceId()
    {
        return Integer.parseInt(serviceId.getText());
    }
    public void update()
    {
        landscaperId.setText("");
        customerId.setText("");
        serviceId.setText("");
    }
    private class SetListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            root.booking(getLandscaperId(),getCustomerId(),getServiceId());
        }
    }    
}

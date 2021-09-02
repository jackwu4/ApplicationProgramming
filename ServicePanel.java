import Model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ServicePanel extends JPanel implements MyObserver
{
    private Root root;
    private JTextField name = new JTextField(10);
    private JTextField cost = new JTextField(5);
    private JButton set = new JButton("Set");
    public ServicePanel(Root root)
    {
        this.root = root;
        root.services().attach(this);
        build();
        setup();
    }

    private void build()
    {   
        add(new JLabel("Add Service name: "));
        add(name);
        add(new JLabel("Cost:"));
        add(cost);
        add(set);
    }

    private void setup()
    {
        set.addActionListener(new SetListener());
    }

    public String getName()
    {
        return name.getText();
    }
    
    public int getCost()
    {
        return Integer.parseInt(cost.getText());
    }
    
    public void update()
    {
        name.setText("");
        cost.setText("");
    }
    private class SetListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            root.services().add(getName(),getCost());
        }
    }
}

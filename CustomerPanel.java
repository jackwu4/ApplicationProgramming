import Model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CustomerPanel extends JPanel implements MyObserver
{
    private Root root;
    private JTextField name = new JTextField(10);
    private JButton set = new JButton("Set");
    public CustomerPanel(Root root)
    {
        this.root = root;
        root.customers().attach(this);
        build();
        setup();
    }

    private void build()
    {   
        add(new JLabel("Add Customer name: "));
        add(name);
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

    public void update()
    {
        name.setText("");
    }
    private class SetListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            root.customers().add(getName());
        }
    }
}

import Model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SummaryPanel extends JPanel implements MyObserver
{
    private Root root;
    private JTextArea summary = new JTextArea();
    public SummaryPanel(Root root)
    {
        this.root = root;
        root.landscapers().attach(this);
        root.customers().attach(this);
        root.services().attach(this);
        root.attach(this);
        summary.setPreferredSize(new Dimension(600, 400)); 
        build();
        setup();
        setVisible(true);
    }

    private void setup()
    {
        
    }

    private void build()
    {
        add(summary);
    }
    
    public void update()
    {
        summary.setText(root.report());

    }
    // private class Panel extends JPanel
    // {
        // private Root root;
        // private JButton setup = new JButton("Setup");
        // private JTextArea landscapers = new JTextArea();
        // private JTextArea customers = new JTextArea();
        // private JTextArea services = new JTextArea();
        // private JTextArea bookings = new JTextArea();
        
        // public Panel(Root root)
        // {
            // this.root = root;
            // build();
            // setup();
        // }
        // private void build()
        // {
            // setLayout(new GridLayout(5, 1));
            // add(setup);
            // add(new JLabel("Landscapers"));
            // add(landscapers);
            // add(new JLabel("Customers"));
            // add(customers);
            // add(new JLabel("Services"));
            // add(services);
            // add(new JLabel("Bookings"));
            // add(bookings);
        // }
        // private void setup()
        // {
            // setup.addActionListener(new SetupListener(root));
        // }
        // private class SetupListener implements ActionListener
        // {
            // private Root root;
            // public SetupListener(Root root)
            // {
                // this.root = root;
            // }
            // public void actionPerformed(ActionEvent e)
            // {
                
            // }
        // }
    // }
}

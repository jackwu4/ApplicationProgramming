import Model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainWindow extends JFrame
{
    private Root root;
    public MainWindow(Root root)
    {
        this.root = root;
        setup();
        build();
        setVisible(true);
    }

    private void setup()
    {
        setSize(720,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    private void build()
    {
        add(new Tabber(root));
    }
    
    private class Tabber extends JTabbedPane
    {
        public Tabber(Root root)
        {
            add("Main", new MainPanel(root));
            add("Summary", new SummaryPanel(root));
        }
    }
}

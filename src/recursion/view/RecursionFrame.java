package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;

public class RecursionFrame extends JFrame
{
    private RecursionController baseController;
    private RecursionPanel basePanel;
   
    public RecursionFrame(RecursionController baseController)
    {
        this.baseController = baseController;
        basePanel = new RecursionPanel(baseController);
        setupFrame();
       
    }
   
    private void setupFrame()
    {
        this.setContentPane(basePanel);
        this.setSize(500, 500);
        this.setTitle("Recursion: see Recursion");
        this.setVisible(true);
        this.setResizable(false);
    }
}
package recursion.view;
import javax.swing.JPanel;
import recursion.controller.RecursionController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.*;

public class RecursionPanel extends JPanel
{
    private RecursionController baseController;
    private JButton fibonacciButton;
    private JButton factorialButton;
    private JTextField inputField;
    private JTextArea resultsArea;
    private SpringLayout baseLayout;
   
    public RecursionPanel(RecursionController baseController)
    {
        this.baseController = baseController;
        fibonacciButton = new JButton("calculate something");
        factorialButton = new JButton("n!");
        baseLayout = new SpringLayout();
        inputField = new JTextField(5);
        resultsArea = new JTextArea(10,15);
       
        setupPanel();
        setupLayout();
        setupListeners();
       
       
       
    }
   
    private void setupLayout()
    {
       
    }
   
    private void setupPanel()
    {
        this.setLayout(baseLayout);
        this.add(fibonacciButton);
        this.add(factorialButton);
        this.add(inputField);
        this.add(resultsArea);
        resultsArea.setWrapStyleWord(true);
        resultsArea.setLineWrap(true);
        resultsArea.setEditable(false);
        this.setBackground(Color.MAGENTA);
    }
   
    private void setupListeners()
    {
        fibonacciButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                String input = inputField.getText();
                if(checkInput(input))
                {
                    resultsArea.setText(baseController.doFibonacci(input));
                }
            }
        });
       
        factorialButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                String input = inputField.getText();
                if(checkInput(input))
                {
                    resultsArea.setText(baseController.doFactorial(input));
                }
            }
        });
    }
   
    private boolean checkInput(String input)
    {
        boolean isNumber = false;
        try
        {
            Double.parseDouble(input);
            isNumber = true;
        }
        catch(Exception numberException)
        {
            resultsArea.setText("You must type in a number");
        }
       
        return isNumber;
    }
}

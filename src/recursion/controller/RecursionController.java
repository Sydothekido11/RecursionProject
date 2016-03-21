package recursion.controller;

import recursion.model.RecursionObject;
import recursion.view.RecursionFrame;

public class RecursionController
{
  private RecursionFrame baseFrame;
  private RecursionObject mathTool;
  private String calculatedValue;
 
  public RecursionController()
  {
      mathTool = new RecursionObject();
      baseFrame = new RecursionFrame(this);
      calculatedValue = "";     
  }
 
  public void start()
  {
     
  }
 
  public String doFibonacci(String input)
  {
      calculatedValue = "The Fibonacci sequence at " + input + " is: " + Double.toString(mathTool.fibonacciNumber(Double.parseDouble(input)));
     
      return calculatedValue;
  }
 
  public String doFactorial(String input)
  {
      calculatedValue = input + "! is:  " + input + " is: " + Double.toString(mathTool.factorialNumber(Double.parseDouble(input)));
     
      return calculatedValue;
  }
}

package recursion.model;

public class RecursionObject
{

    public double fibonacciNumber(double position)
    {
       
      double prevPosition = 1;
      double prevPrevPosition = 0;
      int loopValue = 1;
      double currentPosition = 0;
      
      if(position < 0)
      {
    	  return Integer.MIN_VALUE;
      }
      
      while(loopValue < position)
      {
    	  currentPosition = prevPosition + prevPrevPosition;
    	  prevPrevPosition = prevPosition;
    	  prevPosition = currentPosition;
    	  loopValue++;
      }
      if(position == 0 || position == 1)
      {
    	  currentPosition = 1;
      }
      
      return currentPosition;
      
    }
   
    public double factorialNumber(double position)
    {
      
    	double resultValue = 1;
    	
    	if(position < 0)
    	{
    		return Integer.MIN_VALUE;
    	}
    	
    	if(position == 0)
    	{
    		return 1;
    	}
    	
    	for(int loopValue = 1; loopValue <= position; loopValue++)
    	{
    		resultValue = resultValue * loopValue;
    	}
    	
    	return resultValue;
    }
   
}

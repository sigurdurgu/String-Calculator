package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) throws Exception{
		if(text.equals("")){
			return 0;
			}
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else if (text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number)throws Exception{
			if(Integer.parseInt(number)<0){
				throw  new Exception("Negatives not allowed");
			
		}
		return checkNumber(Integer.parseInt(number));
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}
      
    private static int sum(String[] numbers)throws Exception{

 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }

    private static int checkNumber (int number)throws Exception{

    	if (number > 1000){
    		number = 0;
    	}
    	return number;
    }


}
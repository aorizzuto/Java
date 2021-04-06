public class Ej011_num1_operator_num2 {
	public static void main(String args[]){

		System.out.println(calculator(3,'-',4));
		System.out.println(calculator(3,'*',4));
		System.out.println(calculator(3,'+',4));
	  }
	
	public static int calculator(int num1, char operator, int num2) {
		int result;
		
		switch(operator)
		{
			case '+': result = num1+num2; break;
			case '-': result = num1-num2; break;
			case '/': if (num2 == 0) 
									result = 0;
								else 
									result = num1/num2; 
								break;
			case '*': result = num1*num2; break;
			default: result = 0; break;
		}
		
		return result;
  }
}

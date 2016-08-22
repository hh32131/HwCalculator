
public class NormalCalculator {
	

	public int add(int a, int b){
		
		int addResult = a + b;
		
		return addResult;
	}
	
	public int sub(int a, int b){
		
		int subResult = a - b;
		
		return subResult;
	}
	
	public int mul(int a, int b){
		
		int mulResult = a * b;
		
		return mulResult;
	}
	
	public int div(int a, int b){
		
		int divResult = a / b;
		
		return divResult;
	}
	
	public int rest(int a, int b){
		
		int restResult = a - (a / b) * b;
		
		return restResult;
	}
	
	
}
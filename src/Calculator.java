import java.util.Scanner;

public class Calculator {
	
		private static Scanner input; //주석추가

		public static void main(String[] args){
			
			NormalCalculator normal = new NormalCalculator();

/*			int result = normal.add(7, 5);
			System.out.println("결과는" + result + "이다");
			result = normal.sub(7, 5);
			System.out.println("결과는" + result + "이다");
			result = normal.mul(7, 5);
			System.out.println("결과는" + result + "이다");
			result = normal.div(7, 5);
			System.out.println("결과는" + result + "이다");
			result = normal.rest(7, 5);
			System.out.println("결과는" + result + "이다");
			*/
			
			
			//NormalCalculator normal = new NormalCalculator();
			input = new Scanner(System.in);
			
			System.out.println("첫 번째 숫자를 입력하세요");
			int a= input.nextInt();
			System.out.println("두 번째 숫자를 입력하세요");
			int b= input.nextInt();
			

			int normalAdd = normal.add(a , b);
			int normalSub = normal.sub(a , b);
			int normalMul = normal.mul(a , b);
			int normalDiv = normal.div(a , b);
			int normalRest = normal.rest(a , b);
			
			System.out.println("2개의 수의 합은 "+ normalAdd );
			System.out.println("2개의 수의 차는 "+ normalSub );
			System.out.println("2개의 수의 곱은 "+ normalMul );
			System.out.println("2개의 수를 나눈 몫은 "+ normalDiv );
			System.out.println("2개의 수를 나눈 나머지는 "+ normalRest );
			
		}
}
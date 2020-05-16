
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finonacci(30, 100000);

	}
	
	public static void Finonacci(int number, int maxNumber) {
		int old =0;
		int newNum = 1;
		int temp;
		
		for(int i =0; i<number; i++) {
			temp = old + newNum;
			if(temp<maxNumber) {
			System.out.println(temp);
			old = newNum;
			newNum = temp;
			}
			else
				break;
		}
	}
	
	public static long fibonacciRecursive(int i) {
		if(i == 0) return 0;
		if(i <=2) return 1;
		else return fibonacciRecursive(i-1)+fibonacciRecursive(i-2);
		
	}

}

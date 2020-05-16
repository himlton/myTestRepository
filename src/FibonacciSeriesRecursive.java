
public class FibonacciSeriesRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumFibonacciSeries(7));

	}
	
	public static int sumFibonacciSeries(int num) {
		if (num ==0) return 0;
		else if (num==1) return 1;
		else 
		return (sumFibonacciSeries(num-1) + sumFibonacciSeries(num-2));
		
	}

}

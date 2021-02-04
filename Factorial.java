package tasks;

public class Factorial {
	public static long[] isExact(long n) {
		long product=1;
		long cnt=1;
		
		while(product<n){
			product = product*cnt;
			cnt++;
			
			if(product==n){
				return new long[] {n, cnt-1};
			}
		}	
		return new long[] {};
	}
}
//without using divide symbol , divide two numbers !!!!!

class BitMal25{
	// static int divide(int dividend,int divisor){
		// if(dividend<divisor)return 0;
		// int x=0;
		// for(int i=divisor;i<=dividend;i+=divisor){
			// x++;
		// }
		// return x;
	// }
	
	static int divide(int dividend,int divisor){
		if(dividend==divisor)return 1;
		boolean sign=true; //+ve 
		if(dividend>0 && divisor<0)sign=false;
		else if(dividend<0 && divisor>0)sign=false;
		
		long n=Math.abs(dividend);
		long d=Math.abs(divisor);
		divisor=Math.abs(divisor);
		int quotient=0;
		
		while(n>=d){
			int cnt=0;
			while(n>=(d<<(cnt+1))){
				cnt++;
			}
			quotient+=1<<cnt;
			n-=d<<(cnt);
		}
		if(quotient==1<<31 && sign)return Integer.MAX_VALUE;
		if(quotient==1<<31 && !sign)return Integer.MIN_VALUE;
		
		return sign ? quotient : -quotient;
	}
	public static void main(String[] args){
		System.out.println(divide(12,4));
		System.out.println(divide(12,3));
		System.out.println(divide(12,2));
		System.out.println(divide(22,3));
		System.out.println(divide(12,1));
	}
}
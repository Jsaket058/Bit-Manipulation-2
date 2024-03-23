class BitMal12{
	static int countSetBits(int n){
		int count=0;
		//while(n>1)for 1st and 2nd way
		while(n!=0){
			//one way
			// if(n%2==1)count++;
			// n=n/2;
			
			// two way
			// if((n&1)==1)count++;
			// n=n>>1;
			
			//third way
			n=n & (n-1);
			count++;
		}
		//for 1st  and 2nd way
		//if(n==1)count++;
		return count;
	} 
	public static void main(String[] args){
		System.out.println(countSetBits(13));
		System.out.println(countSetBits(8));
	}
}
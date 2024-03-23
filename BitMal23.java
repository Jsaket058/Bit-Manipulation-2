//Code for xor of range from 1 to n!! 

class BitMal23{
	// static int xor(int n){
		// int ans = 0;
        // for(int i=1;i<=n;i++){
			// ans=ans^i;
		// }
	// return ans;	
	// }
	
	static int xor(int n){
		// by observing the pattern we can validate the pattern as ->
		if(n%4==0) return n;
		else if(n%4==1) return 1;
		else if(n%4==2) return n+1;
		else return	0;
	}
	public static void main(String[] args){
		System.out.println(xor(10));
		System.out.println(xor(12));
		System.out.println(xor(13));
	}
}
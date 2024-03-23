//Xor between a given range from l to r
class BitMal24{
    // static int xor(int l,int r){
		// int ans=0;
		// for(int i=l;i<=r;i++){
			// ans=ans^i;
		// }
		// return ans;
	// }
	
	static int xor1(int n){
		// by observing the pattern we can validate the pattern as ->
		if(n%4==0) return n;
		else if(n%4==1) return 1;
		else if(n%4==2) return n+1;
		else return	0;
	}
	
	static int xor(int l,int r){
		return xor1(l-1)^xor1(r);
	}
	public static void main(String[] args){
		System.out.println(xor(1,4));
		System.out.println(xor(2,5));
		System.out.println(xor(2,8));
	}
}
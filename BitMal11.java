class BitMal11{
	static boolean isPower2(int n){
		return (n&n-1)==0;
	}
	
	public static void main(String[] args){
		System.out.println(isPower2(8));
		System.out.println(isPower2(10));
		System.out.println(isPower2(13));
		System.out.println(isPower2(4));
	}
}
class BitMal10{
	static int removeLastSetBit(int n){
		return n & (n-1);
	}
	public static void main(String[] args){
	System.out.println(removeLastSetBit(10));	
	System.out.println(removeLastSetBit(9));	
	System.out.println(removeLastSetBit(12));	
	System.out.println(removeLastSetBit(16));	
	}
}
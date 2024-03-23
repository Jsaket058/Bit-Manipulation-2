//very khatarnak approach !!! think out of the boxx !!!! too muchhhhhhh

import java.util.*;

class BitMal20{
	static int singleFromSetOfThree(int nums[]){
		int ones=0;
        int twos=0;
		for(int i=0;i<nums.length;i++){
			ones=(ones^nums[i])&(~twos);
			twos=(twos^nums[i])&(~ones);
		}
		return ones;
	}
	public static void main(String[] args){
	int arr[]={1,3,1,5,1,3,6,3,6,6};
	System.out.println(singleFromSetOfThree(arr));
	}
}
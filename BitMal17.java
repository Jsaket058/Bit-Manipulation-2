//Single II

//Get Single element from a set of three element present in the array
import java.util.*;

class BitMal17{
    static int singleFromSetOfThree(int nums[]){
		HashMap<Integer,Integer> mpp =new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(mpp.get(Integer.valueOf(nums[i]))==null){
				mpp.put(nums[i],1);
			}
			else{
				mpp.put(nums[i],mpp.get(nums[i])+1);
			}
		}
		for(Integer it:mpp.keySet()){
			if(mpp.get(it)==1)return it.intValue();
		}
		return -1;
	}
	public static void main(String[] args){
	int arr[]={1,3,1,5,1,3,6,3,6,6};
	System.out.println(singleFromSetOfThree(arr));	
	}
}
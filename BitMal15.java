//Single I

//Single number find out between pairs of two number 
import java.util.*;

class BitMal15{
	static int singleInDoubleElement(int nums[]){
		HashMap<Integer,Integer> mpp=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(mpp.get(Integer.valueOf(nums[i]))==null){
				mpp.put(nums[i],1);
			}
			else{
				mpp.put(nums[i],mpp.get(nums[i])+1);
			}
		}
	for(Integer num:mpp.keySet()){
		if(mpp.get(num)==1)return num.intValue();
	}
	return -1;
	}
	public static void main(String[] args){
	int arr[]={1,3,1,5,3,6,6};
	System.out.println(singleInDoubleElement(arr));
	}
}
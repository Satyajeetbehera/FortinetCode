package com.samesum;

import java.util.List;


/**
 * This class will find out if a list of integers can be divided into k groups having equal sum
 * using recursive way
 * 
 *  Time complexity O(n*k) as we have to traverse though all the nodes
 *  Space complexity O(k)
 */
public class SameSumKGroups {

	/*
	 * Check if the given list can be divided into k groups  of same sum
	 * @param list
	 * @param int
	 * @return booean
	 * 
	 */
	public  boolean separate(List<Integer> list, int k){
		// check for a single group
			if(k==1)
				return true;
		// k value cannot be greater than list size
			if(list.size() < k)
				return false;
			
			int sum =0;
			
			for(int i=0;i< list.size();i++){
				sum += list.get(i);
			}
		// if total sum is divisible by k then we can proceed further to divide
			if((sum % k) != 0 )
				return false;
			
			
			int numOfSubGroups = sum /k;
			int[] subGroup = new int[k] ;
			boolean[] subGroupCompleted  = new boolean[list.size()];
			
			for(int i =0;i<k;i++){
				subGroup[i] = 0;
			}

			
			for(int i =0;i<list.size();i++){
				subGroupCompleted[i] = false;
			}

			
			subGroup[0] = list.get(list.size()-1);
			subGroupCompleted[list.size() - 1] = true;
			    if (numOfSubGroups < subGroup[0])
			        return false;
	
		return checkKGroupsEqualSum(list, subGroup, subGroupCompleted,
			    		numOfSubGroups, k, list.size(), 0, list.size() - 1);	
}
	
	/*
	 * This method will check if k groups possible
	 * 
	 * This method will recursively check and find different combinations of k sub groups and their sum
	 * It will mark the subgroups if already considered and not count again
	 * @param list
	 * @param int
	 * @return booean
	 * 
	 */
	private static boolean checkKGroupsEqualSum(List<Integer> list, int[] subGroup, boolean[] subGroupCompleted, int numOfSubGroups,
			int k, int size, int index, int limit) {
		if (subGroup[index] == numOfSubGroups)
	    {
	        if (index == k- 2)
	            return true;
	     // used recursion to call the method and resolve
	        return checkKGroupsEqualSum(list, subGroup, subGroupCompleted, numOfSubGroups,
	                                            k, list.size(), index + 1, list.size() - 1);
	    }
		
		for (int i = limit; i >= 0; i--)
	    {
	        if (subGroupCompleted[i])
	            continue;
	        int temp = subGroup[index] + list.get(i);
	 
	        // if temp is less than subset then only include the element and call recursively
	        if (temp <= numOfSubGroups)
	        {
	        	subGroupCompleted[i] = true;
	            subGroup[index] += list.get(i);
	            boolean next = checkKGroupsEqualSum(list,subGroup, subGroupCompleted, numOfSubGroups, k, list.size(), index, i - 1);
	 
	            subGroupCompleted[i] = false;
	            subGroup[index] -= list.get(i);
	            if (next)
	                return true;
	        }
	    }
		return false;
	}
//	public static void main(String[] args) {
//		int arr[] = {2, 1, 4, 5, 3, 2};
//		List<Integer> list = new ArrayList<>();
//		list.add(2);list.add(1);list.add(4);list.add(5);list.add(6);
//	    int K = 6;
//	 
//	    if (separate(list, K))
//	        System.out.println("Partitions into equal sum is possible.");
//	    else
//	    	 System.out.println("Partitions into equal sum is not possible.");
//	}
}

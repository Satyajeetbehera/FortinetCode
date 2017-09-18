package com.multidimensionarray;

import java.util.Random;

/**
 * 
 * This class will provide sum of all the elements of multidimensional array
 * e. g int[][][] arr = {{{1, 2, 3}, {4, 5, 1, 2},{5}} ,{ {1, 9, 0, 2, 2},{1}} ,{ {12},{8, 9, 0, 1, 2},{1}} }
 * sum  = 71
 * 
 * lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
 * 
 * Time complexity O(n*k)  --> k is lengthOfDeminsion vlaues
 * Space Complexity O(1)
 *
 */
public class MultiDimensionArray {
	
	/*
	 * constructor
	 */
	public MultiDimensionArray(Object mArray){
	}
	
	/*
	 * This method will take varargs of indexOfDimension and return a Long vlaue
	 */
	 public  Long getValue(int... indexOfDimension) {
		 Random r = new Random();
		
	        Long value =  r.nextLong();
	        return value;
	    }
	 
	 
	 
	 	/*
		 * This method  takes MultiDimensionArray object and  lengthOfDeminsion array
		 * iterates each elements in the MultiDimensionArray and gets the corresponding value by calling getValue()
		 * and adding each elements value to sum and returns the final sum
		 */
	    public  Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
	    	
	    long sum = 0;
	    
    	if(mArray == null)
    		throw new NullPointerException();
    	
    	for(int i = 0; i < lengthOfDeminsion.length; i++) {
    		if(lengthOfDeminsion[i] > 1){
    			for(int j = 0; j < lengthOfDeminsion[i]; j++){
    				sum += mArray.getValue(i, j);

    			}
    		} else if (lengthOfDeminsion[i] == 1){
    			sum += mArray.getValue(i);	
    		}
    		
    	}
    	return sum;
	    }
	    


}

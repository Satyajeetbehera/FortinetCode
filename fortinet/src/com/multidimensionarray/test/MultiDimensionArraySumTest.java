package com.multidimensionarray.test;


import org.junit.Assert;
import org.junit.Test;

import com.multidimensionarray.MultiDimensionArray;


public class MultiDimensionArraySumTest {
	@Test
    public void testNotNull() {
		int[] arr = {2};
		MultiDimensionArray mArray = new MultiDimensionArray(arr);
		 Long sum = mArray.sum(mArray, new int[]{1});
	        Assert.assertNotNull(sum);
    }
	
	@Test
    public void testMultiDimensionTofindReturnTypeLong() {
		int[][][] arr = {
				{{11, 12, 13}, {14, 15, 16, 17},{5}}
				,{ {18, 19, 20, 21, 22},{1}}
				,{ {123},{8, 9, 0, 1, 2},{1}}
			};
		MultiDimensionArray mArray = new MultiDimensionArray(arr);
		 Long sum = mArray.sum(mArray, new int[]{3,2,3});
	        Assert.assertNotNull(sum);
	        Long l1 = new Long("3");
	        Assert.assertTrue(sum.TYPE == l1.TYPE);
    }

}

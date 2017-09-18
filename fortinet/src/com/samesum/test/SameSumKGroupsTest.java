package com.samesum.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.samesum.SameSumKGroups;


public class SameSumKGroupsTest {

	@Test
	public void testSeparateOneK() {
		SameSumKGroups sameSumKGroups = new SameSumKGroups();
		List<Integer> list = new ArrayList<>();
		list.add(2);list.add(1);list.add(4);list.add(5);list.add(6);
		int k = 1;
		boolean expected = sameSumKGroups.separate(list, k);
		Assert.assertEquals(expected, true);
	}
	
	@Test
	public void testSeparateKMorethanListSize() {
		SameSumKGroups sameSumKGroups = new SameSumKGroups();
		List<Integer> list = new ArrayList<>();
		list.add(2);list.add(1);list.add(4);list.add(5);list.add(6);
		int k = 6;
		boolean expected = sameSumKGroups.separate(list, k);
		Assert.assertEquals(expected, false);
	}
	
	@Test
	public void testSeparatePositiveCase() {
		SameSumKGroups sameSumKGroups = new SameSumKGroups();
		List<Integer> list = new ArrayList<>();
		list.add(2);list.add(1);list.add(4);list.add(5);list.add(6);
		int k = 3;
		boolean expected = sameSumKGroups.separate(list, k);
		Assert.assertEquals(expected, true);
	}
	
	@Test
	public void testSeparateNegativeCase() {
		SameSumKGroups sameSumKGroups = new SameSumKGroups();
		List<Integer> list = new ArrayList<>();
		list.add(2);list.add(1);list.add(4);list.add(5);list.add(6);
		int k = 4;
		boolean expected = sameSumKGroups.separate(list, k);
		Assert.assertEquals(expected, false);
	}

}


//List<Integer> list = new ArrayList<>();
//list.add(2);list.add(1);list.add(4);list.add(5);list.add(6);
//int K = 6;
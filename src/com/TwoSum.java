package com;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,17,11,15,7};
		int target=9;
		HashMap<Integer,Integer> hashmap=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			int temp=target-a[i];
			if(hashmap.containsKey(temp))
			{
				int p=hashmap.get(temp);
				System.out.println(i+1);
				System.out.println(p+1);
			}
				hashmap.put(a[i], i);
				//System.out.println("dhfhwesiu");			
		}
	}

}

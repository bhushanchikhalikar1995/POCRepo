package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class temp {

	public static void main(String[] args)
	{
		String str="BhushanChikhalikar";
		
		char[] arr=str.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}

		}
		
		
		
		for(Map.Entry<Character, Integer> e:hm.entrySet())
		{
			if(e.getValue() > 1)
				System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		
		
		
	
	}
}
package org.institutoserpis.ed;

public class Vector {
	
	public static int indexOf (int[] v , int x){
//		int index = 0;
//		while (index < v.length && v [index] !=x)
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
		for (int index = 0; index < v.length; index++)
			if (v[index]==x)
				return index;
		return -1;
	}
	
	public static int min (int[]v) {
		int num = v[0];
			for (int vposicion = 1; vposicion < v.length; vposicion++) {
				if ( v[vposicion]< num) {
					num = v[vposicion];
				}
				
				
				
			}
				
			return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v= new int [] {16,12,15,14,17};
		
		
		int index = indexOf(v, 12);
		System.out.println("indexOfX="+index);
		
	}
	
	

}

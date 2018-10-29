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
//		int num = v[0];
//			for (int vposicion = 1; vposicion < v.length; vposicion++) {
//				if ( v[vposicion]< num) {
//					num = v[vposicion];
//				}
//				
//				
//				
//			}
//				
//			return num;
		int indexOfMin = indexOfMin(v);
		return v[indexOfMin];
	}
	
	public static int indexOfMin (int[]v) {
		int num = v[0];
		int posicion = 0;
			for (int vposicion = 1; vposicion < v.length; vposicion++) {
				if ( v[vposicion]< num) {
					num = v[vposicion];
					posicion=vposicion;
				}
				
				
				
			}
				
			return posicion;
	}
	
	public static void sort(int[] v) {
		int num = v[0];
		int num1 = v[0];
		int num2 = v[0];
		int num3 = v[0];
		int num4 = v[0];
		int [] ordenado = new int [v.length];
		for (int vposicion = 1; vposicion < v.length; vposicion++) {
			if ( v[vposicion]< num) {
				num = v[vposicion];
				ordenado[0] = num;
			}
		}
		for (int vposicion1 = 1; vposicion1 < v.length; vposicion1++) {
			if ( v[vposicion1]> num) {
				num1 = v[vposicion1];
				ordenado[4] = num1;
			
			}
		
		}
		
		for (int vposicion2 = 1; vposicion2 < 4; vposicion2++) {
			if ( v[vposicion2]< num2) {
				num1 = v[vposicion2];
				ordenado[1] = num2;
			
			}
		
		}
		
		for (int vposicion3 = 1; vposicion3 < 4; vposicion3++) {
			if ( v[vposicion3]< num2) {
				num1 = v[vposicion3];
				ordenado[3] = num3;
				ordenado[2] = num4;
			}
			
		}
			
			for (int x = 0;x < ordenado.length; x++) {
				System.out.println (ordenado[x]);
			}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v= new int [] {16,12,15,14,17};
		
		
		int index = indexOf(v, 12);
		System.out.println("indexOfX="+index);
		sort (v);
	}
	
	

}

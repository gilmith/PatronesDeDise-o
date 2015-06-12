package com.jacobo.Template1;

import java.util.Arrays;

/**
 * en el metodo main lo que hago es usar el sort que esta en otra clase y se ha sobreescrito en Duck
 * @author jake
 *
 */

public class DuckSortTest {

	public static void main(String[] args) {
		
		Duck[] duckArray = new Duck[5];
		duckArray[0] = new Duck("j", 4);
		duckArray[1] = new Duck("k", 9);
		duckArray[2] = new Duck("ee", 2);
		duckArray[3] = new Duck("ff", 3);
		duckArray[4] = new Duck("nn", 7);
		
		Arrays.sort(duckArray);
		
		for(int i = 0; i < duckArray.length; i++){
			System.out.println(duckArray[i].getWeight());
		}
	}

}

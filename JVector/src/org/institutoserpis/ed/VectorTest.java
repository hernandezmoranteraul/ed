package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void indexOf() {
		int [] v= new int [] {16,12,15,14,17};
		assertEquals(0, Vector.indexOf(v, 16));
		assertEquals(2, Vector.indexOf(v, 15));
		assertEquals(4, Vector.indexOf(v, 17));
		assertEquals(-1, Vector.indexOf(v, 33));
	}
	
	@Test
	void indexofExmpty () {
		int [] v = new int [] {};
		assertEquals(-1, Vector.indexOf(v, 22));
	}
	
	@Test
	void min() {

		assertEquals(12, Vector.min(new int [] {12,15,14,17,16}));
		assertEquals(12, Vector.min(new int [] {16,12,15,14,17}));
		assertEquals(12, Vector.min(new int [] {17,16,12,15,14,12}));
		assertEquals(12, Vector.min(new int [] {12,14}));
		assertEquals(12, Vector.min(new int [] {14,12}));
		assertEquals(12, Vector.min(new int [] {12}));
	}
	
	@Test
	void indexOfMin() {
		assertEquals (2, Vector.indexOfMin(new int [] {15,14,12,17,16}));
		assertEquals (0, Vector.indexOfMin(new int [] {12,15,14,17,16}));
		assertEquals (4, Vector.indexOfMin(new int [] {15,14,16,17,12}));
		assertEquals (1, Vector.indexOfMin(new int [] {15,12}));
		assertEquals (0, Vector.indexOfMin(new int [] {12,27}));
		assertEquals (0, Vector.indexOfMin(new int [] {12}));
	}
	@Test
	void indexOfMinWhitinitialIndex() {
		assertEquals (1, Vector.indexOfMin(new int [] {16,12,15,14,17},0));
		assertEquals (2, Vector.indexOfMin(new int [] {12,13,15,17,16},2));
	}
	@Test
	void sort() {
		int[] v = new int[] {12};
		Vector.sort(v);
		assertArrayEquals(new int[] {12},v);
		v = new int[] {15,12};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,15},v);
		v = new int [] {17,12,15};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,15,17},v);
		v = new int [] {16,12,15,14,17};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,14,15,16,17},v);
		v = new int [] {12,14,15,16,17};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,14,15,16,17},v);
		
		
		
		
	}
	
}

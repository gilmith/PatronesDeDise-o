package com.jacobo.Adapter2;

import java.util.Enumeration;
import java.util.Iterator;


/**
 * con esto que consigo que un enumeration use los metodos del iterator, pero 
 * en realidad sigue siendo un enumeration
 * @author jake
 *
 */

public class EnumeratorIterator implements Iterator<E> {
	
	private Enumeration enume;

	
	public EnumeratorIterator(Enumeration enume){
		this.enume = enume;
	}
	
	
	@Override
	public boolean hasNext() {
		enume.hasMoreElements();
	}

	@Override
	public E next() {
		enume.nextElement();
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}

}

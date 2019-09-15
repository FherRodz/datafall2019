package edu.uprm.cse.datastructures.bag;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicBag implements Bag{
	

	private class BagIterator<Object> implements Iterator<Object>{
		
		private int current;
		
		public BagIterator() {
			super();
			this.current = 0;
		}

		@Override
		public boolean hasNext() {
			return this.current < currentSize;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return (Object) elements[this.current++];
			else
				throw new NoSuchElementException();
		}
		
	}

    private Object[] elements;
    private int currentSize;
    private static final int DEFAULT_SIZE = 10;
    
    public DynamicBag(int initialSize) {
            if (initialSize < 1) {
                    throw new IllegalArgumentException("Size must be at least 1");
            }
            this.elements = new Object[initialSize];
            this.currentSize = 0;
    }
    
    public DynamicBag() {
            this(DEFAULT_SIZE);
    }

	
	@Override
	public int size() {
		return this.currentSize;
	}

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	@Override
	public void add(Object e) {
		if (e == null) {
			throw new IllegalArgumentException("Argument cannot be null");
		}
		
		if (this.size() == this.elements.length) {
			this.reAllocate();
		}
		this.elements[this.currentSize++] = e;
		
	}

	
	private void reAllocate() {
		Object temp[] = new Object[2*this.size()];
		for (int i=0; i < this.size(); ++i) {
			temp[i] = this.elements[i];
 		}
		this.elements = temp;
	}

	@Override
	public boolean isMember(Object e) {
		return this.count(e) > 0;
	}

	@Override
	public boolean remove(Object e) {
		for (int i=0; i < this.size(); ++i) {
			if (this.elements[i].equals(e)) {
				this.elements[i] = this.elements[this.currentSize-1];
				this.elements[this.currentSize-1] = null;
				--this.currentSize;
				return true;
			}
		}
		return false;

	}

	@Override
	public int removeAll(Object e) {
		int result = 0;
		while(this.remove(e)) {
			result++;
		}
		return result;
	}

	@Override
	public int count(Object e) {
		int result = 0;
		for (int i=0; i < this.size(); ++i) {
			if (this.elements[i].equals(e)) {
				result++;
			}
		}
		return result;
	}

	@Override
	public void clear() {
		for (int i=0; i < this.size(); ++i) {
			this.elements[i] = null;
		}
		this.currentSize = 0;		
	}
	
	public Object[] toArray() {
		return this.elements;
	}
	public Iterator<Object> iterator() {
		return new BagIterator<Object>();
		
	}
	
	

}

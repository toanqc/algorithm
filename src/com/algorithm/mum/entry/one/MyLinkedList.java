package com.algorithm.mum.entry.one;

public class MyLinkedList<T> {

	private int size;
	private Entry<T> head;

	public MyLinkedList() {
		this.size = 0;
		head = null;
	}

	public void add(T object) {
		Entry<T> entry = new Entry<T>(object);
		entry.next = head;
		head = entry;
		size++;
	}

	public boolean find(T object) {
		Entry<T> iterator = head;
		while (iterator != null) {
			if (iterator.getObject().equals(object)) {
				return true;
			}
			iterator = iterator.next;
		}
		return false;
	}

	public int size() {
		return this.size;
	}

	@SuppressWarnings("hiding")
	class Entry<T> {
		private T object;
		private Entry<T> next;

		public Entry(T object) {
			this.object = object;
		}

		public T getObject() {
			return object;
		}

		public void setObject(T object) {
			this.object = object;
		}

		public Entry<T> getNext() {
			return next;
		}

		public void setNext(Entry<T> next) {
			this.next = next;
		}
	}
}

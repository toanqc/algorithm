package com.algorithm.mum.entry.one;

public class MyDoublyLinkedList<T> {

	private int size;
	private Entry<T> head;

	public MyDoublyLinkedList() {
		this.size = 0;
	}

	public void insertFirst(T object) {
		if (head == null) {
			head = new Entry<T>(null, object, null);
		} else {
			Entry<T> entry = new Entry<T>(null, object, head);
			head.previous = entry;
			head = entry;
		}
		size++;
	}

	public void insertLast(T object) {
		if (head == null) {
			head = new Entry<T>(null, object, null);
		} else {
			Entry<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			Entry<T> entry = new Entry<T>(current, object, null);
			current.next = entry;
		}
		size++;
	}

	public void removeFirst(T object) {
		if (head == null) {
			return;
		}

		head = head.next;
		head.previous = null;
		size--;
	}

	public void removeLast(T object) {
		if (head == null) {
			return;
		}

		Entry<T> current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		size--;
	}

	public void insertAt(int index, T object) {
		if (head == null) {
			return;
		}

		if (index < 1 || index > size) {
			return;
		}

		int i = 1;
		Entry<T> current = head;
		while (i < index) {
			current = current.next;
			i++;
		}

		if (current.previous == null) {
			Entry<T> entry = new Entry<T>(null, object, current);
			current.previous = entry;
			head = entry;
		} else {
			Entry<T> entry = new Entry<T>(current.previous, object, current);
			current.previous.next = entry;
			current.previous = entry;
		}
		size++;
	}

	public void removeAt(int index, T object) {
		if (head == null) {
			return;
		}

		if (index < 1 || index > size) {
			return;
		}

		Entry<T> current = head;
		int i = 1;
		while (i < index) {
			current = current.next;
			i++;
		}

		if (current.next == null) {
			current.previous.next = null;
		} else if (current.previous == null) {
			head = current.next;
			current = null;
		} else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		size--;
	}

	public int size() {
		return this.size;
	}

	@SuppressWarnings("hiding")
	class Entry<T> {
		private T object;
		private Entry<T> next;
		private Entry<T> previous;

		public Entry(T object) {
			this.previous = null;
			this.object = object;
			this.next = null;
		}

		public Entry(Entry<T> previous, T object, Entry<T> next) {
			this.previous = previous;
			this.object = object;
			this.next = next;
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

		public Entry<T> getPrevious() {
			return previous;
		}

		public void setPrevious(Entry<T> previous) {
			this.previous = previous;
		}
	}
}

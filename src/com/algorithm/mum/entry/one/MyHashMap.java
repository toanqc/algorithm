package com.algorithm.mum.entry.one;

public class MyHashMap<K, V> {
	private static int SIZE = 50;
	private Entry<K, V> myHashMap[];

	@SuppressWarnings("unchecked")
	public MyHashMap() {
		myHashMap = new Entry[SIZE];
	}

	public void put(K key, V value) {
		int index = getHash(key);
		storeValue(index, key, value);
	}

	public V get(K key) {
		int index = getHash(key);
		Entry<K, V> current = myHashMap[index];
		return findMatchKey(current, key);
	}

	public boolean remove(K key) {
		int index = getHash(key);
		Entry<K, V> current = myHashMap[index];

		if (current == null) {
			return false;
		}

		Entry<K, V> previous = null;
		while (current != null) {
			if (current.getKey().equals(key)) {
				if (previous == null) {
					myHashMap[index] = myHashMap[index].next;
					return true;
				} else {
					previous.next = current.next;
					return true;
				}
			}
			previous = current;
			current = current.next;
		}
		return false;
	}

	private V findMatchKey(Entry<K, V> current, K key) {
		while (current != null) {
			if (current.getKey().equals(key)) {
				return current.getValue();
			}
			current = current.next;
		}

		return null;
	}

	private void storeValue(int index, K key, V value) {
		Entry<K, V> list = myHashMap[index];

		if (list == null) {
			myHashMap[index] = new Entry<K, V>(key, value);
		} else {
			boolean finish = false;
			while (list.next != null) {
				if (list.getKey().equals(key)) {
					list.setValue(value);
					finish = true;
					break;
				}
				list = list.next;
			}

			if (finish) {
				list.next = new Entry<K, V>(key, value);
			}
		}
	}

	private int getHash(K key) {
		return key.hashCode() % SIZE;
	}

	@SuppressWarnings("hiding")
	class Entry<K, V> {
		private K key;
		private V value;
		private Entry<K, V> next = null;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public Entry<K, V> getNext() {
			return next;
		}

		public void setNext(Entry<K, V> next) {
			this.next = next;
		}
	}
}

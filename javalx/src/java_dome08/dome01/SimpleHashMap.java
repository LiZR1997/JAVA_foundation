package java_dome08.dome01;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

	/**
	 * @param args
	 */
	static final int SIZE = 997;
	
	LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
	
//	public V put(K key , V value) {
//		V oldValue = null;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}

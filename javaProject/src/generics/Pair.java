package generics;

public class Pair<K,V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public void setKey(k Key) {this.key = key;}
	public void setValues(V value) {this.value = value ;}
	public K getkey() {return key;}
	public V getValue() { return value;}
	
}

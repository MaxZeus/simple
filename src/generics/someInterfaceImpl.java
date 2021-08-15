package generics;

public class someInterfaceImpl<K, V> implements someInterface<K, V> {
    private K k;
    private V v;

    @Override
    public void setKV(K k, V v) {
        this.k = k;
        this.v = v;
    }

    @Override
    public K getK() {
        return k;
    }

    @Override
    public V getV() {
        return v;
    }
}

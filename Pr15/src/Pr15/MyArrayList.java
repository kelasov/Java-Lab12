package Pr15;

public class MyArrayList<T> {
    private final int max = 16;
    private final int min = 2;
    private Object[] obj = new Object[max];
    private int k = 0;

    public void add(T key) {
        if(k == obj.length-1)
            resize(obj.length*2);
        obj[k++] = key;
    }

    public T get(int a) {
        return (T) obj[a];
    }

    public void remove(int a) {
        for (int i = a; i<k; i++)
            obj[i] = obj[i+1];
        obj[k] = null;
        k--;
        if (obj.length > max && k < obj.length / min)
            resize(obj.length/2);
    }

    public int size() {
        return k;
    }

    private void resize(int re) {
        Object[] obj2 = new Object[re];
        System.arraycopy(obj, 0, obj2, 0, k);
        obj = obj2;
    }
}
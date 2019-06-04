package hello.app.effective.java.composition;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E> {
    private int count = 0;
    
    public InstrumentedHashSet(){}
    
    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        count++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count += c.size();
        return super.addAll(c);
    }

    public int getCount() {
        return count;
    }
}

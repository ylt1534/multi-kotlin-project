package hello.app.effective.java.composition;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E> {

    private int count = 0;
    
    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        count++;
        return super.add(e);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> c) {
        count += c.size();
        return super.addAll(c);
    }

    public int getCount() {
        return count;
    }
}

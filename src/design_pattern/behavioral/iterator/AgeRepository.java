package design_pattern.behavioral.iterator;

public class AgeRepository implements Container {

    @Override
    public Iterator getIterator() {
        return new AgeIterator();
    }
}


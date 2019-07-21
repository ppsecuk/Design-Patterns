package design_pattern.behavioral.iterator;

public class AgeIterator implements Iterator {
    int age[] = {1,2,3,4,5};
    int index;
    @Override
    public boolean hasNext() {
        if(index < age.length){
            return true;
        }
        return false;
    }
    @Override
    public Object next() {
        if(this.hasNext()){
            return age[index++];
        }
        return null;
    }
}

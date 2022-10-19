package Iterator.Iterator;

public class NameRepository implements Container{

    private String[] name={"john","alice","marry","shiron"};

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int next=0;

        @Override
        public boolean hasNext() {
            if(next<name.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return name[next++];
        }
    }
}

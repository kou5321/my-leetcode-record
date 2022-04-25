package DataStructureDesign;

import java.util.Iterator;

public class PeekingIterator284 {
    class PeekingIterator implements Iterator<Integer> {
        Iterator<Integer> iterator;
        Integer nextElement;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            this.nextElement = this.iterator.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return nextElement;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer res = nextElement;
            nextElement = iterator.hasNext() ? iterator.next() : null;
            return res;
        }

        @Override
        public boolean hasNext() {
            return nextElement != null;
        }
    }
}

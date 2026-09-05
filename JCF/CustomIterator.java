package JCF;

import java.util.*;

public class CustomIterator {

    public static void main(String[] args) {

        String[] names = {"Aditya", "Rohit", "Rohan", "Monu"};

        NameContainer container = new NameContainer(names); 
        for (String name : container) {             //Iterator<String> it=container.iterator();
           System.out.println(name);                //while(it.hasNext()){
        }                                           //  Syso(it.next());
    }                                               // }
}

class NameContainer implements Iterable<String> {

    private String[] names;
    private int size;

    NameContainer(String[] names) {
        this.names = names;
        this.size = names.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new NameContainerIterator();
    }
    private class NameContainerIterator implements Iterator<String> {
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < size;
        }

        @Override
        public String next() {
            return names[pos++];
        }
    }
}
/*Using anonymous class
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public String next() {
                return names[pos++];
            }
        };
    }
}
*/
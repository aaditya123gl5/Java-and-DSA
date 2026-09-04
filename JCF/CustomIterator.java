package JCF;

import java.util.*;

public class CustomIterator {

    public static void main(String[] args) {

        String[] names = {"Aditya", "Rohit", "Rohan", "Monu"};

        NameContainer container = new NameContainer(names);

        for (String name : container) {
            System.out.println(name);
        }
    }
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
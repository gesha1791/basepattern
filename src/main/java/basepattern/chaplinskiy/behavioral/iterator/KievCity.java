package basepattern.chaplinskiy.behavioral.iterator;

public class KievCity implements Collection {
    private String name;
    private String[] sights;

    public KievCity(String name, String[] sights) {
        this.name = name;
        this.sights = sights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSights() {
        return sights;
    }

    public void setSights(String[] sights) {
        this.sights = sights;
    }

    @Override
    public Iterator getIterator() {
        return new SightsIterator();
    }

    private class SightsIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < sights.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return sights[index++];
        }
    }
}

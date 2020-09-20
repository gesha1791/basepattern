package basepattern.chaplinskiy.behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] sights = {"Roshen", "Adidas", "Puma", "Monuments"};

        KievCity kiev = new KievCity("Kiev", sights);

        Iterator iterator = kiev.getIterator();
        System.out.println("City: " + kiev.getName());
        System.out.println("Sights: ");

        while (iterator.hasNext()) System.out.println(iterator.next().toString());
    }
}

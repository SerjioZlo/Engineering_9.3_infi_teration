import java.util.ArrayList;
import java.util.Iterator; import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                current = random.nextInt(max - min + 1) + min;
                return current;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
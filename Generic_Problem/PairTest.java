package Generic_Problem;
class PairTes<T, U> {
    private T first;
    private U second;

    public PairTes(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

public class PairTest {
    public static void main(String[] args) {

        PairTes<String, Integer> student = new PairTes<>("Amol", 20);

        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());
    }
}
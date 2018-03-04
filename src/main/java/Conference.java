public class Conference extends Room {

    private int cost;
    private String name;

    public Conference(int capacity, int cost, String name) {
        super(capacity);
        this.cost = cost;
        this.name = name;
    }
}

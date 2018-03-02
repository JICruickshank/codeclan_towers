import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private String type;
    private int cost;

    public Bedroom(int capacity, int number, String type, int cost) {
        super(capacity);
        this.number = number;
        this.type = type;
        this.cost = cost;
    }

    public int getNumber() {
        return this.number;
    }
}

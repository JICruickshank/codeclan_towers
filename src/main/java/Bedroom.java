import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private RoomType type;
    private int cost;

    public Bedroom(int capacity, int number, RoomType type, int cost) {
        super(capacity);
        this.number = number;
        this.type = type;
        this.cost = cost;
    }

    public RoomType getRoomType() {
        return type;
    }

    public int getNumber() {
        return number;
    }


}

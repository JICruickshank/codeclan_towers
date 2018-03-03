public enum RoomType {
    TWIN(2),
    DOUBLE(2),
    FAMILY(4);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}



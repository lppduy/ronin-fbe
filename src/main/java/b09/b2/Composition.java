package b09.b2;

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class House {
    private Room room;  // Composition: House "has a" Room and owns it

    public House(String roomName) {
        this.room = new Room(roomName);
    }

    public void showDetails() {
        System.out.println("House with room: " + room.getName());
    }
}

public class Composition {
    public static void main(String[] args) {
        House house = new House("Living Room");
        house.showDetails();  // Output: House with room: Living Room
    }
}


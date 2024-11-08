import java.util.ArrayList;
import java.util.List;

public class House {

    private ArrayList<Room> rooms = new ArrayList<>();
    public House(){
        //this.rooms = new ArrayList<>();
        this.rooms.add(new Room("Living Room"));
        this.rooms.add(new Room("Bathroom"));
        this.rooms.add(new Room("Bedroom"));
        this.rooms.add(new Room("Kitchen"));
    }

    public void getRoomsList(){
        for(Room room : rooms ){
            System.out.println(room.getRoomName());
        }
    }
    //other properties and methods.

}

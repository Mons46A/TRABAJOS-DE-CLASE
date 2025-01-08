public class Room {
    byte roomNumber;
    Doctor doc;
    Owner owner;

    public Room(byte roomNumber, Doctor doc){
        this.roomNumber = roomNumber;
        this.doc = doc;
    }

    public void assignRoom(Owner costumer){
        this.owner = costumer;
    }
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner){

    }
}

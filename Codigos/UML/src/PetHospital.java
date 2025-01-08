import java.util.ArrayList;
import  java.util.List;

public class PetHospital {
    String nameVet;
    ArrayList<Room> rooms;
    ArrayList<Owner> costumers = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();

    // Constructor
    public PetHospital(String nameVet, ArrayList<Room> rooms){
        this.nameVet = nameVet;
        this.rooms = rooms;
    }
    // agregar nuevos clientes
    public boolean addNewCostumer(Owner newCostumer){
        this.costumers.add(newCostumer);
        return true;
    }

    public ArrayList<Owner> getCostumers(){
        return this.costumers;
    }
    // agregar doctor
    public boolean addNewDoctor(Doctor newDoctor){
        this.doctors.add(newDoctor);
        return true;
    }

    public ArrayList<Doctor> getDoctors() {
        return this.doctors;
    }

    //agregar consultorio
    public boolean addNewRoom(Room newRoom) {
        this.rooms.add(newRoom);
        return true;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }
}

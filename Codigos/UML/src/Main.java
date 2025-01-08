import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Doctor doc1 = new Doctor("Pablo Marmol", (byte) 1);

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room((byte) 1, doc1);
        rooms.add(room1);

        //crear una nueva veterianria
        PetHospital mascotaFeliz = new PetHospital("Mascota feliz", rooms);
        Pet litoRodriguez = new Pet("Lito Rodriguez", (byte) 2, 1.5f, 0.5f, 0.3f );
        Owner costumer = new Owner("Juanito Perez", litoRodriguez, 123456789, (byte)1);
        mascotaFeliz.addNewCostumer(costumer);
        System.out.println(mascotaFeliz.getCostumers());
    }
}

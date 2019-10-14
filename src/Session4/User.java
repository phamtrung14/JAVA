package Session4;

import java.util.ArrayList;

public class User {
    public int tuoi;
    public String ten;
    public int cmnd;
    public ArrayList<Room> danhsach ;
    public User(){
        danhsach = new ArrayList<>();
    }
    public void themSinhVien(Room sv){
        this.danhsach.add(sv);
        this.danhsach.remove(sv);
    }
    public static void Room(String args[]){

    }

}

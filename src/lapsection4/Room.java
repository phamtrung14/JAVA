package lapsection4;

import java.util.ArrayList;

public class Room {
    public String tenphong;
    public String vitri;
    public ArrayList<User> dsNguoidung;

    public Room(){
        this.dsNguoidung = new ArrayList<>();
    }

    public String getTenPhong() {
        return tenphong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenphong = tenPhong;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

   public void themNguoiDung(User u){
        this.dsNguoidung.add(u);
   }
   public void xoaNguoiDung(User u){
        this.dsNguoidung.remove(u);
   }

   public void showInfo(){
        System.out.println("ten phong: "+this.getTenPhong());
        System.out.println("Vi tri: "+this.getVitri());
//        for (int i =0;i<this.dsNguoidung.size();i++){
//            System.out.println(this.dsNguoidung.get(i).getTen());
//            System.out.println(this.dsNguoidung.get(i).getTuoi());
//            System.out.println(this.dsNguoidung.get(i).getCmnd());
//        }

        for (User u: this.dsNguoidung){
//            System.out.println(u.getTen());
//            System.out.println(u.getTuoi());
//            System.out.println(u.getCmnd());
            u.getInfo();
        }
   }


}

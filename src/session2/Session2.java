package session2;

import java.util.Scanner;

public class Session2 {


    //contractor
    public Session2(){
//        System.out.println("vua tao doi tuong sessicon2 xog");
        inputInfo();
        showInfo();
    }
    //khai bao thuoc tinh,bien
    public  String name;
    public  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //khia bao phuong thuc
    public void showInfo(){
        System.out.println("full name:"+name);

        System.out.println("Age: "+age);
    }


    public  void  inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten:");
        //next line nhap chuoi
        setName(sc.nextLine());
        System.out.println("nhap tuoi: ");
        //next int nhaapj so
        setAge(sc.nextInt());
    }
    public  static void main(String args[]){
//        Session2 ss2 = new Session2();
//        ss2.inputInfo();
//        ss2.showInfo();
//        Session2 ss3 = new Session2();
//        ss3.inputInfo();
//        ss3.showInfo();
//        System.out.println("so sanh");
//        System.out.println("SS2 name:"+ss2.getName());
//        System.out.println("SS3 name"+ss3.getName());
        SoNguyenTo1 snt = new SoNguyenTo1();
        for (int i=0;i<10;i++){
            int x = snt.timSoNguyenToTiepTheo();
            snt.setA(x);
            System.out.println(snt.getA());
        }
        int z =43;
        snt.setA(z);
        System.out.println("next: "+snt.timSoNguyenToTiepTheo());

    }

    public static void sayHello(){
        System.out.println("hello World");

    }
    // ham phai co static thuoc tinhs thif co the dung nhau dc
    // sử dung public thì có thể dung bất cứ đau cả kể sesion 1
    //su dung protected giới hạn chỉ sử dungjtrong  pakage ngoài pakage
    //extends là kế thừa
    //private  chi viết trong nội bộ của file
}

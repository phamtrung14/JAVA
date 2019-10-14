package Session1;

import session2.Session2;

import java.util.Scanner;

public class Section1 {
    int age = 20 ;
    static String say = "hello";
    public static void main(String args[]){
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println(say);
//        System.out.println(Section1.say);

        System.out.println("nhap so tu ban phim");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Sau khi nhap x = "+ x);
//laaysthuoocj tính age o sécion1
        Section1 ss1 = new Section1();
        System.out.println("Age =" +ss1.age );

        int[] ary = {1,2,3,4,5};
//        int[] arr = new int[5];
        //dem chi so gioi han
//        for (int i =0;i<5;i++){
//            System.out.println(ary[i]);
//        }

        //dem het cac chi so
        for (int z:ary){
            System.out.println(z);
        }
        Session2 ss = new Session2();
        ss.showInfo();
    }
}

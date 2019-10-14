package bkdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai2 {
    String tenSinhVien;
    int tuoi;
    float diemJava;
    public static void main(String[] args){
        Bai2 bai2 = new Bai2();

        bai2.getTime();
        bai2.copyArray();

        System.out.println("ten class la: "+ bai2.getClass().getName());
        Field arrField[]= bai2.getClass().getDeclaredFields();
        System.out.println("Bai2 co cac bien :");
        for(int i = 0;i < arrField.length;i++){
            Field thuocTinh = arrField[i];
            System.out.println(thuocTinh.getName());
        }

        Method arrMethod[] = bai2.getClass().getDeclaredMethods();
        System.out.println("Bai2 co cac ham: ");
        for (int i=0;i<arrMethod.length;i++ ){
            Method thuocTinh = arrMethod[i];
            System.out.println(thuocTinh.getName());
        }

    }

    public void copyArray(){
        int arrSoNguyen[] = new int[]{1,6,5,2,8};
        int temp[] = new int[5];
        System.arraycopy(arrSoNguyen,0,temp,0,arrSoNguyen.length);
        for(int i =0;i<temp.length;i++){
            System.out.println("#"+temp[i]);
        }
    }

    public void getTime(){
        long time = System.currentTimeMillis();
        Date date = new Date(time);
        System.out.println("currentTimeMillis = "+ time);
        Format format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("Date ="+ format.format(date));
    }
}

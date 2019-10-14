package Session4;

import java.util.ArrayList;

public class Main {

    public static  void main(String args[]){
        ArrayList arrList = new ArrayList();// arraylist đẻ tạo tập hơp
        arrList.add(3);
        arrList.add("xin chào");

        arrList.add(1,4);//1 là vị trí giá trị của nó

        for (int i=0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }

        ArrayList arr2 = new ArrayList();
        arr2.add(17);//dung hang add thi them vao cuoi hàng

        arr2.addAll(arrList);
        for (int i=0;i<arrList.size();i++){
            System.out.println((arr2.get(i)));
        }

       

    }
}

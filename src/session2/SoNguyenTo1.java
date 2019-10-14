package session2;

public class SoNguyenTo1 {
    public int a =2;

    public boolean isSoNguyenTo1(int x){
        for (int i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public int timSoNguyenToTiepTheo(){
        for (int i=a+1;true;i++){
            if (isSoNguyenTo1(i)){
                return i;
            }
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isSoNguyenTo1(a)) {
            this.a = a;
        }

    }

//    public void setA(int a){
//        if (isSoNguyenTo1(a)){
//            this.a = a;
//
//        }
//        System.out.println("ko phai la so nguyen to");


}

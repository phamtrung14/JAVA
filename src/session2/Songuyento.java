package session2;



public class Songuyento {
    public int a =2;

   public boolean isSoNguyenTo(int x){
       for (int i=2;i<=x/2;i++){
           if(x%i==0){
               return false;
           }
       }
       return true;
   }
    public int timSoNguyenToTiepTheo(){
       for (int i=a+1;true;i++){
           if (isSoNguyenTo(i)){
               return i;
           }
       }
    }
    public int getA(){
       return a;
    }
    public void setA(int a){
       if (isSoNguyenTo(a)){
           this.a = a;
           return;
       }
       System.out.println("ko phai la so nguyen to");
    }
}

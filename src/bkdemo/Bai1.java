package bkdemo;

public class Bai1 {
    public static void main(String[] args){
        System.out.println("random:"+ Math.random());
        System.out.println("ceil:"+ Math.ceil(Math.PI));
        System.out.println("floor:"+ Math.floor(Math.PI));
        System.out.println("cbrt:"+ Math.cbrt(-27));
        System.out.println("sqrt:"+ Math.sqrt(4));
        System.out.printf("sin:%f",Math.sin(Math.PI));
        System.out.printf("\ncos:%f",Math.cos(Math.PI));
        System.out.printf("\ntan:%f\n",Math.tan(Math.PI));
        System.out.println("incrementExact:"+Math.incrementExact(6));
        System.out.println("incrementExact(long):"+Math.incrementExact(9l));
        System.out.println("negateExact:"+Math.negateExact(69));
        System.out.println("nextDown"+Math.nextDown(69));
        System.out.println("toRadians:"+Math.toRadians(90)+"Because 1 PI = 180: =>"+Math.PI/2);
        System.out.println("toDegrees:"+Math.toDegrees(Math.toRadians(90)));


        Bai1 bai1 = new Bai1();
        bai1.dienTichHinhTron(2);

    }
    private void dienTichHinhTron(float banKinh){
        double dienTich = Math.pow(banKinh,2)*Math.PI;
        System.out.println("Dien tich hinh tron la: " + dienTich);
    }


}

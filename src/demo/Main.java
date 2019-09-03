package demo;

public class Main {
    public static void main(String[] args) {
//        int soCanKT;
//        soCanKT = 3;
//        boolean ketQua;
//        ketQua = true;
//        for (int i=2; i<soCanKT/2; i++)
//            if (soCanKT % i == 0) ketQua = false;
//        System.out.println(ketQua);
//
        SNT sNT = new SNT ();
        sNT.soKT = 10;
        sNT.kiemTra();
        System.out.println("ket qua: " + sNT.ketQua);

        SNT sNT1 = new SNT ();
        sNT1.soKT = 5;
        sNT1.kiemTra();
        System.out.println("ket qua: " + sNT1.ketQua);

    }
}

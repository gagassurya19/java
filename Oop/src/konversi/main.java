package konversi;
import  java.util.Scanner;
public class main {
    public static void print(String p){
        System.out.println(p);}
    public static void main(String[] args) {
        //Tombol kembali
        String balik="y";
        while (balik.equals("y")){
        Scanner input = new Scanner(System.in);
        print("-------------------------------");
        print("Pilih menu yang diinginkan : ");
        print("1. desimal\n2. Oktal\n3. Hexa\n4. Biner");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        if (pilih >=5) {
            System.out.println("EAA:V nomor yang kamu masukkan salah!");
        } else  
        switch(pilih){
            case 1 :{
                desimal prosesdes = new desimal();
                print("masukkan angka desimal : ");
                prosesdes.konversi = input.nextInt();
                print("Angka desimal -> Biner : "+prosesdes.desbinary());
                print("Angka desimal -> Hexa : "+prosesdes.desoktal());
                print("Angka desimal -> Octal : "+prosesdes.deshexa());
            } break;
            case 2 : {
                oktal prosesokt = new oktal();
                print("Masukkan angka oktal : ");
                prosesokt.konversi = input.next();
                print("Angka oktal -> desimal : "+prosesokt.oktaldes());
                print("Angka oktal -> hexa : "+prosesokt.oktalhex());
                print("Angka oktal -> biner : "+prosesokt.oktalbin());
            } break;
            case 3 : {
                hexadesimal proseshex = new hexadesimal();
                print("Masukkan angka hexa : ");
                proseshex.konversi = input.next();
                print("Angka hexadesimal -> desimal : "+proseshex.hexades());
                print("Angka hexadesimal -> oktal : "+proseshex.hexaokt());
                print("Angka hexadesimal -> biner : "+proseshex.hexabin());
            } break;
            case 4 : {
                biner prosesbin = new biner();
                print("Masukkan angka biner : ");
                prosesbin.konversi = input.next();
                print("Angka biner -> desimal : "+prosesbin.bindes());
                print("Angka biner -> oktal : "+prosesbin.binokt());
                print("Angka biner -> hexa : "+prosesbin.binhexa());
            } break;   
        }
        System.out.println("=====================");
        System.out.println("Ingin Mengulang ? (y/t)");
        balik = input.next();
        }
        System.out.println("MAKASIH :)");
    }
}
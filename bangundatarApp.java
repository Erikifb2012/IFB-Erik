import java.util.*;

public class bangundatarApp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int a;
	double s,p,l,al,t,r,L,LP,LS,LL;
	System.out.println("Selamat Datang di Aplikasi Penghitung Bangun Datar");
	System.out.println("__________________________________________________");
	do
	{
	System.out.println();
	System.out.println("Silahkan Pilih Bangun Datar yang ingin Anda Hitung");
	System.out.println("1.Persegi");
	System.out.println("2.Persegi Panjang");
	System.out.println("3.Segitiga");
	System.out.println("4.Lingkaran");
	System.out.println("0.keluar");
	System.out.println("Masukkan Pilihan Anda: ");
	a=input.nextInt();
	switch(a)
	{
	case 1 : System.out.println("Masukkan sisi Persegi dalam satuan centimeter: ");
		s=input.nextDouble();
		L=s*s;
		System.out.println("Luas Persegi tersebut adalah "+L+" centimeter persegi");
		break;
	case 2 : System.out.println("Masukkan Panjang dalam satuan centimeter: ");
		p=input.nextDouble();
		 System.out.println("Masukkan Lebar dalam satuan centimeter: ");
		l=input.nextDouble();
		LP=p*l;
		System.out.println("Luas Persegi Panjang tersebut adalah "+LP+" centimeter persegi");
		break;
	case 3 : System.out.println("Masukkan Alas dalam satuan centimeter: ");
		al=input.nextDouble();
		System.out.println("Masukkan Tinggi dalam satuan centimeter: ");
		t=input.nextInt();
		LS=0.5*al*t;
		System.out.println("Luas Segitiga tersebut adalah "+LS+" centimeter persegi");
		break;
	case 4 : System.out.println("masukkan jari-jari dalam satuan centimeter: ");
		r=input.nextDouble();
		LL=3.14*r*r;
		System.out.println("Luas Lingkaran tersebut adalah "+LL+" centimeter persegi");
		break;
	case 0 : break;
	default:System.out.println("Pilihan tidak tersedia");
	}
     }
	while(a!=0);
	
   }
}
	
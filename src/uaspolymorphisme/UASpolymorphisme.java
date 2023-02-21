package uaspolymorphisme;
public class UASpolymorphisme {
    public static void main(String[] args) {
BangunRuang br = new BangunRuang();
Balok b = new Balok(2,5,4);
Kubus k = new Kubus(5);
Tabung t = new Tabung(14,2);


br.isi();
        System.out.println("Isi Balok Adalah : "+b.isi());
        System.out.println("Isi Kubus Adalah : "+k.isi());
        System.out.println("Isi Tabung Adalah : "+t.isi());
    }
    
}

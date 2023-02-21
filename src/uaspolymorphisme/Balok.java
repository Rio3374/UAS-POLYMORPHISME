package uaspolymorphisme;
public class Balok extends BangunRuang {
int panjang;
int lebar;
int tinggi;

public Balok(int panjang, int lebar, int tinggi){
this.panjang=panjang;
this.lebar=lebar;
this.tinggi=tinggi;
}    
@Override
public float isi(){
return (this.panjang*this.lebar)*this.tinggi;
}
}

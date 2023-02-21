package uaspolymorphisme;
public class Tabung extends BangunRuang {
int r;
int t;

public Tabung(int r, int tinggi){
this.r=r;
this.t=tinggi;
}    
@Override
public float isi(){
return (float) (Math.PI*this.r*this.r)*this.t;
}
}

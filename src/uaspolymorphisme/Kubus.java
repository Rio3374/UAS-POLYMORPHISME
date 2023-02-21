package uaspolymorphisme;
public class Kubus extends BangunRuang {
int s;

public Kubus(int sisi){
this.s=sisi;
}    
@Override
public float isi (){
return this.s*this.s*this.s;
}
}

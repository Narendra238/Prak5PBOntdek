public class Persegi extends Bangundatar{
    public Persegi(double P,double L){
        super(P,L);
    }

    public double Luas(){
        return getL()*getP();
    }
    public double Keliling(){
        return 2*(getL()+getP());
    }
}
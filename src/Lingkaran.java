public class Lingkaran extends Bangundatar{
    public Lingkaran(double P,double L) {
        super(P,L);
    }

    public double Luas(){
        return 3.14*getL()*getL();
    }
    public double Keliling(){
        return 2*3.14*getL();
    }

}


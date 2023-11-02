public class Mahasiswa extends Manusia{
    private String NIM;
    public Mahasiswa(String nama,int umur, String NIM){
        super(nama, umur);
        this.NIM = NIM;
    }
    public void perkenalan(){
        System.out.println("Nama : " + super.nama + " , saya "+ super.umur + " tahun.");
        System.out.println("Nim : " + this.NIM);
    }
    public void makan(String makanan,int porsi){
        System.out.println(makanan + " rasanya enak sampe habis " + porsi + " piring");
    }

}

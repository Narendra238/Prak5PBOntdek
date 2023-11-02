public class Manusia {
    protected String nama;
    protected int umur;
    public Manusia(String nama,int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public void perkenalan(){
        System.out.println("Nama : " + this.nama + " , saya "+ this.umur + " tahun.");
    }
    public void makan(String makanan){
        System.out.println(makanan + " rasanya enak");
    }
}

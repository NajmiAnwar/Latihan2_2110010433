package universitas;

public class Mahasiswa {
    private int nim;
    private String nama, prodi;

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    
    
    public void viewdata(){
        System.out.println("Nama  : \t"+ nama);
        System.out.println("NIM   : \t"+ nim);
        System.out.println("Prodi : \t"+ prodi);
    }

    
}

package latihan01;

class bidangDuaDimensi {
    protected String nama;

    //Constructor
    public bidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    //method
    public void info() {
        System.out.println("Nama bidang : " + nama);
    }

    double luas() {
        return 0;
    }
}

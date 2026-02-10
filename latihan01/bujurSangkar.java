package latihan01;

class bujurSangkar extends bidangDuaDimensi{
    private double sisi;

    //constructor
    public bujurSangkar(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }
}

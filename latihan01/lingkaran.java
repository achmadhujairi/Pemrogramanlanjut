package latihan01;

class lingkaran extends bidangDuaDimensi{
    private double jarijari;

    //constructor
    public lingkaran(String nama, double jarijari) {
        super(nama);
        this.jarijari = jarijari;
    }

    @Override
    double luas() {
        return 3.14 * jarijari * jarijari;
    }
}

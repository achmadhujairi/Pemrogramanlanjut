package latihan01;

public class App {
    public static void main(String[] args) {
        bidangDuaDimensi a = new bujurSangkar("Bujur Sangkar", 7);
        bidangDuaDimensi b = new lingkaran("Lingkaran", 5);

        a.info();
        System.out.println("Luas : " + a.luas());

        b.info();
        System.out.println("Luas : " + b.luas());

    }
}

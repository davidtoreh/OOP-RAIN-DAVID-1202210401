public class MainApp {
    public static void main(String[] args) {
        TransportasiAir transportasiAir1 = new TransportasiAir(4, 20000);
        Sampan sampan1 = new Sampan(20, 50000, 2);
        Kapal kapal1 = new Kapal(50, 100000 , "Diesel");

    transportasiAir1.informasi();
    transportasiAir1.berlayar();
    transportasiAir1.berlabuh();
    System.out.println();
    sampan1.informasi();
    sampan1.berlayar();
    sampan1.berlabuh();
    sampan1.berlabuh(2);
    System.out.println();
    kapal1.informasi();
    kapal1.berlayar();
    kapal1.berlayar(20);
    kapal1.berlabuh();

    }
}
public class MainApp {
    public static void main(String[] args) {
        
        Perangkat perangkat1 = new Perangkat("Adata",2,(float)1.80);
        Laptop laptop1 = new Laptop("Seagate", 16, (float)2.50, false);
        Handphone handphone1 = new Handphone("Sandisk",4,(float)2.20,false);

        perangkat1.informasi();
        System.out.println();
        laptop1.informasi();
        laptop1.bukaGame("Point Blank");
        laptop1.kirimEmail("davidtoreh12@gmail.com");
        laptop1.kirimEmail("torehsukatayo@gmail.com","davidtoreh12@gmail.com");

        System.out.println();
        handphone1.informasi();
        handphone1.telfon(628139876);
        handphone1.kirimSMS(628127875, 628525736);
    }
}
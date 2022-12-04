public class MainApp {
    public static void main(String[] args) {
        Perangkat p = new Perangkat("Adata", 2, (float) 1.00);
        Laptop l = new Laptop("Adata", 2, (float) 1.00, false);
        Handphone h = new Handphone("Adata", 2, (float) 1.00, true);
        
        System.out.println(p.informasi());
        System.out.println("");
        System.out.println(l.informasi());
        System.out.println(l.bukaGame("dota"));
        System.out.println(l.kirimEmail("bbshdjs"));
        System.out.println(l.kirimEmail("ndjsd", "dndj"));
        System.out.println("");
        System.out.println(h.informasi());
        System.out.println(h.telfon(665));
        System.out.println(h.kirimSMS(665));
        System.out.println(h.kirimSMS(665, 771));
    }
    
}
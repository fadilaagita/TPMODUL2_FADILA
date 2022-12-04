public class Laptop extends Perangkat{
    protected boolean webcam;

    Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    public String bukaGame(String nama_game){
        String info = ("Laptop berhasil membuka game "+ nama_game);
        return info;
    }
    
    public String kirimEmail(String email){
        String info = ("Laptop berhasil mengirim email ke "+ email);
        return info;
    }
    
    public String kirimEmail(String email1, String email2){
        String info = ("Laptop berhasil mengirim email "+ email1+" dan ke "+email2);
        return info;
    }
    
    @Override
    public String informasi(){
        String wb;
        if(webcam == true){
           wb = "juga memiliki";
        }else{
            wb = "TIDAK memiliki";
        }
        
        return "Laptop tidak diketahui memiliki drive tipe "+drive+" ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz."+
                " Selain itu Laptop ini "+wb+" webcam";
    }
    
}
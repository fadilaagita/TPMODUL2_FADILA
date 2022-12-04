public class Handphone extends Perangkat{
    protected boolean fingerprint;

    Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
   public String telfon(int no_hp){
       String info = "Handphone berhasil menyambungkan telfon ke No "+no_hp;
       return info;
   }
   
   public String kirimSMS(int no_hp){
       String info = "Handphone berhasil mengirim SMS ke No "+no_hp;
       return info;
   }
   
   public String kirimSMS(int no_hp1, int no_hp2){
       String info = "Handphone berhasil mengirim SMS ke No "+no_hp1+" dan ke No "+ no_hp2;
        return info;
       
   }
    
    @Override
    public String informasi(){
        String fg;
        if(fingerprint == true){
           fg = "juga memiliki";
        }else {
            fg = "TIDAK memiliki";
        }
        
        return "Handphone tidak diketahui memiliki drive tipe "+drive+" ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz."+
                "Selain itu handphone ini "+fg+" fingerprint";
    }

    
    
}

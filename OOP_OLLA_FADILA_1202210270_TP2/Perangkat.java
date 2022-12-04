public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    
    Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    
    public String informasi(){
        String info = "Perangkat tidak diketahui memiliki drive tipe "+drive+" ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz";
        return info;
    }
    
}
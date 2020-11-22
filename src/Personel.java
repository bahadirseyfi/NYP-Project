public class Personel {
    private String isim;
    private String soyisim;
    private Integer sistem_id;

    Personel(String isim, String soyisim, Integer sistem_id){
        this.isim = isim;
        this.soyisim = soyisim;
        this.sistem_id = sistem_id;
    }

    public void gorev_belirtme(){
        System.out.println("Yabancı Öğrenciye Atanan Personelin Görevi Belirtir");
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }
}

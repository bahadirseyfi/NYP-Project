
public class Ogrenci {
    private String isim;
    private Integer numara;
    private String ulke;
    private String fakulte;
    private Integer sinif;
    static Integer ogrenci_onayi = 1;
    private boolean devamsizlik_durumu = false;
    private boolean sinav = false;

    Ogrenci(String isim,Integer numara,String ulke,String fakulte,Integer sinif){
        System.out.println("Yeni Yabancı Öğrenci Kaydı Oluşturuluyor");
        this.ogrenci_onayi = ogrenci_onayi;
        ogrenci_onayi = Dekanlik.yeni_ogrenci_kaydi();
        this.isim = isim;
        this.numara = numara;
        this.ulke = ulke;
        this.fakulte = fakulte;
        this.sinif = sinif;
        //OLUŞTURULAN ÖĞRENCİLERİN KAYDI VAR İSE DANIŞMANIN ÖĞRENCİ LİSTESİNE EKLENMEKTEDİR
        if (ogrenci_onayi == 1) Danisman.ogrenci_listesi.add(isim);
        if (ogrenci_onayi == 2) Ogrenci_isleri.kayitsiz_ogrenci_listesi.add(isim);
    }

    //ÖĞRENCİNİN KAYDI ÖNCE DEKANLIK TARAFINDAN ONAYLANMASI GEREKİYOR. ONAYLANIP ONAYLANMAYAN ÖĞRENCİLERİN KONTROL FONKSİYONU
    public void kayit_kontrol(){
        if (ogrenci_onayi == 1) System.out.println("Öğrenci Kayıtlıdır");
        else System.out.println("Öğrenci Kayıtlı Değil");
    }
    public void devamsizlik_getir(){
        if (devamsizlik_durumu == false)
        System.out.println(isim+" adlı öğrencinin devamsızlık durumu güncellenmedi");
        else System.out.println(isim+" adlı öğrencinin devamsızlık durumu Danışman tarafından güncellendi");
    }

    public void sinav_durumu(){
        if (sinav) System.out.println(isim+" isimli öğrenciye atanmış sınav bulunmaktadır.");
        else System.out.println(isim+" isimli öğrenciye sınav bulunmamaktadır.");
    }




    // MARK: - ÖĞRENCİ BİLGİLERİNE ULAŞIM İÇİN GET/SET ENCAPSULATION İLKELERİ

    //Bilgi Güncellemesi için Setter
    public String setIsim(String yeni_isim) {
        this.isim = yeni_isim;
        return isim;
    }

    public void setSinav(boolean sinav) {
        this.sinav = sinav;
    }

    public Integer setNumara(Integer yeni_numara) {
        this.numara = yeni_numara;
        return numara;
    }

    public boolean setDevamsizlik_durumu(boolean devamsizlik_durumu) {
        this.devamsizlik_durumu = devamsizlik_durumu;
        return devamsizlik_durumu;
    }

    //Bilgilerin okunması için Getter
    public String getIsim() {
        return isim;
    }

    public Integer getSinif() {
        return sinif;
    }

    public String getFakulte() {
        return fakulte;
    }

    public String getUlke() {
        return ulke;
    }

    public Integer getNumara() {
        return numara;
    }

}

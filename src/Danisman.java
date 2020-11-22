import java.util.ArrayList;

public class Danisman extends Personel {
    private Integer ogrenci_sayisi;
    public static ArrayList<String> ogrenci_listesi = new ArrayList<String>();

    Danisman(String isim, String soyisim, Integer sistem_id) {
        super(isim, soyisim, sistem_id);
    }

    //Personellerin görevlerini belirten fonksiyon Overriding Yapılmıştır Personel sınıfından
    public void gorev_belirtme(){
        System.out.println("Yabancı Öğrenciye Atanan Personelin Görevi: Danışman");
    }

    //ÖĞRENCİLERİN DEVAMSIZLIK DURUMLARINI KOTNROL ETMEKTEDİR DANIŞMAN
    public void devamsizlik_guncelle(Ogrenci ogrenci){
        ogrenci.setDevamsizlik_durumu(true);
    }

    //ERASMUS ÖĞRENCİLERİNE SINAV ATAMAKTADIR
    public void sinav_ata(Ogrenci ogrenci){
        ogrenci.setSinav(true);
    }

    //ÖĞRENCİ ARRAYLIST'İ OLUŞTURARAK OKULDAKİ KAYITLI YABANCI ÖĞRENCİLERİN TESPİTİ YAPILIYOR
    public void ogrencileri_yazdir(){
        System.out.println(getIsim()+" "+getSoyisim()+" isimli danışmana Bağlı Kayıtlı Erasmus Öğrencileri:");
        for (String i : ogrenci_listesi){
            System.out.println(i);
        }
    }


}

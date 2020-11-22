import java.util.ArrayList;

public class Ogrenci_isleri extends Personel{

    public static ArrayList<String> kayitsiz_ogrenci_listesi = new ArrayList<String>();

    Ogrenci_isleri(String isim, String soyisim, Integer sistem_id) {
        super(isim, soyisim, sistem_id);
    }

    //Personellerin görevlerini belirten fonksiyon Overriding Yapılmıştır Personel sınıfından
    public void gorev_belirtme(){
        System.out.println("Yabancı Öğrenciye Atanan Personelin Görevi: Öğrenci İşleri");
    }

    public void ogrenci_sayi_bilgileri(){
        int toplam;
        toplam = Danisman.ogrenci_listesi.size() + kayitsiz_ogrenci_listesi.size();
        System.out.println("Okuldaki Kayıtsız öğrenci sayısı: "+
                            kayitsiz_ogrenci_listesi.size()+"" +
                            "\nToplam Öğrenci Sayısı: "+ toplam);
    }

}

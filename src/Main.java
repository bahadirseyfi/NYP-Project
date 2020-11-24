public class Main {

    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("jason",213,"abd","teknoloji",3);
        Ogrenci ogrenci2 = new Ogrenci("mike",513,"italy","işletme",2);
       // ogrenci1.kayit_kontrol();
       // Dekanlik.ogrenci_bilgileri_goruntule(ogrenci1);
       // Dekanlik.ogrenci_bilgileri_duzenle(ogrenci1);
       // Dekanlik.ogrenci_bilgileri_goruntule(ogrenci1);
        ogrenci1.devamsizlik_getir();
        Danisman danisman = new Danisman("Anıl","Baş",132);
        //danisman.devamsizlik_guncelle(ogrenci1);
        //ogrenci1.devamsizlik_getir();
        //ogrenci1.sinav_durumu();
        //danisman.sinav_ata(ogrenci1);
        //ogrenci1.sinav_durumu();

        danisman.ogrencileri_yazdir();
        Dekanlik.personel_bilgileri_goruntule(danisman);
    }
}

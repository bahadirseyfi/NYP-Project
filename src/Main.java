public class Main {

    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Jason Lett",213,"abd","teknoloji",3);
        ogrenci1.kayit_kontrol();
        ogrenci1.devamsizlik_getir();
        ogrenci1.sinav_durumu();
        ogrenci1.mail_goster();

        Danisman danisman = new Danisman("Anıl","Baş",132);
        danisman.gorev_belirtme();
        danisman.devamsizlik_guncelle(ogrenci1);
        danisman.sinav_ata(ogrenci1);
        danisman.ogrencileri_yazdir();
        System.out.println("DANIŞMAN SINAV ATAYINCA , DEVAMSIZLIK DURUMUNU GÜNCELLEDİKTEN SONRA:\n");
        ogrenci1.devamsizlik_getir();
        ogrenci1.sinav_durumu();


        Ogrenci ogrenci2 = new Ogrenci("Mike Flair",513,"italy","işletme",2);
        Ogrenci_isleri ogrenci_isleri = new Ogrenci_isleri("Selami","Yılmaz",233);
        ogrenci_isleri.gorev_belirtme();
        ogrenci_isleri.ogrenci_sayi_bilgileri();

        Dekanlik.ogrenci_bilgileri_goruntule(ogrenci1);
        Dekanlik.ogrenci_bilgileri_duzenle(ogrenci1);
        Dekanlik.ogrenci_bilgileri_goruntule(ogrenci1);
        ogrenci1.devamsizlik_getir();
        Dekanlik.personel_bilgileri_goruntule(danisman);
        
        danisman.mail_gonder(ogrenci1);
        ogrenci1.mail_goster();

        danisman.not_ver(ogrenci1,"AA");
        danisman.not_ver(ogrenci2, 95);
        ogrenci1.not_goruntule();
        ogrenci2.not_goruntule();
    }

}

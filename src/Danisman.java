import java.util.ArrayList;
import java.util.Scanner;

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

    //ÖĞRENCİLERİN DEVAMSIZLIK DURUMLARINI KONTROL ETMEKTEDİR DANIŞMAN
    public void devamsizlik_guncelle(Ogrenci ogrenci){
        if (ogrenci.ogrenci_onayi == 1)
        ogrenci.setDevamsizlik_durumu(true);
        else System.out.println("Öğrenci kayıtlı değil, Devamsızlık durumu güncellenemedi");
    }

    //ERASMUS ÖĞRENCİLERİNE SINAV ATAMAKTADIR
    public void sinav_ata(Ogrenci ogrenci){
        if(ogrenci.ogrenci_onayi == 1)
          ogrenci.setSinav(true);
        else System.out.println("Öğrenci kayıtlı değil, Sınav atanamadı");
    }

    //ÖĞRENCİ ARRAYLIST'İ OLUŞTURARAK OKULDAKİ KAYITLI YABANCI ÖĞRENCİLERİN TESPİTİ YAPILIYOR
    public void ogrencileri_yazdir(){
        System.out.println("Kayıtlı Erasmus Öğrencileri:");
        for (String i : ogrenci_listesi){
            System.out.println(i);
        }
    }


    //ÖĞRENCİLERE MAİL ATMAK İÇİN ÖĞRENCİ SINIFINDAKİ GELEN KUTUSU DEĞİŞKENİNİ GÜNCELLİYORUM
    public void mail_gonder(Ogrenci ogrenci){
        String mail;
        System.out.println(ogrenci.getIsim()+" isimli Öğrenciye Mail yazınız: \n");
        Scanner scanner = new Scanner(System.in);
        mail = scanner.nextLine();

        ogrenci.setGelen_kutusu(mail);

    }
    //HER İKİ FONKSİYON DA ÖĞRENCİYE NOT VERMEK AMAÇLI ANCAK BİRİ HARF NOTU OLARAK DİĞER SAYISAL PUAN OLARAK YAZILMAKTA
    //OVERLOADING YAPILMIŞTIR.

    public void not_ver(Ogrenci ogrenci, Integer not){
        ogrenci.setSayisal_not(not);
       // System.out.println("Öğrencinin notu : "+ogrenci.getSayisal_not());
    }

    public void not_ver(Ogrenci ogrenci, String not){
        ogrenci.setHarf_not(not);
      //  System.out.println("Öğrencinin notu: "+ogrenci.getHarf_not());
    }
}

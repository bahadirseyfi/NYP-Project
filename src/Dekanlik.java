import java.util.InputMismatchException;
import java.util.Scanner;

public class Dekanlik {

    Dekanlik(){
            System.out.println("Dekanlık İşlem Başlatıyor");
    }


    //ÖĞRENCİ SINIFINDAN BİR NESNE TANIMLANMAYA ÇALIŞILINCA DEKANLIK İZNİ GEREKMEKTEDİR.
    public static Integer yeni_ogrenci_kaydi(){
        Integer ogrenci_kaydi_onayi;
        System.out.println("Öğrenci Kaydı Onaylamak için 1'e basınız:\nOnaylamamak için herhangi bir sayı giriniz:\n");
        try {
            Scanner scanner = new Scanner(System.in);
            ogrenci_kaydi_onayi = scanner.nextInt();
            if (ogrenci_kaydi_onayi == 1) {
                System.out.println("Ogrenci kaydi dekanlık tarafından onaylandı");
                return 1;
            }
        } catch (InputMismatchException e) {
                System.out.println("Hatalı Giriş Yapıldı: "+ e);
                return 0;
        }finally {
            System.out.println("Sistem Onaylamadı");
        }
        System.out.println("Ogrenci kaydi dekanlık tarafından Onaylanmadı");
        return 2;
    }

     //ÖĞRENCİLERİN BİLGİLERİNİ GÖRÜNTÜLEME İZNİ VARDIR DEKANLIĞIN
    public static void ogrenci_bilgileri_goruntule(Ogrenci ogrenci){
        System.out.println("Öğrenci İsmi: "+ogrenci.getIsim() +
                "\nÖğrenci No: "+ogrenci.getNumara()+
                "\nÖğrenci fakülte/sınıf: "+ogrenci.getFakulte()+
                "/"+ogrenci.getSinif());
    }

    public static void ogrenci_bilgileri_duzenle(Ogrenci ogrenci) {
        Scanner scanner = new Scanner(System.in);
        Boolean hatali_secim = false;
        int secim, numara; //Seçim: Dekanlığın hangi bilgiyi güncelleyeceğini, numara ise güncel numarayı temsil ediyor
        String isim; //: güncellenecek isim
        System.out.println("Öğrencinin Güncellemek İstediğiniz Bilgisi:\n1:İsim\n2:Numara");
        try {
            secim = scanner.nextInt();
            if (secim == 1) {
                isim = scanner.nextLine();
                isim = scanner.next();
                ogrenci.setIsim(isim);
                System.out.println("İsim Dekanlık Tarafından Güncellendi");
            } else if (secim == 2) {
                numara = scanner.nextInt();
                ogrenci.setNumara(numara);
                System.out.println("Numara Dekanlık Tarafından Güncellendi");
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş yapıldı :  " + e);
        }finally {
            System.out.println("Değişiklik Yapılamadı");
        }
    }
    public static void personel_bilgileri_goruntule(Danisman danisman){
            System.out.println("Dekanlık Tarafından Bilgiler Talep Edildi\n");
            System.out.println("Danışmanın ismi: "+danisman.getIsim()+"\nSoyismi: "+
                    danisman.getSoyisim()+"\nSistem_id: "+danisman.getSistem_id());
    }


}

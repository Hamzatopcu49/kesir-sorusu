import java.util.Scanner;

public class kesir {

    public static void main(String[] args) {
 Scanner klavye=new Scanner(System.in);
 System.out.print("LÜTFEN PAY DEĞERİ GİRİNİZ=");
 int pay=klavye.nextInt();
 System.out.print("LÜTFEN PAYDA DEĞERİ GİRİNİZ=");
 int payda=klavye.nextInt();
 if(payda>pay)
     System.out.println("BASİT KESİR");
 else if(payda<pay)
     System.out.println("BİLEŞİK KESİR");
 else
     System.out.println("TAM SAYI");
    }
    
}
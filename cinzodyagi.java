import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
      // değişkenleri tanımlayalım
      double year;
      
      // import sınıfını tanımla
      Scanner inp = new Scanner(System.in);

      //kullanıcıdan input alalım
      System.out.println("Doğum yılınızı giriniz");
      year = inp.nextDouble();

      // hesaplamaları yapalım 
    if(year%12 == 0){
          System.out.println("Maymun");
    }

    else if(year%12 == 1){
        System.out.println("Horoz");
    }
    
    else if(year%12 == 2){
        System.out.println("Köpek");
    }

    else if(year%12 == 3){
        System.out.println("Domuz");
    }

    else if(year%12 == 4){
        System.out.println("Fare");
    }

    else if(year%12 == 5){
        System.out.println("Öküz");
    }

    else if(year%12 == 6){
        System.out.println("Kaplan");
    }

    else if(year%12 == 7){
        System.out.println("Tavşan");
    }

    else if(year%12 == 8){
        System.out.println("Ejderha");
    }

    else if(year%12 == 9){
        System.out.println("Yılan");
    }

    else if(year%12 == 10){
        System.out.println("At");
    }

    else if(year%12 == 11){
        System.out.println("Koyun");
    }
    

      




    }
    
}

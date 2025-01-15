public class Main {
    public static void main(String[] args) {

        System.out.println("FOR DÖNGÜSÜ : ");
        for(int i = 1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------------------");

        for(int a=1;a<=30;a=a+2){
            System.out.println(a);
        }
        System.out.println("WHİLE DÖNGÜSÜ : ");
       int x=10;
        while (x<50) {
            System.out.println(x);
            x = x + 2;
        }
        System.out.println("----------------------------------------------------------------------");

        int b=5;
        while (b<70){ // while döngüsünün içine her zaman işlemin koşulu yazılır
            System.out.println(b);
            b=b+5;

        }
        System.out.println("DO-WHİLE DÖNGÜSÜ : ");

        int z=1;
        do{ // do döngüsünün içine her zaman yapılacak işlem yazılır
            z++;
            System.out.println(z);
        }while (z<15);
        System.out.println("Döngü Tamamlandı");
        System.out.println("-----------------------------------------------------------------------");

        int y=1;
        do{
            y=y+3;
            System.out.println(y);
        }while (y<15);
            System.out.println("Döngü bitti");
        }
    }

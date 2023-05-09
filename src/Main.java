import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik degeri giriniz : ");
        heat = input.nextInt();

        if(heat<5){
            System.out.print("Kayak yapabilirsin ");
        }else if(heat >=5 && heat <= 15){
            System.out.print("Sinemaya gidebilirsin ");
        }else if(heat >=15 && heat <= 25){
            System.out.print("Piknige gidebilirsin ");
        }else{
            System.out.print("Yuzmeye gidebilirsin ");
        }
     }
}
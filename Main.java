
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum (1), Subtract (2), multi(3), div(4): ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();


        System.out.println("First number: ");
        int num1 = sc.nextInt();
        System.out.println("Second number: ");
        int num2 = sc.nextInt();
        if (option==1) {

            System.out.print("Result: " + (num1 + num2));
        }
        else if(option==2){
            System.out.print("Result: " + (num1 - num2));
        }

        else if(option==3){

        System.out.print("Result: " + (num1 * num2));
    }
        else {
        System.out.print("Result: " +(num1 / num2));
        }
        System.out.println("¿Desea realizar alguna operacion más: " );
        System.out.println("S / N");
        String selec = sc.next();

        if (selec.equals( "s") || selec.equals ("S")){
            System.out.println("Sum (1), Subtract (2), multi(3), div(4): ");


        }
        else{
            System.out.println("Gracias, que pase un buen día. ");
        }
    }

}

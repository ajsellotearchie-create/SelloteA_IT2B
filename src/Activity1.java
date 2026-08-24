import java.util.Scanner;

public class Activity1 {
    Scanner sc = new Scanner(System.in);

    public void Usergreetings(){
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Birth year: ");
        int byear = sc.nextInt();
        System.out.print("Enter your Gender: ");
        String gender = sc.next();

        System.out.println("-----------------------------------------------------------");
        System.out.print("Hello "+name+" !Welcome to Java" );
        System.out.println("You were born in "+byear+" and your gerder is "+gender);
        System.out.println("-----------------------------------------------------------");

    }
}

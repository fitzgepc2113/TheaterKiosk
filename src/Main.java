import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
    //class TheaterKiosk
        //main()
            // num age = 0
            //output "Please Enter your age: "
            //input age
                //if age >= 21 then
                    //output "You get a wrist band!"
                //endIf
        //return
    //endClass

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int age = 0;

        System.out.print("Please enter your age: ");




        age = input.nextInt();
        input.nextLine();

        if (age >= 21) {
            System.out.println("You get a wrist band!");
        } else {
            System.exit(0);

        }

    }
}

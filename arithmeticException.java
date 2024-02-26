import java.util.Scanner;

class arithmeticException{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers");
            int x = s.nextInt();
            int y = s.nextInt();
            int z = x/y;
            System.out.println("The divisions answer is: " + z);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("End of program");
            s.close();
        }
    }
}
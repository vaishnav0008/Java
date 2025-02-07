import java.util.Scanner;
class ScannerExample{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string : ");
    char ch = sc.next().charAt(0);
    System.out.println(ch);

    System.out.println("enter the string : ");
    char ch1= sc.next().charAt(2);
    System.out.println(ch1);
}
}
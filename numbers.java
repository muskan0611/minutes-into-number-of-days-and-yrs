import java.util.Scanner;
import java.lang.String;
public class numbers{
  public static void main(String[] args){
    double min_yr =60 * 24 *365;
    Scanner sc = new Scanner(System.in);
    System.out.println("Minutes: ");
    double min = sc.nextDouble();
    long yrs = (long)(min/min_yr);
    int days = (int)(min/60/24)%365;
    System.out.println((int) min + " minutes is approximately " + yrs + " years and " + days + " days"); 
  }
}

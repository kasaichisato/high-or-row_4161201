import java.util.Random; 
import java.util.Scanner; 

public class HighOrLow { 
 static Scanner sc  =new Scanner(System.in); 
 static String[] cmark = {" A"," 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9","10"," J"," Q"," K"}; 
 public static void main(String[] args) { 
  System.out.println("Hight & Low \n"); 
  String s = card(); 
  String m = card(); 
  while(s.equals(m)){ 
   s = card(); 
   } 
  System.out.println("現在のカードは" + s + "です。"); 
  cardmark(s); 
  System.out.print("Highr or Low ? :"); 
  judg(s,m,sc.next()); 
  System.out.println("お疲れ様でした。"); 
  System.exit(0); 

 } 

 } 
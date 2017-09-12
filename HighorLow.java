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
  public static void judg(String s1,String s2,String ans){ 
  int i = 0; 
  int s1c = 0,s2c = 0; 
  while(i < cmark.length){ 
   if(cmark[i].equals(s1)) s1c = i; 
   if(cmark[i].equals(s2)) s2c = i; 
   i++; 
  } 
  if((s1c < s2c) && (ans.equals("h") || ans.equals("H"))){ 
   System.out.println("おめでとうございます。あなたのカードは"+ s2 + "でした。"); 
  }else if((s1c > s2c) && (ans.equals("l")|| ans.equals("L"))){ 
   System.out.println("おめでとうございます。あなたのカードは"+ s2 + "でした。"); 
  }else{ 
   System.out.println("残念。あなたのカードは"+ s2 + "でした。"); 
  }  
  System.out.println(""); 
 }

 } 
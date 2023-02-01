package chapter_07;

import java.util.Scanner;
public class HW3_4{


public static void main(String args []){

int a =0;
int e = 0;
int x = 0;
int u = 0;
int o = 0;
int other = 0;
Scanner scan = new Scanner(System.in);


System.out.print("enter string: ");

String text = scan.nextLine();

for (int i = 0; i < text.length(); i++) {
char c = text.charAt(i);

if (c=='a')
a++; 

else if( c=='e')
e++;

else if(c=='i')
x++;

else if(c=='o')
o++;

else if (c=='u')
u++;        

else
other++;
}

System.out.println("this is the number of : a: " + a + "\n" +"this is the number of : e: " + e + "\n" +"this is the number of : i: " + x + "\n" +"this is the number of : o: " + o + "\n" +"this is the number of : u: " + u + "\n" +"this is the number of : other: " + other);

}
}
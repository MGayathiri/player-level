import java.io.*;
import java.util.*;
class stringint{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=next();
int n=0;
try{
if(s.length()>0){
n=Integer.parseInt(s);
System.out.println(n);
}
}
catch(Exception e){
System.out.println("not a number");
}
}
}

import java.io.*;
import java.util.*;
class stringint{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("String:");
String s=sc.next();
int n=0;
try{
if(s.length()>0){
n=Integer.parseInt(s);
System.out.println("Integer:"+n);
}
}
catch(Exception e){
System.out.println("not a number");
}
}
}

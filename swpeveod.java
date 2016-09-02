import java.io.*;
import java.util.*;
class swpeveod{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
StringBuffer s= new StringBuffer(sc.next());
for int i=0;i<s.length();i++){
  if(i*2=1&&i+2<s.length()){
    char c=s.charAt(i),ch=s.charAt(i+2);
    s.delete(i,i+1);s.insert(ch,i);
    s.delete(i+2,i+3);s.insert(c,i+2);
  }
else{
   if(i+2<s.length()){
    char c=s.charAt(i),ch=s.charAt(i+2);
    s.delete(i,i+1);s.insert(ch,i);
    s.delete(i+2,i+3);s.insert(c,i+2);
}
}
System.out.println(s);
}
}

import java.io.*;
import java.util.*;
class swpeveod{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
StringBuffer s= new StringBuffer(sc.next());
Set<Integer> st=new TreeSte<Integer>()
for (int i=0;i<s.length();i++){
  if(st.add(i)&&st.add(i+2))
  {
  if(i%2==0&&i+2<s.length()){
    char c=s.charAt(i),ch=s.charAt(i+2);
    s.delete(i,i+1);s.insert(i,ch);
    s.delete(i+2,i+3);s.insert(i+2,c);
  
  }
else{
   if(i+2<s.length()){
    char c=s.charAt(i),ch=s.charAt(i+2);
    s.delete(i,i+1);s.insert(i,ch);
    s.delete(i+2,i+3);s.insert(i+2,c);
   }
}
}
}
System.out.println(s);
}
}

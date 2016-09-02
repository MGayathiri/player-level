import java.io.*;
import java.util.*;
class isomorphic{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
StringBuffer s=new StringBuffer (sc.next());
StringBuffer ss=new StringBuffer (sc.next());
Map<Character,Character> m=new HashMap<Character,Character>(); 
if(s.length()==ss.length()){
for(int i=0;i<s.length();i++){
if(m.get(s.charAt(i))==null){
  m.put(s.charAt(i),ss.charAt(i));
ss.delete(i,i+1);
ss.insert(i,s.charAt(i));
}
else{
char c=m.get(s.charAt(i));
if(c==ss.charAt(i)){
ss.delete(i,i+1);
ss.insert(i,s.charAt(i));}
}
}
if(s==ss){System.out.println("True");}
else{System.out.println("false");}
}
else{System.out.println("false");}
}
}

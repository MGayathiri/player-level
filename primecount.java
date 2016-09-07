import java.io.*;
import java.util.*;
class primecount{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int c=0;
for(int i=n;i<=m;i++){
int j=0;
if(i>1){
for(j=2;j<=i/2;j++){
if(i%j!=0){continue;}
else{break;}
}
if(j>i/2){c++;}
}
}
System.out.println(c);
}
}

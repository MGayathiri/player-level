import java.io.*;
import java.util.*;
class reverseint{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
if(n>9){
while(n!=0)
{
System.out.print(n%10);
n=n/10;
}

}
}
}

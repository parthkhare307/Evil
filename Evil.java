import java.util.*;
class Evil
{
public static void main(String args[])
   {
String s1="";
char c;
int n,r,q=0,l,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
n=sc.nextInt();
for(int i=n;i>0;i=i/2)
	{
          r=i%2;
          if(r== 0 || r==1)
	     {
               
              s1=s1+Integer.toString(r);
              }
        }
System.out.print(s1);
l=s1.length();
for(int j=0;j<l;j++)
    {
     c=s1.charAt(j);
	if(c=='1')
	   {
		count=count+1;	
	   }
    }
	if(count%2 == 0)
	  {
	     System.out.print("The Number is Evil Number");
	  }
	else
       {
	  System.out.print("Its not a Evil Number");
	}
}
}

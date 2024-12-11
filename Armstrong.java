import java.util.*;
class Armstrong
{
    public static void main(String args[]) 
    {
        Scanner mg = new Scanner(System.in);
        int num, num1, d,c, sum=0;
        System.out.println("ENTER THE NUMBER=");
        num= mg.nextInt();
        num1=num;
        while(num1>0)
        {
            d=num1%10;
            c=d*d*d;
            sum=sum+c;
            num1/=10;
        }
        if(num==sum)
            System.out.println("ARMSTRONG NUMBER=");
        else
     
       System.out.println("NOT A ARMSTRONG NUMBER");
       mg.close();
    }
}
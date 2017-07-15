# HCFNumber
import java.io.*;
import java.util.*;
public class HCFNumber
{
  public static void main(String args[])
  {
    int n1,n2;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first number:");
    n1=Integer.parseInt(br.readLine());
    System.out.println("Enter the second number:");
    n2=Integer.parseInt(br.readLine());
    int hcf=0;
            int min = Math.min(n1,n2);
             
            for(int i=min; i >= 1; i--)
            {
                if(n1%i == 0 && n2%i == 0)
                {
                    hcf = i;
                    break;
                }
            }        
            System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+hcf);
        }
    }

/*
 * Took the input from console and printed the required output
 */

import java.util.*;
class HashCode_Practice_v2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int T2=sc.nextInt();
        int T3=sc.nextInt();
        int T4=sc.nextInt();

        if(M>=1 && M<=100000 &&
        T2>=0 && T2<=50000 &&
        T3>=0 && T3<=50000 &&
        T4>=0 && T4<=50000)
        {
            List<List<String>> main_list=new ArrayList<>();
            for(int i=1;i<=M;i++)
            {
                int I=sc.nextInt();
                List<String> list=new ArrayList<>();

                for(int j=1;j<=I;j++)
                {
                    list.add(sc.next());
                }
                main_list.add(list);
            }

            int temp2=T2,temp3=T3,temp4=T4;
            int D=0,Pizza_Count=0;
            while(Pizza_Count<=M)
            {
                if(temp2!=0)
                {
                    Pizza_Count+=2;
                    D++;
                    temp2-=1;
                }
                else if(temp3!=0)
                {
                    Pizza_Count+=3;
                    D++;
                    temp3-=1;
                }
                else if(temp4!=0)
                {
                    Pizza_Count+=4;
                    D++;
                    temp4-=1;
                }
                else
                {
                    D++;
                    break;
                }
            }
            D-=1;

            //Printing input lines
            System.out.println("\n\n");
            System.out.println(D);
            int pizza_num=0;
            for(int i=0;i<D;i++)
            {
                int temp=0;
                if(T2!=0)
                {
                    temp=2;
                    T2--;
                    System.out.print(2+" ");
                }
                else if(T3!=0)
                {
                    temp=3;
                    T3--;
                    System.out.print(3+" ");
                }
                else if(T4!=0)
                {
                    temp=4;
                    T4--;
                    System.out.print(4+" ");
                }

                for(int j=0;j<temp;j++)
                {
                    System.out.print(pizza_num+" ");
                    pizza_num++;
                }
                System.out.println();
            }
        }
    }
}
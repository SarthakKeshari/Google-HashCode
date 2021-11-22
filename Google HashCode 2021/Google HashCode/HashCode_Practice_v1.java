/*
 * Took the input from console and printed the same input
 */


import java.util.*;
class HashCode_Practice_v1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int T1=sc.nextInt();
        int T2=sc.nextInt();
        int T3=sc.nextInt();

        if(M>=1 && M<=100000 &&
        T1>=0 && T1<=50000 &&
        T2>=0 && T2<=50000 &&
        T3>=0 && T3<=50000)
        {
            List<List<String>> main_list=new ArrayList<>();
            for(int i=1;i<=M;i++)
            {
                int I=sc.nextInt();
                List<String> list=new ArrayList<>();

                //The following line is being used for printing purpose later it can be commented
                list.add(String.valueOf(I));

                for(int j=1;j<=I;j++)
                {
                    list.add(sc.next());
                }
                main_list.add(list);
            }

            //Printing input lines
            System.out.println("\nPrinting Input Lines");
            System.out.println(M+" "+T1+" "+T2+" "+T3);
            for(int i=0;i<main_list.size();i++)
            {
                for(int j=0;j<main_list.get(i).size();j++)
                {
                    System.out.print(main_list.get(i).get(j)+" ");
                }
                System.out.println();
            }
        }
    }
}
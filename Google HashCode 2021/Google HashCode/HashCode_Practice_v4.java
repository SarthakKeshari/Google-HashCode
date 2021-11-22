/*
 * Took the input from file and print on output file
 */

import java.io.*;
import java.util.*;
class HashCode_Practice_v4
{
    public static void main(String args[]) throws IOException
    {
        File file=new File("C:\\Z_Sarthak\\Personal\\Google HashCode\\Google HashCode\\InOutFiles\\e_many_teams.in");
        Scanner sc=new Scanner(file);
        int M=Integer.parseInt(sc.next());
        int T2=Integer.parseInt(sc.next());
        int T3=Integer.parseInt(sc.next());
        int T4=Integer.parseInt(sc.next());

        if(M>=1 && M<=100000 &&
        T2>=0 && T2<=50000 &&
        T3>=0 && T3<=50000 &&
        T4>=0 && T4<=50000)
        {
            List<List<String>> main_list=new ArrayList<>();
            for(int i=1;i<=M;i++)
            {
                int I=Integer.parseInt(sc.next());
                List<String> list=new ArrayList<>();

                for(int j=1;j<=I;j++)
                {
                    list.add(sc.next());
                }
                main_list.add(list);
            }

            //Printing input lines
            File outputfile=new File("C:\\Z_Sarthak\\Personal\\Google HashCode\\Google HashCode\\InOutFiles\\outpute.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(outputfile));
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
            out.write(D+"");
            out.newLine();
            int pizza_num=0;
            for(int i=0;i<D;i++)
            {
                int temp=0;
                if(T2!=0)
                {
                    temp=2;
                    T2--;
                    out.write(2+" ");
                }
                else if(T3!=0)
                {
                    temp=3;
                    T3--;
                    out.write(3+" ");
                }
                else if(T4!=0)
                {
                    temp=4;
                    T4--;
                    out.write(4+" ");
                }
                else
                {
                    break;
                }

                for(int j=0;j<temp;j++)
                {
                    out.write(pizza_num+" ");
                    pizza_num++;
                }
                out.newLine();
            }
            out.close();
        }
    }
}

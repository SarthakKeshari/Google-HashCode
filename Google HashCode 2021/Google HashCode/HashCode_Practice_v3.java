/*
 * Took the input from file and printed the same input file in output file
 */

import java.io.*;
import java.util.*;
class HashCode_Practice_v3
{
    public static void main(String args[]) throws IOException
    {
        File file=new File("C:\\Z_Sarthak\\Personal\\Google HashCode\\Google HashCode\\InOutFiles\\a_example");
        Scanner sc=new Scanner(file);
        int M=Integer.parseInt(sc.next());
        int T1=Integer.parseInt(sc.next());
        int T2=Integer.parseInt(sc.next());
        int T3=Integer.parseInt(sc.next());

        if(M>=1 && M<=100000 &&
        T1>=0 && T1<=50000 &&
        T2>=0 && T2<=50000 &&
        T3>=0 && T3<=50000)
        {
            List<List<String>> main_list=new ArrayList<>();
            for(int i=1;i<=M;i++)
            {
                int I=Integer.parseInt(sc.next());
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
            File outputfile=new File("C:\\Z_Sarthak\\Personal\\Google HashCode\\Google HashCode\\InOutFiles\\outputa.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(outputfile));
            out.write(M+" "+T1+" "+T2+" "+T3);
            out.newLine();
            System.out.println("\nPrinting Input Lines");
            for(int i=0;i<main_list.size();i++)
            {
                for(int j=0;j<main_list.get(i).size();j++)
                {
                    out.write(main_list.get(i).get(j)+" ");
                }
                out.newLine();
            }
            out.close();
        }
    }
}
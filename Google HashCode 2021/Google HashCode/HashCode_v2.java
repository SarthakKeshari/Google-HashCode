/*
 * Took the input from file and printed the same input file in output file
 */

import java.io.*;
import java.util.*;
import javafx.util.Pair; 
class HashCode_v2
{
    public static void main(String args[]) throws IOException
    {
        File file=new File("C:\\Z_Sarthak\\Personal\\Google HashCode\\HashCode\\InOutFiles\\f.txt");
        Scanner sc=new Scanner(file);
        int D=Integer.parseInt(sc.next());
        int I=Integer.parseInt(sc.next());
        int S=Integer.parseInt(sc.next());
        int V=Integer.parseInt(sc.next());
        int F=Integer.parseInt(sc.next());

        if(D>=1 && D<=10000 &&
        I>=2 && I<=100000 &&
        S>=2 && S<=100000 &&
        V>=1 && V<=1000 &&
        F>=1 && F<=1000)
        {
            List<ArrayList<Integer>> se = new ArrayList<ArrayList<Integer>>();

            List<String> names=new ArrayList<>();
            List<Integer> times=new ArrayList<>();
            for(int i=0;i<S;i++)
            {
                int B=Integer.parseInt(sc.next());
                int E=Integer.parseInt(sc.next());

                ArrayList<Integer> list=new ArrayList<>();
                list.add(B);
                list.add(E);

                se.add(list);

                String name=sc.next();

                names.add(name);

                int L=Integer.parseInt(sc.next());
                times.add(L);
            }

            List<ArrayList<String>> cities=new ArrayList<ArrayList<String>>();
            for(int i=0;i<V;i++)
            {
                int P=Integer.parseInt(sc.next());
                ArrayList<String> car=new ArrayList<String>();
                for(int j=0;j<P;j++)
                {
                    car.add(sc.next());
                }
                cities.add(car);
            }

            //System.out.println(se);
            //System.out.println(names);
            //System.out.println(times);
            //System.out.println(cities);

            long min=Integer.MAX_VALUE;
            int car_idx=-1;
            for(int i=0;i<cities.size();i++)
            {
                int dist=0;
                for(int j=0;j<cities.get(i).size();j++)
                {
                    //System.out.println(cities.get(i).get(j));
                    dist+=times.get(names.indexOf(cities.get(i).get(j)));
                }
                if(dist<=min)
                {
                    min=dist;
                    car_idx=i;
                }
            }

            //System.out.println(car_idx);
            File outputfile=new File("C:\\Z_Sarthak\\Personal\\Google HashCode\\HashCode\\InOutFiles2\\outputf.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(outputfile));

            int num_intersection=cities.get(car_idx).size();
            //System.out.println(num_intersection);
            out.write(num_intersection+"");
            out.newLine();
            for(int i=0;i<num_intersection;i++)
            {
                int inter=se.get(names.indexOf((cities.get(car_idx).get(i)))).get(1);
                //System.out.println(inter);
                out.write(inter+"");
                out.newLine();
                int count=0;
                List<Integer> temp=new ArrayList<>();
                for(int j=0;j<se.size();j++)
                {
                    if(se.get(j).get(1)==inter)
                    {
                        count++;
                        temp.add(j);
                    }
                }
                //System.out.println(count);
                out.write(count+"");
                out.newLine();
                for(int j=0;j<temp.size();j++)
                {
                    //System.out.println(names.get(temp.get(j))+" "+(times.get(temp.get(j))));
                    out.write(names.get(temp.get(j))+" "+(times.get(temp.get(j))));
                    out.newLine();
                }
            }
            out.close();
        }
    }
}

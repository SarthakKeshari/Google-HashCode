import java.util.Scanner;

class ShaastraPrim 
{
    public static long primcount(long number)
    {
        long c=0;
        
        for(long i = 2; i<=number; i++) {
            while(number%i == 0) {
                c++;
                number = number/i;
            }
        }
        if(number >2) {
            c++;
        }
        return c;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        if(t==5)
        {
            long l = sc.nextLong();
            long r = sc.nextLong();
            
            if(l>=2 && r>=2 && l<=1000000000 && r<=1000000000 && (r-l)>=1 && (r-l)<=1000000)
            {
                long counter=0;
                for(long i=l;i<=r;i++)
                {
                    //System.out.print(i+" ");
                    long x=primcount(i);
                    //System.out.println(x);
                    long ans=primcount(x);
                    
                    if(ans==1)
                    {
                        //System.out.println("IN");
                        counter++;
                    }
                }
                
                System.out.println(counter);
            }
        }
      
    }
}
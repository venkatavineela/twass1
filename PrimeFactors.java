import java.io.*;
public class PrimeFactors {

    int i,j;



    void generate(int n)
    {
        int flag=0;
        for(i=2; i<=n; i++)
        {
            if((n%i)==0)
            {
                for(j=2; j<=(i/2); j++)
                {
                    if((i%j)==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if (flag == 0)
                {
                    System.out.print(i+" ");
                }

            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        PrimeFactors pm=new PrimeFactors();
        DataInputStream dis=new DataInputStream(System.in);
        int m;
        System.out.println("Enter a number");
        m=Integer.parseInt(dis.readLine());
        pm.generate(m);
    }
}

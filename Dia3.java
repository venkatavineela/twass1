import java.io.*;
public class Dia3 {
    DataInputStream dis=new DataInputStream(System.in);
    int n,a,b,c;
    void read() {
        try {
            System.out.println("Enter a number");
            n = Integer.parseInt(dis.readLine());
        } catch (Exception x) {
            System.out.println("Invalid Input");
            System.exit(0);

        }
    }
    void print()
    {
        for(a=0; a<n-1; a++)
        {
            for(b=(n-a); b>1; b--)
            {
                System.out.print(" ");
            }
            for(c=1; c<=((2*a)+1); c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("VINEELA");
        for(a=(n-1); a>0; a--)
        {
            for(b=1; b<=(n-a); b++)
            {
                System.out.print(" ");
            }
            for(c=1; c<=((2*a)-1); c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Dia3 d=new Dia3();
        d.read();
        d.print();
    }
}
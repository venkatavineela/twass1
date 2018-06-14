import java.io.*;
public class Dia2 {
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
        for(a=0; a<n; a++)
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
        Dia2 d=new Dia2();
        d.read();
        d.print();
    }
}
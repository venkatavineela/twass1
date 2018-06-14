import java.io.*;
public class Dia1 {
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
    }

public static void main(String[] args)
{
    Dia1 d=new Dia1();
    d.read();
    d.print();
}
}
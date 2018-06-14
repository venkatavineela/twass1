import java.io.*;
public class Tri2 {
    DataInputStream dis = new DataInputStream(System.in);
    int n, a;

    void read() {
        try {
            System.out.println("Enter a number");
            n = Integer.parseInt(dis.readLine());
        }
        catch(Exception x)
        {
            System.out.println("Invaild Input");
            System.exit(0);
        }
    }

    void print() {
        for (a = 1; a <= n; a++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Tri2 t = new Tri2();
        t.read();
        t.print();


    }
}
import java.io.*;
public class Tri4 {
    DataInputStream dis = new DataInputStream(System.in);
    int n, a, b;

    void read() {
        try {
            System.out.println("Enter a number");
            n = Integer.parseInt(dis.readLine());
        } catch (Exception x) {
            System.out.println("Invaild Input");
            System.exit(0);
        }
    }

    void print() {
        for (a = 1; a <= n; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }


    public static void main(String[] args) {
        Tri4 t = new Tri4();
        t.read();
        t.print();


    }

}
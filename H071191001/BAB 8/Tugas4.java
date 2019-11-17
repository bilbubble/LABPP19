import java.io.*;
import java.util.Scanner;


class Tugas4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter filew = null;
        PrintWriter writerw = null;
        FileReader file1 = null;
        FileReader file2 = null;
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        
        try{
            System.out.println("masukkan nama file 1:");
            String first = sc.next();
            file1 = new FileReader(String.format("%s.txt",first));

            System.out.println("masukkan nama file 2:");
            String second = sc.next();
            file2 = new FileReader(String.format("%s.txt",second));
            
            System.out.println("masukkan nama file 3:");
            String third = sc.next();
            filew = new FileWriter(String.format("%s.txt",third));

            reader1 = new BufferedReader(file1); 
            reader2 = new BufferedReader(file2);
            String s1,s2;
            
            while (((s1 = reader1.readLine()) != null) && ((s2 = reader2.readLine()) != null)) {
                String hasil = s1+" . "+s2;
                System.out.println(hasil);
                writerw = new PrintWriter(filew);
                writerw.println(hasil);
            }
        } catch (IOException ioe){
            System.out.println("file tidak dapat ditemukan");

        } finally {
            try {
                if (reader1 != null) {
                reader1.close();
                }
                if (reader2 != null) {
                    reader2.close();
                }
                if (writerw != null) {
                    writerw.close();
                } 
                if (filew != null) {
                    filew.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}

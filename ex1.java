import java.io.*;
import java.util.Scanner;
class Ex {
    public static void main(String[] args) throws Exception {
        // Call the function you want to run
        readFile();
        // writeFile();
        // SystemRead();
        // anotherFunction(); // You can call other functions here
        // illname();
        renameF();
    }

    static void readFile() throws Exception {//read bytes by bytes
        FileInputStream fi = new FileInputStream("C:\\Users\\ReniCd\\Desktop\\CLd\\CC\\raj.txt");
        int d;
        while ((d = fi.read()) != -1) {
            System.out.print((char) d);
        }
        fi.close();
    }

    static void anotherFunction() {
        System.out.println("This is another function!");
    }
    static void writeFile() throws Exception{//reads line by line
        BufferedWriter bf=new BufferedWriter(new FileWriter("C:\\Users\\ReniCd\\Desktop\\CLd\\CC\\raj.txt"));
        bf.write("Cutie Alok");
        bf.close();

    }
    static void SystemRead() throws Exception{
        File f=new File("C:\\Users\\ReniCd\\Desktop\\CLd\\CC\\raj.txt");
        // Scanner sc=new Scanner(f);
        // while(sc.hasNextLine()){
        //     System.out.println(sc.nextLine());
        // }
    }
    static void illname()throws Exception{
        
        FileOutputStream fo=new FileOutputStream("C:\\Users\\ReniCd\\Desktop\\CLd\\CC\\raj.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data:");
        String s=sc.nextLine();


        for(int i=0;i<s.length();i++){
            fo.write(s.charAt(i));
        }
    }
    static void renameF() throws Exception {
    File f = new File("C:\\Users\\ReniCd\\Desktop\\CLd\\CC\\raj.txt");
    File newFile = new File("C:\\Users\\ReniCd\\Desktop\\CLd\\CC\\Alok.txt");
    f.renameTo(newFile);
}
}
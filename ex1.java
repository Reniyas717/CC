import java.io.*;
import java.util.Scanner;
class Ex {
    public static void main(String[] args) throws Exception {
        // Call the function you want to run
        // readFile();
        // writeFile();
        // SystemRead();
        // anotherFunction(); // You can call other functions here
        // illname();
        // renameF();
        // delimiter();
        // split();
        // kuchdigit();
        match2();

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
    static void delimiter()throws Exception{
        String str="123-456-789";
        Scanner sc=new Scanner(str);
        sc.useDelimiter("-");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
    static void split(){
        String a="Apple,Banana,Rajan";
        String sa[]=a.split(",");
        for(String d:sa){
            System.out.print(d+' ');
        }
    }
    static void kuchdigit(){
       String a = "Hello123";
    // The matches() method checks if the string contains at least one digit.
    // Regular expression explanation:
    // .*   : any number of any characters before
    // \\d  : a single digit (0-9)
    // .*   : any number of any characters after
    // So, ".*\\d.*" means "contains at least one digit anywhere in the string".
    System.out.println(a.matches(".*\\d.*")); // Output: true if a contains a digit, false otherwise
 }

    static void match2(){
        String s="ABC12334PQR";
        
        // System.out.println(s.matches("[A-Za-z]+"));//matches both caps and small
        
        String d[]=s.split("[0-9]+");
        for(String x:d){
            System.out.println(x);
        }

    
    }
}
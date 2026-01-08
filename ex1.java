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
        // match2();
        // pnumbermatch();
        // namematch();
        // strongStringMatch();
        extractnumber();
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
   static void pnumbermatch(){
    String p = "998052420";
    // This regex means: exactly 10 digits
    System.out.println(p.matches("\\d{10}")); // Output: true if p is 10 digits, false otherwise
}
    static void namematch(){
        String name="ALokk cutie   hai";
        // System.out.println(name.matches("[A-Za-z]{6}")); //Aa to Zz and only 6 digits
        String d[]=name.split("\\s+");//single space split
        for(String x:d){
            System.out.println(x);
        }
    }
    static void strongStringMatch(){
       String str = "Abcdef1@G";
    // Regex explanation:
    // ^                 : start of string
    // (?=.*[A-Z])       : at least one uppercase letter
    // (?=.*[a-z])       : at least one lowercase letter
    // (?=.*\\d)         : at least one digit
    // (?=.*[^A-Za-z0-9]): at least one special character
    // .{8,}             : minimum 8 characters
    // $                 : end of string
    boolean isStrong = str.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$");
    System.out.println(isStrong); // Output: true if string matches criteria, false otherwise
}
    static void extractnumber(){
        String s="Hello123";
       String digits=s.replaceAll("[^0-9]","");
        System.out.println("Digits:"+digits);
    }
}
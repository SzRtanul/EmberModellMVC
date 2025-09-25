package nezet;

import java.util.Scanner;

public class CuiNezet {
    private static final Scanner sc = new Scanner(System.in);
    
    private String nev;
    private int kor;
    
    public void mutat(String uzenet){
        System.out.print(uzenet);
    }
    
    /* set */
    public void nevBeker(){
        mutat("név: ");
        nev = sc.nextLine();
    }
    
    /* set */
    public void korBeker(){
        mutat("kor: ");
        kor =  sc.nextInt();
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }
    
    
}

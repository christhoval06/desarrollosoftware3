import java.io.File;
import java.util.Scanner;

/**
 * Created by Christhoval on 6/5/14.
 */
public class Leer {

    public static void main(String [] args){
        File f;
        Scanner sc;
        try{
            f = new File("prueba.txt");
            sc = new Scanner(f);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

import java.io.FileWriter;

/**
 * Created by Christhoval on 6/5/14.
 */
public class Archivo {

    public static void main(String [] args){
        FileWriter fw;
        try{
            fw = new FileWriter("prueba.txt", true);
            fw.write("Linea 1\n");
            fw.write("Linea 2\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}

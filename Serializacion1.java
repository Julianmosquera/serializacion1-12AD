package serializacion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Julián
 */
public class Serializacion1 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Mclase m1 = new Mclase("0la", -7, 27e10);

        FileOutputStream fo = new FileOutputStream("/home/oracle/Documents/serial");
        ObjectOutputStream salida = new ObjectOutputStream(fo);

        salida.writeObject(m1);
        salida.close();

        FileInputStream fi = new FileInputStream("/home/oracle/Documents/serial");
        ObjectInputStream entrada = new ObjectInputStream(fi);

        Mclase obj2 = new Mclase();
        obj2 = (Mclase) entrada.readObject();

        System.out.println("Objeto 1: " + "s: " + m1.getNome() + " i: " + m1.getNumero1() + " d:" + m1.getNumero2());
        System.out.println("Objeto 2: " + "s: " + obj2.getNome() + " i: " + obj2.getNumero1() + " d:" + obj2.getNumero2());

        entrada.close();


    }
    
}

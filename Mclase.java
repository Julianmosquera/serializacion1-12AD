
package serializacion1;

import java.io.Serializable;

/**
 *
 * @author Julian
 */
public class Mclase implements Serializable{
    String nome;
    //int numero1;
    transient int numero1;
    double numero2;

    public Mclase(String nome, int numero1, double numero2) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    

    public Mclase() {
    }
    
    

}

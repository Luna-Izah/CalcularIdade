package br.com.LunaIzah.Model;

/**
 *
 * @author izahR
 */
public class ModelIdade {
  
    private int anNasc; 
    private int anAtual; 

    public int getAnNasc() {
        return anNasc;
    }

    public void setAnNasc(int anNasc) {
        this.anNasc = anNasc;
    }

    public int getAnAtual() {
        return anAtual;
    }

    public void setAnAtual(int anAtual) {
        this.anAtual = anAtual;
    }
    
    public int getIdade(){
        
        return anAtual - anNasc;
        
    }
    
}

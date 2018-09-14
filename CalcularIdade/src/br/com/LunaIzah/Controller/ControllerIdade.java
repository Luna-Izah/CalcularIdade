package br.com.LunaIzah.Controller;

import br.com.LunaIzah.Model.ModelIdade;
import br.com.LunaIzah.View.TelaIdade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author izahR
 */
public class ControllerIdade implements ActionListener{
    
    private TelaIdade telinha; 

    public ControllerIdade() {
        
        telinha = new TelaIdade();
        
        ModelIdade model = new ModelIdade();
        
        telinha.setMIdade(model);
        
        this.telinha.addControlerActionListener(this);
        
        this.telinha.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (telinha!=null){
            
            this.calcularIdade(); 
            
        }
        
    }

    private void calcularIdade() {
         
        ModelIdade idade = telinha.getMIdade(); 
        
        idade.getIdade(); 
        
        telinha.setMIdade(idade);
    }
    
    
    
}

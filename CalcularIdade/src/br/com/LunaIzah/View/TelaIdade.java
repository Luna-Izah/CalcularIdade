package br.com.LunaIzah.View;

import br.com.LunaIzah.Model.ModelIdade;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author izahR
 */
public class TelaIdade extends JFrame implements ActionListener {
    
    private ModelIdade MIdade; 
    
    private JTextField txtanasc, txtatual, txtidade; 
    private JButton btncalcular; 

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public TelaIdade() throws HeadlessException {
        
         setLayout(new GridLayout(0,2)); //linhas0 e colunas2.
        
        txtanasc = new JTextField(); 
        txtatual = new JTextField(); 
        txtidade = new JTextField(); 
        
        txtidade.setEditable(false);
        
        btncalcular = new JButton("Calcular");
        
        this.add(new JLabel("Ano Nasc.: ")); 
        this.add(txtanasc);
        
        this.add(new JLabel("Ano Atual: ")); 
        this.add(txtatual);
        
        this.add(new JLabel("Idade: ")); 
        this.add(txtidade);
        
        this.add(btncalcular); 
        btncalcular.addActionListener(this); //adiciona ao botão o actionListener. 
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
               
        
    }

    public ModelIdade getMIdade() {
        MIdade.setAnNasc(Integer.parseInt(txtanasc.getText()));
        MIdade.setAnAtual(Integer.parseInt(txtatual.getText()));
        return MIdade;
    }

    public void setMIdade(ModelIdade MIdade) {
        if(MIdade.getAnNasc()>0){
            
            txtidade.setText(Integer.toString(MIdade.getIdade()));
            
        }
        this.MIdade = MIdade;
    }
    
     public void addControlerActionListener(ActionListener al){
        
        btncalcular.addActionListener(al);
        
    }
    
    
}

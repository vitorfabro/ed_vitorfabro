
package ArvoreSimples;

import javax.swing.JOptionPane;


public class JavaApplication2 {

    public static void main(String[] args) {
        Arvore a  = new Arvore();
        a.inserir(6);
        a.inserir(4);
        a.inserir(2);
        a.inserir(1);
        
        JOptionPane.showMessageDialog(null, a.returnfilhoE(2));
    }
    
}

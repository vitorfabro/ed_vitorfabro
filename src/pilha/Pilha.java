

package pilha;





public class Pilha {

    public static void main(String[] args) {
        
        NewClass p = new NewClass(); 
        p.empilhar("Rua A", "A", "B");
        p.empilhar("Rua B", "AB", "BB");
        p.empilhar("Rua C", "AC", "BC");
        p.empilhar("Rua D", "AD", "BD");
        p.empilhar("Rua E", "AE", "BE");
        
        
        p.exibeUltimoValor();
        p.desempilhar(); 
        p.exibeUltimoValor();
       

     
    }
    
}

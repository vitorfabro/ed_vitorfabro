
package pilha;



class Cartas
{
    private String endereco;
    private String remetente;
    private String destinatario;
    
      public String getendereco()
         {
             return endereco;
         }
      
      public String getremetente()
         {
             return remetente;
         }
    
      public String getdestinatario()
         {
             return destinatario;
         }
      
    public Cartas(String endereco,String remetente, String destinatario)
        {
            this.endereco = endereco;
            this.remetente = remetente;
            this.destinatario = destinatario;
        }
    
     public void displayCarta()
      {
      System.out.print(" \nEndereco: " + endereco);
      System.out.print(" \nRemetente: " + remetente);
      System.out.println(" \nDestinatario : " + destinatario);
      }

            
}





public class NewClass {
    
    
public Cartas[] pilha; 
public int posicaoPilha; 
public NewClass() 
{ 
this.posicaoPilha = -1; 
this.pilha = new Cartas[5];
} 





public boolean pilhaVazia() 
{ 
if (this.posicaoPilha == -1) 
{ 
    return true; 
} 
return false; 
} 




public int tamanho() 
{ 
    if (this.pilhaVazia()) 
    { 
        return 0;
    } 
    return this.posicaoPilha + 1; 
} 





public void exibeUltimoValor() 
{ 
if (this.pilhaVazia()) 
{ 
    System.out.println("Pilha Vazia");
} 
else
pilha[posicaoPilha].displayCarta();
}  




public void desempilhar() 
{ 
if (pilhaVazia()) 
{ 
    System.out.println("Pilha Vazia");
}
else
posicaoPilha--;


} 



public void empilhar(String e, String r, String d) 
{ 
if (this.posicaoPilha < this.pilha.length - 1) 
{ 
    this.pilha[++posicaoPilha] = new Cartas(e, r, d); 
} 
}



    
}

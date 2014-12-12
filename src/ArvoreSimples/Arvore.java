
package ArvoreSimples;


public class Arvore 
{
    private No raiz;
    
    public Arvore()
    {
        raiz = null; // quando instanciado first = null
    }
    
            
    public void inserir(int codigo) {
      No novoNo = new No(codigo);    

      if(raiz==null)                
         raiz = novoNo;             
      else                          
         {
         No corrente = raiz;   // se o raiz não for null, corrente vale null     
         No pai;                    
         while(true)         // while pra rodar eternamente       
            {
            pai = corrente;
            if(codigo < corrente.getCodigo())  
               {
               corrente = corrente.getFilhoE();  
               if(corrente == null)                      
                  {                                     
                  pai.setFilhoE(novoNo);
                  return;
                  }
               }  
            else                    
               {
               corrente = corrente.getFilhoD();
               if(corrente == null)  
                  {                 
                  pai.setFilhoD(novoNo);
                  return;
                  }
               }  
            }  
         }  
    
    }
    
    public int returnfilhoE(int codigo)
    {
        No corrente = raiz;   // se o raiz não for null, corrente vale null     
        No pai;  
        while(true)         // while pra rodar eternamente       
            {
                pai = corrente;
                if(codigo == corrente.getCodigo())
                {
                    return corrente.getFilhoE().getCodigo();
                }
                else
                if(codigo < corrente.getCodigo())  
                   {
                        corrente = corrente.getFilhoE();  
                   }  
               else                    
                    {
                        corrente = corrente.getFilhoD();
                    }  
            } 
        
    }
    
    
}



package E6;

class Pessoa
{
    private String nome;
    int prioridade;
    
    public Pessoa(String n, int p)
    {
        nome = n;
        prioridade = p;
    }
    
    public int getPrioridade()
    {
        return prioridade;
    } 
    public String getNome()
    {
        return nome;
    }
    
  
    
    public String displayPessoa()
      {
        String  aluno = (("\n\nNome: " + nome)+ ("\nPrioridade: " + prioridade)).toString();
        return aluno;
      }
    
}



public class Fila {
    
    Pessoa[] a; 
    private int nElems; 
          
    public Fila(int max)    
    {
      a = new Pessoa[max];               
      nElems = 0;                        
    }
    
     public void insert(String nome, int p)
    {  
        int j;
        if(nElems == 0)
        {
            a[nElems++] = new Pessoa(nome, p);
        }
        else
        {
            for(j=nElems-1; j>=0; j--)
            {
                if(p >= a[j].getPrioridade())
                    a[j+1] = a[j];
                else
                    break;
            }
            a[j+1] = new Pessoa(nome, p);
            nElems++;
        }
    }
     
       public String remove()
    {
        return (a[--nElems].getNome()).toString();
    }
     
    
        
   public String displayP()           
    {
        String pessoa = "";
        for(int j=0; j<nElems; j++)
        {
            pessoa = pessoa + a[j].displayPessoa();
        }
        return pessoa; 
    }
    
    
}

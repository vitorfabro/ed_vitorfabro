


package exerciciolistaencadeda;

class Pessoa {

  private String nome;

  private String Pessoaquerida;

  private Pessoa proximo;
  
  
   public Pessoa(String nome, String nome2) 
   {
    this.nome = nome;
    this.Pessoaquerida = nome2;
    }
   
   public String getNome ()
   {
       return nome;
   }
   public void setNext (Pessoa n)
   {
       proximo = n;
   }
   public String displayPessoa()
   {
       return (" \nNome: " + nome + " Pessoa Querida: " + Pessoaquerida);
   }
   
   public Pessoa getNext()
   {
       return proximo;
   }

}

class ListaPessoas
{
    private Pessoa first;
    public ListaPessoas()
    {
        first = null;
    }
    
    public boolean isEmpty()
    {
        return (first == null);
    }
    public void InsertFirst(String nome1, String nome2)
    {
        Pessoa newPessoa  = new Pessoa(nome1,nome2);
        newPessoa.setNext(first);
        first = newPessoa;
    }
    public Pessoa deletFirst()
    {
        Pessoa temporatia = first;
        first = first.getNext();
        return temporatia;
    }
   public void print()
   {
        for(Pessoa n = first; n != null; n = n.getNext())
        {
            System.out.println(n.displayPessoa());
        } 
   }
   
    public void findname(String nome)
   {
        for(Pessoa n = first; n != null; n = n.getNext())
        {
            if(n.getNome().compareTo(nome)==0)
            {
            System.out.println(n.displayPessoa());
            }
        } 
   }
    
}


public class Lista {
    
}

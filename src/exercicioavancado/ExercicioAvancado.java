
package exercicioavancado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Jogador
   {
        private String nome;
        private int idade;
        private double altura;
        
        public Jogador(String nome,int idade, double altura)
        {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }
        
         public void displayJogador()
      {
      System.out.print(" Nome: " + nome);
      System.out.print(" Idade: " + idade);
      System.out.println(" Altura : " + altura);
      }
         
         public int getidade()
         {
             return idade;
         }
         
          public String getnome()
         {
             return nome;
         }
   }


class Estrutura
{
    private Jogador[] a;               
   private int nElems; 
   
   
   public Estrutura(int max)    
      {
      a = new Jogador[max];               
      nElems = 0;                        
      }
   
   
    public void insert(String nome, int idade, double altura)
      {
      int j;
      for(j=0; j<nElems; j++)  
          if(a[j].getidade()>=idade)  
            break;
      for(int k=nElems; k>j; k--)    
         a[k] = a[k-1];
      a[j] = new Jogador(nome, idade, altura);               
      nElems++;
      
      }
    
       public Jogador find(int searchidade)
      {                             
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;
      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         
         if(a[curIn].getidade()==searchidade)
         {
                  for (int i = curIn; a[i].getidade() == searchidade; i++)
                  {
                      System.out.println("\nO Jogador " + a[i].getnome() + " tem " + searchidade + " anos");
                      if(i==a.length-1)
                          break;
                  }
                  
                   for (int i = curIn-1; (a[i].getidade() == searchidade); i--)
                   {
                        System.out.println("\nO Jogador " + a[i].getnome() + " tem " + searchidade + " anos");
                        if (i==0)
                            break;    
                   }
             
                    return a[curIn];
         }
        
         else if(lowerBound > upperBound)
         {
            return null;
         }
         else                          
            {
            if(a[curIn].getidade()<searchidade)
               lowerBound = curIn + 1; 
            else
               upperBound = curIn - 1; 
            }  
         }                  
      }
       
       public void findname(String name)
       {
           boolean var = false;
           for(int i=0; i<nElems; i++)
           {
               if(a[i].getnome().compareTo(name)==0)
               {
                    a[i].displayJogador();
                   var = true;
               }
           }
           if(var == false)
           {
               System.out.println("Nada Encontrado");
           }
       }
       
        public void displayA()           
      {
      for(int j=0; j<nElems; j++)       
         a[j].displayJogador();
      }
     
}


public class ExercicioAvancado {

    public static void main(String[] args) {
        
        
         int maxSize = 4;            
      Estrutura arr;            
      arr = new Estrutura(maxSize); 
      
     Scanner entrada = new Scanner(System.in); 
      
      
      arr.insert("aaa", 12, 1.75);
      arr.insert("bb", 12, 1.75);
      arr.insert("aaa", 44, 1.75);
      arr.insert("ttt", 55, 1.75);
      //arr.insert("rrr", 55, 1.75);
      
       arr.displayA();
       
       System.out.println("\nEntre com a idade a ser pesquisada !");  
      int searchKey = entrada.nextInt();
       
        
      
        if(arr.find(searchKey)==null)
      {
          System.out.println("\nNada encontrado!");  
      }
        
      System.out.println("\nEntre com o nome a ser pesquisado !"); 
      entrada.nextLine();
      String searchname = entrada.nextLine();
      arr.findname(searchname);
        
    }
    
}

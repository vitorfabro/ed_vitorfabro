/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vitorfabro.e1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o tamanho do vetor");
        int numerovet = entrada.nextInt();
        
        EstruturaDeDados arr = new EstruturaDeDados(numerovet);
        
        System.out.println("");
        entrada.nextLine();
        
        int i = 0;
        for(i=0; i<numerovet; i++)
        {
           System.out.println("Digite um nome!!!");
           nome = entrada.nextLine();
           arr.insert(nome);
        }
        
        System.out.println("Digite uma letra: ");
        String letra = entrada.nextLine();
        arr.find(letra);
        
        System.out.println("Digite o nome que deseja deletar: ");
        nome = entrada.nextLine();
        if(arr.deletar(nome))
        {
            System.out.println("Nome excluido");
            arr.exibir();
        }
        else 
        {
            System.out.println("Nome nao encontrado");
        }
        
        
        System.out.println("Digite o nome que deseja buscar: ");
        nome = entrada.nextLine();
        String mensagem = arr.findname(nome);
        System.out.println(mensagem);
        
    }
    
}

class EstruturaDeDados
{
   private String[] a;                 
   private int nElems; 
   
    public EstruturaDeDados(int max)       
      {
      a = new String[max];               
      nElems = 0; 
      }
    
    public void find(String c)
    {
        boolean teste = false;
         for (int i = 0; i < nElems ; i++)
         {
             if (a[i].charAt(0) == c.charAt(0)) 
             { 
                System.out.println("O nome " + a[i] + " começa com a letra " + c ); 
                teste = true;
             }
         }
          if (!teste) 
          { 
            System.out.println("Nenhum nome começa com a letra: " + c);
          }
    }
    
    public void insert(String nome)
    {
        a[nElems] = nome;
        nElems++;
    }
    
    public boolean deletar(String name)
    {
        int j;
        boolean teste = false;
      for(j=0; j<nElems; j++) 
      {
         if(name.equals(a[j]))
         {
             teste = true;
             for(int k=j; k<nElems; k++) 
             {
            a[k] = a[k+1];
            nElems--; 
             }
         }
      }
      return teste;
      
    }
    
    public void exibir()
    {
         for(int i=0; i<nElems; i++)
        {
           System.out.println(a[i]);
        }
    }
    
    public String findname(String name)
    {
         int j;
         String mensagem="Nome nao encontrado";
      for(j=0; j<nElems; j++)       
         if( name.equals(a[j]))
         {
            mensagem = "Nome encontrado";
         }
         
        return mensagem;
        
        
        
      
    }
    
   
}

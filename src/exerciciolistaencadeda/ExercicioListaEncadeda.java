

package exerciciolistaencadeda;


public class ExercicioListaEncadeda {

   
    public static void main(String[] args) {
        ListaPessoas lp = new ListaPessoas();
        lp.InsertFirst("Vitor", "Adriana");
        lp.InsertFirst("Mikael", "Lisbeth");
        lp.InsertFirst("Leticia", "Neusa");
        lp.InsertFirst("Fantine", "Cosette");
        lp.InsertFirst("Eponine", "Marius");
        
        
        lp.print();
        System.out.println("------------------------------------");
        System.out.println("------------Apagar------------------");
        System.out.println("------------------------------------");
        lp.deletFirst();
        lp.print();
        System.out.println("------------------------------------");
        System.out.println("-----------Buscar Mikael------------");
        System.out.println("------------------------------------");
        
        lp.findname("Mikael");
    }
    
}

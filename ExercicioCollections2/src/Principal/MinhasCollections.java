package Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class MinhasCollections {
    public static void main(String[] args) {
    	
        
        System.out.println("Lista de ArrayList");
        
        List<Integer> minhaLista = new ArrayList<Integer>();
        minhaLista.add(1);
        minhaLista.add(5);		//ArrayList lista na ordem que foi inserido o numero.
        minhaLista.add(2);
        
        System.out.println(minhaLista);

        
        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }
        
        
        
        System.out.println();
        
        System.out.println("Lista hashSet");
        
        Set<Integer> meuSet = new HashSet<Integer>();
        meuSet.add(5);
        meuSet.add(2);				//HashSet ele lista em ordem ascendente e não imprime numeros iguais.
        meuSet.add(3);
        meuSet.add(5);
        
        System.out.println(meuSet);
        Iterator<Integer> iMeuSet = meuSet.iterator();
        
        while(iMeuSet.hasNext()){
            System.out.println(iMeuSet.next());
        }
 
 
 
    }
 
}

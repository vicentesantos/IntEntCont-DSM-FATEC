package teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pizza.Pizza;

public class PizzaTeste {

    @Test
    public void testeAdicionaIngredientes(){
        Pizza p1 = new Pizza ("Portuguesa");
        p1.adicionaIngrediente("mussarela");
        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("cebola");
        p1.adicionaIngrediente("ovo");
        p1.adicionaIngrediente("ervilha");
        p1.listarIngredientes();
        
        p1.removerIngredientes("ervilha");
        p1.removerIngredientes("ovo");
        assertEquals(5, p1.getTotalIngredientes());
        assertEquals(6, p1.getTotalIngredientes());   
        
    }
}

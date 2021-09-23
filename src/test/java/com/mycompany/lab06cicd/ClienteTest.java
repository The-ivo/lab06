package com.mycompany.lab06cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    Cliente cliente;
    
    public ClienteTest() {
      cliente = new Cliente();
    }
    
    @Test
    public void testAprovaCliente() {
        System.out.println("aprovaCliente");
        String expResult = "cliente aprovado";
      
        String result1 = cliente.aprovaCliente(1100, false, false);
        String result2 = cliente.aprovaCliente(900, true, false);
        String result3 = cliente.aprovaCliente(500, false, true);
        String result4 = cliente.aprovaCliente(950, false, false);
        String result[]= {result1, result2,result3,result4};
        
        for (String i : result) {
            assertEquals(expResult, i);
        }
        
    }
    
}

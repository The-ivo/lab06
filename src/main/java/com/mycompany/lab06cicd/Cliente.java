package com.mycompany.lab06cicd;

public class Cliente {
    
    public String aprovaCliente( int saldoMedio, boolean bomPagador, boolean concessaoEspecial){
        if (saldoMedio > 1000 || bomPagador ||  concessaoEspecial){
            return "cliente aprovado";
        }else{
        return "cliente Não aprovado";}     
    }
}

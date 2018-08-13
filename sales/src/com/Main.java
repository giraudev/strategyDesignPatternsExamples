package com;

import com.SalesExample.Cargo;
import com.SalesExample.CodeIf.Funcionario;
import com.SalesExample.Venda;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria Antonieta");
        funcionario.setSalario(1299.00);
        funcionario.setCargo(Cargo.GERENTE);

        Venda novaVenda = new Venda(funcionario, 200.00);

        System.out.println(funcionario.getCargo());
        System.out.println("IF: valor da comissão " + novaVenda.calculaComissao());
        System.out.println("STRATEGY: valor da comissão " + novaVenda.calculaComissaoComEnum());

    }
}

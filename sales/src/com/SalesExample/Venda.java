package com.SalesExample;

import com.SalesExample.CodeIf.Funcionario;

public class Venda {

    private final Funcionario funcionario;
    private final double valor;

    public Venda(Funcionario funcionario, double valor) {
        this.funcionario = funcionario;
        this.valor = valor;
    }
    double comissao;

    public double calculaComissao() {
        comissao = 0.0;

        Cargo cargo = this.funcionario.getCargo();
        if (cargo.equals(Cargo.ATENDENTE)) {
            //comissao de 10%
            comissao = valor * 0.1;
        } else if (cargo.equals(Cargo.VENDEDOR)) {
            //comissao de 15% + $5
            comissao = valor * 0.15 + 5;
        } else if (cargo.equals(Cargo.GERENTE)) {
            //comissao de 20% + 10
            comissao = valor * 0.2 + 10;
        }
        return comissao;
    }

    public double calculaComissaoComEnum() {

        comissao = 0.0;

        Cargo cargo = this.funcionario.getCargo();
        comissao = cargo.calculaComissao(valor);

        return comissao;

    }
}

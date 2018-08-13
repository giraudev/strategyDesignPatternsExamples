package com.SalesExample;

import com.SalesExample.CodeUsingStrategy.Comissao;

public enum Cargo implements Comissao {
    ATENDENTE {
        //parte com Enum
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.1;
        }
    },
    GERENTE {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.2 + 5;
        }
    },
    VENDEDOR {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.15 + 10;
        }
    },
    AJUDANTE {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.08 + 1;
        }
    },
    RECEPCIONISTA {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.05;
        }
    },
    DIRETOR {
        @Override
        public double calculaComissao(double valor) {
            return valor * 0.25 + 20;
        }
    };
}

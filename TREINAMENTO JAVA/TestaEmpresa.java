class Data {
    int dia;
    int mes;
    int ano;

    void preencheData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String getFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    Data dataDeEntrada;

    // metodos
    void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Data de entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho anual: R$" + this.calculaGanhoAnual());
        System.out.println("Data de entrada: " + this.dataDeEntrada.getFormatada());
    }

}

class Empresa {
    String nome;
    Funcionario[] empregados;
    String cnpj;
    int livre = 0;

    void adiciona(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }
}

class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];

        Funcionario f1 = new Funcionario();
        f1.salario = 1000;
        f1.dataDeEntrada = new Data();
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();
        f2.salario = 1700;
        f2.dataDeEntrada = new Data();
        empresa.adiciona(f2);

        empresa.empregados[0].mostra();
        empresa.empregados[1].mostra();
    }
}

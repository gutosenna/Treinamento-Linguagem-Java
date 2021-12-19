public class ArrayCopy {
    /* Objetivo: Transferir os conteudos de um array NOMECURSO para outro array
    CODCURSO com as mesmas caracteristicas e propriedades, mas com tamanhos
    diferentes, utilizando o metodo arraycopy */
    public static void main(String[] args) {
        //ENTRADA e PROCESSAMENTO DE DADOS

        /* Array unidimensional NOMECURSO com tamanho de 7 elementod [0] a [6] */
        char NOMECURSO[] = {'S','I','S','T','E','M','A'};

        /* Array unidimensional CODCURSO com tamanho de 4 elementod [0] a [3] */
        char CODCURSO[] = new char[4];

        /* Transferencia do conteudo entre os arrays utilizando o metodo arraycopy */
        System.arraycopy(NOMECURSO, 0, CODCURSO, 0, 4);

        /* SAIDA DE DADOS
           Apresentacao do resultado do processamento: Transferencia do conteudo
           entre arrays unidimensionais */
           System.out.println(new String(CODCURSO));
    }
}

public class ReferenciaStrings {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        System.out.println("O tamanho da string \"txt\" eh: " + txt.length()); //saida 25

        String texto = "Ola Mundo!";
        System.out.println(texto.toUpperCase()); // saida "OLA MUNDO!"
        System.out.println(texto.toLowerCase()); // saida "ola mundo!"

        System.out.println(texto.indexOf("!")); // saida 9

        String primeiroNome = "Guto", segundoNome = "Senna";
        System.out.println(primeiroNome + " " + segundoNome);
        primeiroNome = "Guto ";
        System.out.println(primeiroNome.concat(segundoNome));

        /* \n = nova linha 
         * \r = retorno de carruagem
         * \t = Tab (Tabulação)
         * \b backspace (retrocesso)
         * \f Feed de formulário
         */
        System.out.println(primeiroNome + "\n" + segundoNome);
        System.out.println(primeiroNome + "\r" + segundoNome);
        System.out.println(primeiroNome + "\t" + segundoNome);
        System.out.println(primeiroNome + "\b" + segundoNome);
        System.out.println(primeiroNome + "\f" + segundoNome);
    }
}

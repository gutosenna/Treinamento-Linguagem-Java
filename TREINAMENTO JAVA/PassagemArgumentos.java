public class PassagemArgumentos {
    public static void main(String[] args) {        
        for (int i = 0; i < args.length; i++) {   //Apresenta todos argumentos passados
            System.out.println("Voce digitou: "+ args[i]);
            if(args[i].equals("10")) {
                System.out.println("ACERTOU!");
            } 
            else {
                System.out.println("ERROU!");
            }
    }
  }
} 

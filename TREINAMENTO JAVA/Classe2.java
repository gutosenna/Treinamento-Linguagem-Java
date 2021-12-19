public class Classe2{

    public Classe2(){
      Classe1 c = new Classe1();
      System.out.println(c.nome + " , " + c.valor);
      altera(c);  //por referencia
      System.out.println(c.nome + " , " + c.valor);
    }
 
    public void altera(Classe1 newC){
       newC.valor = 100;
       newC.nome = "Isso é referencia";
    }
 
    public static void main(String args[]){
       new Classe2();
    }
 }
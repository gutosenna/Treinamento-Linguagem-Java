// classe abstrata
abstract class Abstrato {
    public String fname = "Guto";
    public int age = 29;
    public abstract void estudos(); // metodo abstrato
  }
  
  // Subclass (herança do Abstrato)
  class Estudante extends Abstrato {
    public int graduationYear = 2008;
    public void estudos() { // o corpo do metodo abstrato é fornecido aqui
      System.out.println("Estudando todo dia");
    }
  }

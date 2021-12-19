class Abstrato2 {
    public static void main(String[] args) {
      // cria um objeto para a classe Estudante (which inherits attributes and methods from Main)
      Estudante myObj = new Estudante(); 
      
      System.out.println("Nome: " + myObj.fname);
      System.out.println("Idade: " + myObj.age);
      System.out.println("Ano de formacao: " + myObj.graduationYear);
      myObj.estudos(); // chama o metodo abstrato
    }
  }
  

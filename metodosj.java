class Main {
  //aqui cria um método
  static void imPrime() {
    System.out.println("Só imprime isso");
  }

  //aqui cria um método passando parametro
  static void meuMetodo(String nome) {
    System.out.println("O nome é: "+ nome);
  }

  //aqui cria um método passando parametro
  static void nomeEidade(String nome,int ano) {
    System.out.println(nome + " tem "+ ano +"anos");
  }

  //crie um metodo chamado exib que exibe uma String na tela
  static void exib(String profissao){
    System.out.println("A minha profissao é: " + profissao);
  }

  //crie um método chamado exib que exibe uma String na tela

  
  //classe principal do java
  public static void main (String[] args){
    //chama método meuMetodo()
    imPrime();

    //chama método meuMetodo
    meuMetodo("Edney");
    meuMetodo("Bruna");
    meuMetodo("Raquel");

    //método com dois parametros
    nomeEidade("Edney", 48);
    nomeEidade("Bruna", 17);
    nomeEidade("Raquel", 17);

    //chama o método exib
    exib("Dançarino");
  }
     
   }
  

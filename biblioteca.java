import javax.swing.JOptionPane;

class biblioteca {
  public static void main(String[] args) {

    Integer quantidadeLivros = 0;
    Integer escolha = 0;

    while (quantidadeLivros <=0 ){
    quantidadeLivros = Integer.parseInt(JOptionPane.showInputDialog("Quantos livros deseja cadastrar?"));
      
    }

    String  [] titulo = new String [quantidadeLivros];
    String  [] autor = new String [quantidadeLivros];
    String  [] edicao = new String [quantidadeLivros];
    String  [] editora = new String [quantidadeLivros];
    String  [] genero = new String [quantidadeLivros];
    Integer [] ano = new Integer [quantidadeLivros];

    for(int i=0; i<quantidadeLivros; i++){
      titulo  [i] = JOptionPane.showInputDialog("Informe o titulo do livro " + (i+1) + ": ");
      autor   [i] = JOptionPane.showInputDialog("Informe o autor do livro " + (i+1) + ": ");
      edicao  [i] = JOptionPane.showInputDialog("Informe a edição do livro " + (i+1) + ": ");
      editora [i] = JOptionPane.showInputDialog("Informe a editora do livro " + (i+1) + ": ");
      genero  [i] = JOptionPane.showInputDialog("Informe o genero do livro " + (i+1) + ": ");
      ano     [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do livro " + (i+1) + ": "));      
      
    }

      escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dos liivros"));
      escolha--;    

      JOptionPane.showMessageDialog(null, "Informações do livro: \n Titulo" + titulo[escolha] + "\n Autor: " + autor[escolha] + "\nEdição: " +              edicao[escolha] + "\nGênero: " + genero[escolha] + "\nAno lançamento: " + ano[escolha]);
        
    
  }
}
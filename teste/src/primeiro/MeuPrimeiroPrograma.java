package primeiro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //leitura de dados



public class MeuPrimeiroPrograma {

    public static void main(String[] args)
    {
    	

        String nome;
        String endereco;
        String telefone;
        int opcao;
        int ativo;

        Scanner Ler = new Scanner(System.in);
        Client Cliente = new Client();
        List<Client> Clientes = new ArrayList<>();
        Product Produto = new Product();
        List<Product> Produtos = new ArrayList<>();
 
        ativo = 0;
        
      do {
        System.out.print("MENU:\n 1- Cadastrar clientes \n 2- Buscar Cliente \n 3- Cadastrar Produto \n 4- Buscar produto \n 5- Cadastrar Venda \n 6- Mostrar Estoque \n 7- Sair");
    	
        do 
        {
        	System.out.print("\n Escolha uma opção do Menu\n");
        	
        	opcao = Ler.nextInt();
        	
        }while(opcao<1 || opcao>7);	
    	
    	switch (opcao) {
    	case 1 : 
    		Cliente.CadastraCliente();
    			
    		break;
    		
    	case 2: 
    		Cliente.BuscaCliente();
    		
        	break;
        	
    	case 3:
    		Produto.CadastraProduto();
    		
        	break;
        	
    	case 4:
    		Produto.BuscaProduto();
    		break;
    	
    	case 5:
    		Cliente.MostraCliente();
    		Produto.MostraProduto();
    		
    		break;
    		
    	case 6:
    			Produto.MostraEstoque();
   
    		break;
    	
    	case 7:
    			System.exit(0);
    		break;
     
    	default:
    	
            } }while(ativo == 0);
        }

    }
      class Client {

        public String Nome;

        public String Endereco;

        public String Telefone;
        
        Scanner Ler = new Scanner(System.in);
        
        List<Client> Clientes = new ArrayList<>();
        
        

        public Client(){


        }

        public Client(String nome, String endereco, String telefone){

            this.Nome = nome;
            this.Endereco = endereco;
            this.Telefone = telefone;

        }

        public String getNome(){

            return Nome;
        }

        public void setNome(String nome){

            Nome = nome;
        }

        public String getEndereco(){

            return Endereco;
        }

        public void setEndereco(String endereco){

            Endereco = endereco;
        }

        public String getTelefone(){

            return Telefone;
        }

        public void setTelefone(String telefone){

            Telefone = telefone;
        }
        
        public void CadastraCliente() {
        System.out.print("Insira o numero de clientes que deseja cadastrar\n");
        int n = Ler.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println("Digite o Nome do Cliente" + " " + i);

            Ler.nextLine();
            Nome = Ler.next();

            System.out.println("Endereço do Cliente" + " " + i);

            Ler.nextLine();
             Endereco = Ler.next();

            System.out.println("Telefone do Cliente" + " " + i );

            Ler.nextLine();
            Telefone = Ler.next();

            Clientes.add(new Client(Nome, Endereco, Telefone));
        }
        }
        
        public void BuscaCliente() {
        String nomefiltrado;
        System.out.println("Digite o nome que deseja buscar:\n");
        Ler.nextLine();
        nomefiltrado = Ler.nextLine();
        
      
        for (Client c : Clientes) {
            if (c.getNome().equals(nomefiltrado))
            {
                System.out.println("Nome - " + c.getNome() + "\nEndereço -" + c.getEndereco() + "\nTelefone -" + c.getTelefone());
            }
        	}
        }
        
        public void MostraCliente() {
        	String nomefiltrado;
        	
            for (Client c : Clientes) {
               
                    System.out.println("Nome: " + c.getNome() + "\nEndereço: " + c.getEndereco() + "\nTelefone: " + c.getTelefone() + "\n");
                }
            
            System.out.println("Digite o nome do cliente selecionado:\n");
            
            Ler.nextLine();
            nomefiltrado = Ler.nextLine();
       	
            }


        @Override
        public String toString(){
            return "Nome: "
                    + Nome
                    + "Endereço: "
                    + Endereco
                    + "Telefone: "
                    + Telefone;
        }
        
    }  
      
//----------------------------------------------------
      class Product {

          public String Nome;

          public String Descricao;

          public int Valor;
          
          public int Lucro;
          
          public int Estoque;
          
          Scanner Ler = new Scanner(System.in);
          
          List<Product> Produtos = new ArrayList<>();
          
          

          public Product(){


          }

          public Product(String nome, String descricao, int valor, int lucro, int estoque){

              this.Nome = nome;
              this.Descricao = descricao;
              this.Valor = valor;
              this.Lucro = lucro;
              this.Estoque = estoque;

          }

          public String getNome(){

              return Nome;
          }

          public void setNome(String nome){

              Nome = nome;
          }

          public String getDescricao(){

              return Descricao;
          }

          public void setDescricao(String descricao){

              Descricao = descricao;
          }

          public int getValor(){

              return Valor;
          }

          public void setValor(int valor){

              Valor = valor;
          }
          
          public int getLucro(){

              return Lucro;
          }
          
          public void setLucro(int lucro){

              Lucro = lucro;
          }
          
          public int getEstoque(){

              return Estoque;
          }
          
          public void setEstoque(int estoque){

              Estoque = estoque;
          }
          
          public void CadastraProduto() {
              System.out.print("Insira o numero de Produtos que deseja cadastrar\n");
              int n = Ler.nextInt();

              for(int i=1;i<=n;i++)
              {
                  System.out.println("Digite o Nome do Produto" + " " + i);

                  Ler.nextLine();
                  Nome = Ler.next();

                  System.out.println("Descrição do Produto" + " " + i);

                  Ler.nextLine();
                   Descricao = Ler.next();

                  System.out.println("Valor do Produto" + " " + i );

                  Ler.nextLine();
                  Valor = Ler.nextInt();
                  
                  System.out.println("Porcentagem de Lucro do Produto" + " " + i );

                  Ler.nextLine();
                  Lucro = Ler.nextInt();
                  
                  System.out.println("Estoque do Produto" + " " + i );

                  Ler.nextLine();
                  Estoque = Ler.nextInt();

                  Produtos.add(new Product(Nome, Descricao, Valor, Lucro, Estoque));
              }
              }
          
          public void BuscaProduto() {
              String nomefiltrado;
              System.out.println("Digite o nome do Produto que deseja buscar:\n");
              Ler.nextLine();
              nomefiltrado = Ler.next();
           
              for (Product p : Produtos) {
                  if (p.getNome().equals(nomefiltrado))
                  {
                      System.out.println("Nome - " + p.getNome() + "\nDescricao -" + p.getDescricao() + "\nValor -" + p.getValor() + "\nLucro - " + p.getLucro() + "\nEstoque -" + p.getEstoque());
                  }
              	}
              }
         
      
      public void MostraEstoque() {
       
          for (Product p : Produtos) {
             
                  System.out.println("Nome: " + p.getNome() + "\nEstoque: " + p.getEstoque());
          	}
          }
      
      public void MostraProduto() {
      	
    	String produtofiltrado;
      	int resposta = 1;
      	int vendas;
      	int estoquedepois = 0;
      	
      	do {
      	 for (Product p : Produtos){
             
      		 	System.out.println("Nome: " + p.getNome() + "\nDescricao: " + p.getDescricao() + "\nValor: " + p.getValor() + "\nLucro: " + p.getLucro() + "\nEstoque: " + p.getEstoque());
             }
      	
          
          System.out.println("Digite o nome do Produto selecionado:\n");
          
          Ler.nextLine();
          produtofiltrado = Ler.nextLine();
          
          System.out.println("Quantos produtos foram vendidos para esse cliente?\n");
        	
          vendas = Ler.nextInt();
          
         
          for (Product p : Produtos) {
              if (p.getNome().equals(produtofiltrado))
              {
                 estoquedepois = p.getEstoque() - vendas;
                 p.setEstoque(estoquedepois);
              }
              
              System.out.println("Nome: " + p.getNome() + "\nEstoque:");
              System.out.println(estoquedepois);
          }
              System.out.println("Deseja Continuar? Digite 1 para SIM e 2 para NÃO");
              resposta = Ler.nextInt();
          
           } while(resposta == 1);
    }} 
      
      

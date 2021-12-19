import java.util.Scanner;


class Principal {
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		
		String nome_cliente;
		int rg_cliente;
		long cpf_cliente;
		
		String rua;
		int cep;
		String bairro;
		int numero;
		String cidade;
		String uf;
		
		String celular;
		String telefone_residencial;
		String telefone_comercial;
		String fax;
		
		int loop = 0;
				
		while(loop<2)
		{
			
			
			loop = loop +1;
			
			
			System.out.print("Digite Nome Cliente: ");			
			nome_cliente = entrada.nextLine();
												
			System.out.print("Digite RG Cliente: ");
			rg_cliente = entrada.nextInt();	
									
			System.out.print("Digite CPF Cliente: ");
			cpf_cliente = entrada.nextLong();
			entrada.nextLine();
			
			System.out.print("Digite Rua: ");
			rua =  entrada.nextLine();
			
			System.out.print("Digite Cep: ");
			cep = entrada.nextInt();
			entrada.nextLine();
			
			System.out.print("Digite Bairro: ");
			bairro = entrada.nextLine();
			
			System.out.print("Digite Numero: ");
			numero =  entrada.nextInt();
			entrada.nextLine();
			
			System.out.print("Digite Cidade: ");
			cidade = entrada.nextLine();
			
			System.out.print("Digite UF: ");
			uf = entrada.nextLine();
			
			System.out.print("Digite Celular: ");
			celular = entrada.nextLine();
			
			System.out.print("Digite Telefone Residencial: ");
			telefone_residencial = entrada.nextLine();
			
			System.out.print("Dogite Telefone Comercial: ");
			telefone_comercial = entrada.nextLine();
			
			System.out.print("Digite Fax: ");
			fax = entrada.nextLine();
			entrada.close();
			
			
			Cliente cliente = new Cliente(nome_cliente,rg_cliente,cpf_cliente);
			Endereco endereco = new Endereco(rua,cep,bairro,numero,cidade,uf);
			Telefone telefone = new Telefone(celular,telefone_residencial,telefone_comercial,fax);
						
			System.out.println("*****************************************************");
			
			System.out.println("Nome do Cliente: "+cliente.getNome_cliente());
			System.out.println("RG do Cliente: "+cliente.getRg_cliente());
			System.out.println("CPF do Cliente: "+cliente.getCpf_cliente());
			
			System.out.println("*****************************************************");
			
			System.out.println("Rua: "+endereco.getEndereco().getRua());
			System.out.println("Cep: "+endereco.getEndereco().getCep());
			System.out.println("Bairro: "+endereco.getEndereco().getBairro());
			System.out.println("Numero: "+endereco.getEndereco().getNumero());
			System.out.println("Cidade: "+endereco.getEndereco().getCidade());
			System.out.println("UF: "+endereco.getEndereco().getUf());
			
			System.out.println("*****************************************************");
			
			System.out.println("Celular: "+telefone.getTelefone().getCelular());
			System.out.println("Telefone Residencial: "+telefone.getTelefone().getTelefone_residencial());
			System.out.println("Telefone Comercial: "+telefone.getTelefone().getTelefone_comercial());
			System.out.println("Fax: "+telefone.getTelefone().getFax());
			
			System.out.println("*****************************************************");
		}

 	}
}

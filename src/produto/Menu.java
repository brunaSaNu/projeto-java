package produto;

import java.util.ArrayList;
import java.util.Scanner;

import produto.model.Produto;
import produto.model.ProdutoNoEcommerce;

public class Menu {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		int opcao = -1;
		Scanner scan = new Scanner (System.in);
		Scanner leia = new Scanner (System.in);
		
		
		do {
			System.out.println("*************************************************");
			System.out.println("            BEM VINDE AO MERCADO PRESO           ");
			System.out.println("\n 1 - Vender um produto");
			System.out.println(" 2 - Listar todos os produtos");
			System.out.println(" 3 - Alterar preço do produto");
			System.out.println(" 4 - Remover produto");
			System.out.println(" 0 - Sair");
			System.out.println("**************************************************");
			System.out.println();
			System.out.println("Entre com a opção desejada:");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				System.out.println("Para anunciar a venda de um produto, digite o nome do mesmo: ");
				String nomeProduto = leia.nextLine();		
				
				System.out.println("Agora digite o preço pelo qual quer o vender:");
				float precoProduto = scan.nextFloat();
				
				listaProdutos.add(new ProdutoNoEcommerce(nomeProduto, precoProduto));
				
				System.out.println("\n***Produto anunciado com sucesso!***\n");
			}
			
			if(opcao == 2) {
				for(int i = 0; i <listaProdutos.size(); i++) {
					Produto n = listaProdutos.get(i);
					System.out.println(i + " - " + n.getNomeProduto() + ", custa R$" + n.getPrecoProduto());
				}
				
			}
			
			if(opcao == 3) {
				System.out.println("Para alterar o preço de um produto, digite seu número: ");
				for(int i = 0; i <listaProdutos.size(); i++) {
					Produto n = listaProdutos.get(i);
					System.out.println(i + " - " + n.getNomeProduto() + " - R$" + n.getPrecoProduto());
				}
				int produto = scan.nextInt();
				
				System.out.println("Digite o novo preço: ");
				float novoPreco = scan.nextFloat();
				
				listaProdutos.get(produto).setPrecoProduto(novoPreco);
				
				System.out.println("O preço foi atualizado com sucesso!");
			}
			
			if(opcao == 4) {
				System.out.println("Digite o número correspondente ao produto que deseja para de vender: ");
				int produto = scan.nextInt();
				
				listaProdutos.remove(produto);
				
				System.out.println("Produto removido com sucesso!");
			}
			
			} while (opcao != 0);

	}

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

public class Principal {

	public static void main(String[] args) {

		try {

			Scanner leia = new Scanner(System.in);
			LinkedList<Funcionario> lista = new LinkedList();

			BufferedReader lerArquivo = new BufferedReader(new FileReader("usuario.txt"));

			String linha = lerArquivo.readLine();

			while (linha != null) {

				StringTokenizer st = new StringTokenizer(linha, ",");
				Funcionario f = new Funcionario();

				f.setLogin(st.nextToken());
				f.setSenha(st.nextToken());
				f.setNivel(st.nextToken());

				lista.add(f);
				linha = lerArquivo.readLine();
			}

			for (int i = 0; i < lista.size(); i++) {

				lista.get(0).setNome("Jo�o");
				lista.get(1).setNome("Pedro");
				lista.get(0).setCpf("086.456.654-92");
				lista.get(1).setCpf("675.435.825-78");
			}

			lerArquivo.close();

			System.out.println("------------------------ESTACIONAMENTO DO JO�OZINHO------------------------");
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("SELECIONE A OP��O-\n");
			System.out.println("\t\t <1> - Acessar o Sistema");
			System.out.println("\t\t <0> - Finalizar\n---------------------------------------------------------------------------");
			int op = leia.nextInt();

			while ((op < 0) || (op > 1)) {
				System.out.println("Op��o Incorreta !!!");
				System.out.print("SELECIONE A OP��O-\n\n");
				System.out.println("\t\t <1> - Acessar o Sistema");
				System.out.println("\t\t <0> - Finalizar\n---------------------------------------------------------------------------");
				op = leia.nextInt();
			}

			switch (op) {

			case 1:
				System.out.print("Para acessar o sistema digite o login/senha do usu�rio e a data atual, conforme abaixo:\n\n");

				System.out.printf("Login: \n");
				String login = leia.next();

				Funcionario f = new Funcionario();
				int w = 0;

				for (int i = 0; i < lista.size(); i++) {

					if (login.compareTo(lista.get(i).getLogin()) == 0) {
						w = 1;
						f = lista.get(i);

						// System.out.println(f.getSenha());
						System.out.printf("Senha: \n");
						String senhaAtual = leia.next();

						int confirma = f.autentica(senhaAtual);
						

						if (confirma == 1) {
							
							System.out.println("SENHA CONFIRMADA COM SUCESSO !!!");

							System.out.print("Digite a data atual: \n");
							String dataAtual = leia.next();

							System.out.print("SELECIONE A  OP��O-\n\n");
							System.out.println("\t\t <1> - Cadastrar novo usu�rio");
							System.out.println("\t\t <2> - Contas");
							System.out.println("\t\t <3> - Relat�rio Final");
							System.out.println(
									"\t\t <4> - Sair\n---------------------------------------------------------------------------");
							int op2 = leia.nextInt();
							System.out.printf("---------------------------------------------------------------------------\n");

							while (op2 != 4) {

								if ((op2 != 4) && (op2 > 0) && (op2 <= 3)) {

									switch (op2) {

									case 1:
										if (lista.get(i).getNivel().compareTo("administrador") == 0) {

											// f = lista.get(i);
											Funcionario novo = new Funcionario();
											System.out.println("Digite o nome do novo funcion�rio: ");
											novo.setNome(leia.next());
											System.out.println("Digite o CPF: ");
											novo.setCpf(leia.next());
											System.out.println("Digite um email para o Login: ");
											novo.setLogin(leia.next());
											System.out.println("Digite uma senha: ");
											String senhaAtualMD5 = DigestUtils.md5Hex(leia.next());
											novo.setSenha(senhaAtualMD5);
											System.out.println("N�vel de acesso - (Digite 1 para Administrador ou 2 para Funcion�rio): ");
											if (leia.nextInt() == 1) {
												novo.setNivel("administrador");
												System.out.println("Novo usu�rio cadastrado com sucesso !!!");
											}
											else if (leia.nextInt() == 2) {
												novo.setNivel("funcionario");
												System.out.println("Novo usu�rio cadastrado com sucesso !!!");
											}
											
											else System.out.println("Op��o Incorreta");					
											

											lista.add(novo);
											
											 System.out.println(lista.get(0).getNome());
											 System.out.println(lista.get(1).getNome());
											 System.out.println(lista.get(2).getNome());										
											
											break;											 
										}

										else {
											System.out.println("Voc� precisa ser um Administrador para cadastrar um novo usu�rio !");
										}
										
									case 2:
										System.out.print("SELECIONE A  OP��O-\n\n");
										System.out.println("\t\t <1> - Cadastrar Conta");
										System.out.println("\t\t <2> - Alterar Conta");
										System.out.println("\t\t <3> - Excluir Conta");
										System.out.println("\t\t <4> - Consultar Conta(Pelo Nome do Cliente ou pela Placa do Ve�culo)");
										System.out.println("\t\t <5> - Fechar Conta");
										System.out.println("\t\t <6> - Relat�rio de Ve�culos no Estacionamento(Tela dados do Cliente e do Ve�culo)");
										System.out.println("\t\t <7> - Total de Di�rias Pagas");										
										System.out.println("\t\t <8> - Voltar ao MENU PRINCIPAL\n---------------------------------------------------------------------------");										
										int op3 = leia.nextInt();
										System.out.printf("---------------------------------------------------------------------------\n");

										while (op3 != 8) {

											if ((op3 != 8) && (op3 > 0) && (op2 <= 7)) {

												switch (op3) {

													case 1:	
														Conta[] conta;
														conta = new Conta[6];
														
														for (i = 0; i < conta.length; i++) {
															if (conta[i] == null) {
																System.out.println("Digite o nome do Cliente: ");
																
																
																//conta[i] = (new Conta(Veiculo(), new Cliente("Haroldo"), "19/06/2019", "19:00", "20:00", 12.00, true)
																
																
																
															}
															
															
															
															
														}
														
													case 2:													
														
													case 3:													
														
													case 4:
													
													case 5:
														
													case 6:
														
													case 7:
														
												}
											}
										}		
										
										
									}
								}

								System.out.print("SELECIONE A PR�XIMA OP��O-\n\n");
								System.out.println("\t\t <1> - Cadastrar novo usu�rio");
								System.out.println("\t\t <2> - Contas");
								System.out.println("\t\t <3> - Relat�rio Final");
								System.out.println(	"\t\t <4> - Sair\n---------------------------------------------------------------------------");
								op2 = leia.nextInt();
								System.out.printf("---------------------------------------------------------------------------\n");
							}
						}

						else {
							System.out.println("Senha incorreta!");
						}

					}

				}

				if (w == 0) {
					System.out.println("N�o existe esse usu�rio !!!");
				}
				break;

			case 0:
				System.out.println(
						"\n*************************************** F I M ***************************************");
				break;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/*
 * CRIPTOGRAFIA
 * 
 * Scanner ler = new Scanner(System.in); System.out.
 * println("Para acessar o sistema digite o login/senha do usu�rio e a data atual, conforme abaixo:"
 * );
 * 
 * System.out.printf("Login: \n"); String login = ler.next();
 * 
 * System.out.printf("Senha: \n"); String senhaAtual = ler.next();
 * 
 * System.out.printf("\nData atual: \n"); String dataAtual = ler.next();
 * 
 * ler.close();
 */

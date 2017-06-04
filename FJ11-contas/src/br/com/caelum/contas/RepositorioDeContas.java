package br.com.caelum.contas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class RepositorioDeContas {
	public void salva(List<Conta> contas) {
		PrintStream stream;
		try {
			stream = new PrintStream("contas.txt");
			for(Conta conta : contas) {
				stream.println(conta.getTipo() + ", " + conta.getNumero() + ", " + conta.getAgencia() + ", " + conta.getTitular() + ", " + conta.getSaldo());
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public List<Conta> carrega() throws FileNotFoundException  {
		List<Conta> lista = new ArrayList<>();
		Scanner scanner = new Scanner(new File("contas.txt"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String[] valores = linha.split(",");
			if(valores[0].equals("Conta Corrente")) {
				Conta conta = new ContaCorrente();
				lista.add(montaConta(conta, valores));
			} else if(valores[0].equals("Conta Poupança")) {
				Conta conta = new ContaPoupanca();
				lista.add(montaConta(conta, valores));
			}
		}
		
		return lista;
	}
	
	private Conta montaConta(Conta conta, String[] valores) {
		int numero = Integer.parseInt(valores[1]);
		double saldo = Double.parseDouble(valores[4]);
		conta.setNumero(numero);
		conta.setAgencia(valores[2]);
		conta.setTitular(valores[3]);
		conta.depositar(saldo);
		
		return conta;
	}
}

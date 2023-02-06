package br.com.senaitagua.sa1.app5;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.FaturamentoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// O que é um objeto:
		// é uma instancia de uma classe
		FaturamentoBO fbo = new FaturamentoBO();
		
		// Entrada de dados
		String lerJan = JOptionPane.showInputDialog("Janeiro:");
		String lerFev = JOptionPane.showInputDialog("Fevereiro:");
		String lerMar = JOptionPane.showInputDialog("Março:");
		
		// Cast
		double v1,v2, v3;
		v1 = Double.parseDouble(lerFev);
		v2 = Double.parseDouble(lerFev);
		v3 = Double.parseDouble(lerMar);
		
		// "." - Chamar métodos do objeto
		JOptionPane.showMessageDialog(null, fbo.calcularMediaTrim(v1, v2, v3));
		

	}

}
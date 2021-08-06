package br.com.generation.exercicio1;

	public class AtributosCliente {
	
		public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
			
		cliente1.setNome("Gisele");
		cliente1.setPeso(66.00);
		cliente1.setAltura(1.67);
		cliente1.setRoupa("M - Adulto");
		
		cliente2.setNome("Leonardo");
		cliente2.setPeso(45.00);
		cliente2.setAltura(1.32);
		cliente2.setRoupa("G - Infantil");
		
		System.out.println("======= Clientes ======\n");
		System.out.println("Nome do Cliente: " + cliente1.getNome());
		System.out.println("Peso do Cliente: " + cliente1.getPeso());
		System.out.println("Altura do Cliente: " + cliente1.getAltura());
		System.out.println("Tamanho de Roupa: " + cliente1.getRoupa());
		
		
		System.out.println("\n");
		System.out.println("Nome do Cliente: " + cliente2.getNome());
		System.out.println("Peso do Cliente: " + cliente2.getPeso());
		System.out.println("Altura do Cliente: " + cliente2.getAltura());
		System.out.println("Tamanho de Roupa: " + cliente2.getRoupa());

	}
}

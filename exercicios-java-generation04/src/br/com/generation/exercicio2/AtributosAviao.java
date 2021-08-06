package br.com.generation.exercicio2;

public class AtributosAviao {
	
		public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
			
		aviao1.setAviao("Air Canada");
		aviao1.setVoos("Internacional");
		aviao1.setPassageiros(300);
			
		aviao2.setAviao("GOL");
		aviao2.setVoos("Nacional");
		aviao2.setPassageiros(200);
		
		System.out.println("====== CIAS ÁEREAS  ======");
		
		System.out.println("\n");
		System.out.println("Cia Aérea: " + aviao1.getAviao());
		System.out.println("Voo: " +aviao1.getVoos());
		System.out.println("Capacidade: " + aviao2.getPassageiros());
		
		
		System.out.println("\n");
		System.out.println("Cia Aérea: " + aviao2.getAviao());
		System.out.println("Voo: " + aviao2.getVoos());
		System.out.println("Capacidade: " + aviao2.getPassageiros());


	}
}

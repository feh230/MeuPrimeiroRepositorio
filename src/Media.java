import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		// Media do Primeiro Bimestre
		System.out.println("PRIMEIRO BIMESTRE\n");
		
		System.out.print("\tDigite a nota da prova:");
		double nota_1 = sn.nextDouble();
		System.out.print("\tDigite a nota do projeto:");
		double nota_2 = sn.nextDouble();
		System.out.print("\tDigite a nota da lista de exercicios:");
		double nota_3 = sn.nextDouble();
		System.out.print("\tDigite a nota da contribuição dos projetos:");
		double nota_4 = sn.nextDouble();
		double media = (nota_1 * 0.3) + (nota_2 * 0.3) + (nota_3 * 0.2) + (nota_4 * 0.3);
		System.out.println("Sua media no Primeiro Bimestre foi de:"+ media+"\n\n");
		
		// Media do Segundo Bimestre
		System.out.println("SEGUNDO BIMESTRE\n");
		
		System.out.print("\tDigite a nota da prova:");
		double nota_01 = sn.nextDouble();
		System.out.print("\tDigite a nota do projeto:");
		double nota_02 = sn.nextDouble();
		System.out.print("\tDigite a nota da lista de exercicios:");
		double nota_03 = sn.nextDouble();
		System.out.print("\tDigite a nota da contribuição dos projetos:");
		double nota_04 = sn.nextDouble();
		double media_2 = (nota_01 * 0.3) + (nota_02 * 0.3) + (nota_03 * 0.2) + (nota_04 * 0.3);
		System.out.print("Sua media no Segundo Bimestre foi de: "+ media_2+"\n\n");
		
		
		double MediaGeral = (media + media_2) / 2;
		
		System.out.println("Sua media semestral foi de: "+ MediaGeral);
		
			if (MediaGeral >= 8) {
				System.out.print("Aprovado");
			}
			else {
				double pontuacao = 10 - MediaGeral;
				System.out.println("Reprovado, Você precisa de: " + pontuacao + " na prova final para passar" );
			}
	
		}

}

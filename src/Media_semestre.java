package Exercicios;
import java.util.Scanner;

public class Media_semestre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		String stop="sim";
        double prova,projeto,lista;
        int contaprov=0,contreprov=0,contaf=0,cont=0;
        double result,somabi=0,guardanota=0,maior=0,menor=0;
        double rec,media;
        do{
            cont=cont+1;
            System.out.println("Aluno: "+cont);
         for(int i=1;i<3;i++){
             
             switch(i){
                 case(1):
                     System.out.println("Primeiro bimestre");
                             break;
                             
                 case(2):
                     System.out.println("Segundo bimestre");
                             break;
                 case(8):
                     System.out.println("Terceiro bimestre");
                             break;
                             
                     
             }
             
             
            System.out.println("Qual a nota da prova?");
            prova = Scan.nextDouble()*5;
             System.out.println("Qual a nota do projeto?");
            projeto = Scan.nextDouble()*3;
             System.out.println("Qual a nota da lista de exercícios?");
             lista = Scan.nextDouble()*2;
             
             result = (prova+projeto+lista)/10;
             somabi = somabi+result;      
            
         }  
         result = somabi/3;
          if(result <5){
             System.out.println("Aluno reprovado");
             contreprov = contreprov+1;
         }
         
        else if(result < 8 && result >=5){
             contaf=contaf+1;
             System.out.println("O aluno de número "+cont+" não foi aprovado.\n"
                     + "Qual a nota tirada na recuperação?");
             rec = Scan.nextDouble();
             result = (result+rec)/2;
         }
         
         
           if(result>=8){
             System.out.println("Aluno aprovado");
             contaprov = contaprov+1;
         }else{
               System.out.println("Reprovado");
               contreprov=contreprov++;
           }
           
         if(cont==1){
             maior=result;
             menor=result;
         }
         else{
             if(result>maior){
                 maior=result;
             }else if(result<menor){
                 menor=result;
             }
         }
         guardanota = guardanota+result;
            System.out.println("Deseja adicionar mais algum aluno?(sim/nao)");
            stop = Scan.next();
            
            somabi=0;
            
        }while(stop.equals("sim"));
        
        media=guardanota/cont;
        
        System.out.println("");
        System.out.println("A média geral é "+media);
        System.out.println(menor+" foi a menor média da turma e "+maior+" foi a maior");
        
        if(contaprov>1){
        System.out.println(contaprov+" alunos foram aprovados");
        }else if(contaprov==1){System.out.println("1 aluno foi aprovado");}
        else{ System.out.println("Não houveram aprovados");
        
        }
        if(contreprov>1){
        System.out.println(contreprov+" foram reprovados");
        }else if(contreprov==1){System.out.println("1 aluno reprovado");}
        else{System.out.println("Não houveram reprovados");
        
        }
        if(contaf>1){
        System.out.println(contaf+" tiveram que fazer o teste final");
        }else if(contaf==1){
            System.out.println("1 aluno teve que fazer o teste final");
        }else{
            System.out.println("Ninguèm precisou fazer o teste final");
        }
    }
    
}
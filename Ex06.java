package Lista05ex06;
import java.util.Scanner;
public class Ex06{

        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            int loop = 1;
            while(loop==1){
    
            System.out.println("Conversor de horas");
            System.out.println("Que horas são?");
            int hora=sc.nextInt();
            System.out.println("E os minutos?");
            int minuto=sc.nextInt();
    
            int horaConversor=conversor(hora);
            amPm(horaConversor, minuto, hora);
            System.out.println("\nDeseja converter novamente? (1 - Sim) / (2 - Não)");
            loop=sc.nextInt();
            }

            System.out.println("Até a próxima!");
            sc.close();
        }
    
        static int conversor(int hora){
            if(hora==0){
                hora=12;
            }else if(hora>=13){
                hora=hora-12;
            }
            return hora;
        }
    
        static void amPm(int horaConvertsor, int minuto, int hora){
            if(hora>=0&&hora<12){
                System.out.println("Hora convertida: "+horaConvertsor+":"+minuto+" A.M.");
            }else{
                System.out.println("Hora convertida: "+horaConvertsor+":"+minuto+" P.M.");
            }
        }
    }
    


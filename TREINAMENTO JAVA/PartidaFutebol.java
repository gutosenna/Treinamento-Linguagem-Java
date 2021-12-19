import java.util.Scanner;

public class PartidaFutebol {
    public static void main(String[] args) {
        String time1, time2, status;
        int gols1, gols2, dif;
        Scanner input = new Scanner(System.in);

         System.out.print("Time 01 ");
         time1 = input.nextLine();
         System.out.print("Time 02 ");
         time2 = input.nextLine();
         System.out.println("--------------------");
         System.out.println(time1+ " X "+ time2);
         System.out.println("--------------------");
         System.out.print("Quantos gols do " + time1 + "? ");
         gols1 = input.nextInt();
         input.nextLine();
         System.out.print("Quantos gols do " + time2 + "? ");
         gols2 = input.nextInt();
         input.nextLine();
         dif = gols2 - gols1;
         dif = Math.abs(dif);
         if(dif >= 1 && dif < 5) {
            status = "PARTIDA NORMAL";
         }           
         else if(dif == 0) {
            status = "EMPATE";
         } else {
            status = "GOLEADA";
         }
         System.out.println("--------------------");
         System.out.println("DIFERENCA: "+ dif);
         System.out.println("STATUS: "+ status);
         System.out.println("--------------------");
         System.out.println(" ") ;
         input.close();
    }
}

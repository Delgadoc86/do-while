/*
DO/WHILE

[1|2|3|4|5|6]
VAR CONTADOR = 0
 MIENTRAS (CONTADOR > 0)
   RESTAR UNO AL CONTADOR

    Mientras (contador sea mayor que 10)
        resta uno al contador

 SIGO POR AQUI

 */
public class Main {
    public static void main(String[] args) {
        int contador = 10;
        while (contador >= 3) {
            System.out.println(contador);
            contador--;  //o usar contador = contador - 1; puede usarse para sumar contador++;
        }
        /*
        Var contador = 10
      Haz
         resta uno al contador
       mientras (contador sea mayor que 10)

         */
    }
}
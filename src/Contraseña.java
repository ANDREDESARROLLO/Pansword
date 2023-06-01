/*
Escribe un programa Java que pida al usuario que introduzca una password numérica,
de valor comprendido entre 0 y 999 (no es necesario comprobar que el valor introducido
por el usuario está en dicho rango, se supone que el usuario lo hace bien).

El programa tiene almacenado el valor de la password correcta en una variable llamada key (hardcodeada).

El objetivo del usuario es introducir la password correcta, en cuyo caso el programa debe imprimir el mensaje: “acceso autorizado”.

El usuario tiene un máximo de 3 intentos para introducir la password correcta.
Si el usuario falla en sus tres intentos,
 el programa presentará el mensaje de: “Ha excedido el número de intentos permitidos” y acaba el programa.

El máximo número de intentos permitidos lo guardamos en una variable tipo int, con su valor hardcodeado (=3).

Puedes usar las variables adicionales que estimes oportunas.
 */
import java.util.Scanner;
public class Contraseña {
    public static  void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int Pansoword_correcta = 142;
        int numero_intentos = 3;

        while (numero_intentos > 0){
            System.out.println("Ingresa tu contraseña");
            int Pansword_Unsuario = scanner.nextInt();

            if(Pansword_Unsuario == Pansoword_correcta){
                System.out.println("Contraseña correcta");
                break;
            }else {
                numero_intentos -- ;
                System.out.println("contraseña incorrecta , digitela de nuevo");
            }

        } if( numero_intentos == 0){
            System.out.println("Numero de intentos" + " " +  numero_intentos  + " "  + "se acabaron");
        }

        System.out.println("fin del programa");
    }
}

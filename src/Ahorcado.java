import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // ARREGLOS
        //Es un array de chars
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // ESTRUCTURA DE CONTROL INTERACTIVA (BUCLE)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            
        }
        // ESTRUCTURA DE CONTROL: INTERACTIVA(WHILE)

        while (!palabraAdivinada && intentos < intentosMaximos) {
            // STRING.VALUEOF es de las letras adivinadas[] 
            //esto se usa cuando tenemos una palabra de chars
            System.out.println("palabra a adivinar " + String.valueOf(letrasAdivinadas)+"("+palabraSecreta.length()+"letras) ");//aca se forma el string

            System.out.print("introduce una letra, porfavor: ");

            char letra =  Character.toLowerCase(scanner.next().charAt(0));
            

            boolean letraCorrecta = false;
            // ESTRUCTURA DE CONTROL: INTERACTIVA(BUCLE)
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                // ESTRUCTURA DE CONTROL CONDICIONAL
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("INCORRECTO te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {

                palabraAdivinada = true;
                System.out.println("FELICIDADES has adivinado la palabra secreta :" + palabraSecreta);
            }

        }
        if (!palabraAdivinada) {
            System.out.println("PERDISTE no hay mas intentos asi como fue con ella :'(");
        }
        scanner.close();
    }
}

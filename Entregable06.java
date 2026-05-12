import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class Entregable06 { // Declaramos la clase principal del programa

    public static void main(String[] args) { // Método principal donde se ejecuta el programa

        Scanner t = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario

        System.out.println("REGISTRO DE NOTAS"); // Imprimimos un mensaje de bienvenida
        System.out.println("=====================");

        System.out.print("Cantidad de cursos: "); // Solicitamos al usuario la cantidad de cursos
        int cantidadCursos = t.nextInt(); // Leemos la cantidad de cursos ingresada por el usuario

        System.out.print("Cantidad de notas por curso: "); // Solicitamos al usuario la cantidad de notas por curso
        int cantidadNotas = t.nextInt(); // Leemos la cantidad de notas por curso ingresada por el usuario

        String[] cursos = new String[cantidadCursos]; // Creamos un arreglo de cadenas para almacenar los nombres de los cursos
        int[][] notas = new int[cantidadCursos][cantidadNotas]; // Creamos una matriz de enteros para almacenar las notas de cada curso

        for (int i = 0; i < cantidadCursos; i++) { // Iteramos sobre la cantidad de cursos
            System.out.print("\nIngrese curso: "); // Solicitamos al usuario que ingrese el nombre del curso
            cursos[i] = t.next(); // Leemos el nombre del curso ingresado por el usuario y lo almacenamos en el arreglo
            for (int j = 0; j < cantidadNotas; j++) { // Iteramos sobre la cantidad de notas por curso
                    System.out.print("Nota " + (j + 1) + ": "); // Solicitamos al usuario que ingrese cada nota para el curso actual
                    notas[i][j] = t.nextInt(); // Leemos la nota ingresada por el usuario y la almacenamos en la matriz de notas
            }
        }

        t.close(); // Cerramos el objeto Scanner para liberar recursos

        double promedio = 0; // Declaramos una variable para almacenar el promedio de las notas
        String estado; // Declaramos una variable para almacenar el estado del curso 

        System.out.println("\nLista de cursos:"); // Imprimimos un mensaje para mostrar la lista de cursos
        System.out.println("=====================================");

        for (int i = 0; i < cantidadCursos; i++) { // Iteramos sobre la cantidad de cursos para calcular el promedio y mostrar los resultados
            System.out.print(cursos[i] + " - "); // Imprimimos el nombre del curso actual
            for (int j = 0; j < cantidadNotas; j++) { // Iteramos sobre la cantidad de notas por curso para calcular el promedio y mostrar las notas
                promedio += notas[i][j]; // Sumamos cada nota del curso actual al promedio
                System.out.print(notas[i][j] + " - "); // Imprimimos cada nota del curso actual seguida de un guion
            }
            promedio /= cantidadNotas; // Calculamos el promedio dividiendo la suma total de las notas por la cantidad de notas
            if (promedio >= 11) { // Verificamos si el promedio es mayor o igual a 11 para determinar el estado del curso
                estado = "APROBADO"; // Si el promedio es mayor o igual a 11, el estado es "APROBADO"
            } else {
                estado = "DESAPROBADO"; // Si el promedio es menor a 11, el estado es "DESAPROBADO"
            }
            System.out.print("PROMEDIO: " + promedio + " - " + estado + "\n"); // Imprimimos el promedio y el estado del curso actual
            promedio = 0; // Reiniciamos la variable promedio para el siguiente curso
        }
    }
}
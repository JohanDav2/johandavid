//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public static void main(String[] args) {
        ArrayList<Incidencia> listaIncidencias = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int numIncidencias = 0;

        while(true) {
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("|              MENU PRINCIPAL              |");
            System.out.println("--------------------------------------------");
            System.out.println("| 1 |        Nueva incidencia              |");
            System.out.println("| 2 |        Ver incidencias               |");
            System.out.println("| 3 |        Resolver incidencia           |");
            System.out.println("| 4 |        Salir                         |");
            System.out.println("--------------------------------------------");

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el número de puesto: ");
                    int numPuesto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Introduce la descripción de la incidencia: ");
                    String descripcion = scanner.nextLine();
                    Incidencia nuevaIncidencia = new Incidencia(numIncidencias + 1, numPuesto, descripcion);
                    listaIncidencias.add(nuevaIncidencia);
                    ++numIncidencias;
                    System.out.println("INCIDENCIA AÑADIDA EXITOSAMENTE");
                    break;
                case 2:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("                                 LISTADO DE INCIDENCIAS                                    ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("|   Código    ||     Puesto      ||       Descripción      ||       Estado       |");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    for (int i = 0; i < listaIncidencias.size(); i++) {
                        Incidencia incidencia = listaIncidencias.get(i);
                        System.out.println("|      " + incidencia.getCodigo() + "      ||       " + incidencia.getNumPuesto() + "       ||       " + incidencia.getDescripcion() + "       ||       " + incidencia.getEstado() + "    |");

                    }
                    break;
                case 3:
                    System.out.print("Introduce el número de la incidencia a resolver: ");
                    int Numero_incidencia = scanner.nextInt();
                    if (Numero_incidencia < 1 || Numero_incidencia > listaIncidencias.size()) {
                        System.out.println("Error: número de incidencia no válido.");
                    } else {
                        scanner.nextLine();
                        System.out.print("Introduce una descripcion de como se le ha dado solucion a la incidencia: ");
                        String solucion = scanner.nextLine();
                        listaIncidencias.get(Numero_incidencia-1).resolver(solucion);
                        System.out.println("Incidencia resuelta correctamente.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del menú");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: opción no válida.");
            }
        }
    }
}


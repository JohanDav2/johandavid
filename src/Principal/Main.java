package Principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println(".........MENU...........");
            System.out.println("1. Crear incidencia");
            System.out.println("2. Ver incidencias");
            System.out.println("3. Resolver incidencias");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        int puest;
                        String descripcion;
                        Scanner teclado = new Scanner(System.in);
                        List<Incidencia> incidencias = new ArrayList<>();
                        int codigo = 1;
                        System.out.println("Escribe tu puesto de trabajo:");
                        puest = teclado.nextInt();
                        System.out.println("Escirbe la descripcion de tu incidencia");
                        descripcion = teclado.next();

                        Incidencia inc1 = new Incidencia(codigo++);
                        inc1.setDescripcion(""+ descripcion);
                        inc1.setPuesto(puest);
                        inc1.getDescripcion();
                        Incidencia inc2 = new Incidencia(codigo++);
                        inc2.setDescripcion(""+ descripcion);
                        inc2.setPuesto(puest);
                        Incidencia inc3 = new Incidencia(codigo++);
                        inc3.setDescripcion(""+ descripcion);
                        inc3.setPuesto(puest);
                        incidencias.add(inc1);
                        incidencias.add(inc2);
                        incidencias.add(inc3);
                        System.out.println(incidencias);

                        for (Incidencia incidencia : incidencias) {
                            System.out.println("Código: " + incidencia.getCodigo());
                            System.out.println("Número de puesto: " + incidencia.getPuesto());
                            System.out.println("Estado: " + incidencia.getEstado());
                            System.out.println("Descripcion: " + incidencia.getDescripcion());
                            if (incidencia.getEstado().equals("resuelta")) {
                                System.out.println("Descripcion: " + incidencia.getDescripcion());
                            }
                            System.out.println();
                        }
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }


    }
}
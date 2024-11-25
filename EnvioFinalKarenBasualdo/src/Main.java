import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Arma> registroArmas = new ArrayList<>();
        ArrayList<Policia> registroPolicias = new ArrayList<>();

        System.out.println("=== Sistema de Gestión Policial ===");

        // Menú principal
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar policía");
            System.out.println("2. Registrar arma");
            System.out.println("3. Mostrar policías registrados");
            System.out.println("4. Mostrar armas registradas");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpieza de lo que se escribió

            switch (opcion) {
                case 1:
                    // Registro de policía
                    System.out.println("Ingrese el nombre del policía:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del policía:");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el legajo del policía:");
                    int legajo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar
                    System.out.println("Ingrese el rango del policía:");
                    String rango = scanner.nextLine();
                    registroPolicias.add(new Policia(nombre, apellido, legajo, rango));
                    System.out.println("¡Policía registrado con éxito!");
                    break;

                case 2:
                    System.out.println("Seleccione el tipo de arma:");
                    System.out.println("1. Arma Corta");
                    System.out.println("2. Arma Larga");

                    int tipoArma = scanner.nextInt();
                    scanner.nextLine(); // Limpiar

                    if (registroPolicias.isEmpty()) {
                        System.out.println("No hay policías registrados. Registre al menos un policía primero.");
                        break;
                    }

                    Policia policiaAsignada = registroPolicias.get(0); // Asignar policía registrado

                    if (tipoArma == 2) {
                        System.out.println("Ingrese el número de serie:");
                        String numeroSerie = scanner.nextLine();

                        System.out.println("¿Tiene sello del RENAR? (true/false):");
                        boolean tieneSello = scanner.nextBoolean();
                        scanner.nextLine(); // Limpiar

                        // Bucle para seleccionar la descripción del uso del arma
                        String descripcionUso = "";
                        boolean descripcionValida = false;
                        while (!descripcionValida) {
                            System.out.println("Seleccione una descripción para justificar el uso del arma larga:");
                            System.out.println("1. Control de disturbios");
                            System.out.println("2. Operaciones tácticas");
                            System.out.println("3. Defensa perimetral");
                            System.out.println("4. Operaciones rurales");
                            System.out.println("5. Entrenamiento avanzado");
                            System.out.println("6. Intervenciones de alto riesgo");

                            int opcionDescripcion = scanner.nextInt();
                            scanner.nextLine(); // Limpiar

                            switch (opcionDescripcion) {
                                case 1:
                                    descripcionUso = "Control de disturbios";
                                    descripcionValida = true;
                                    break;
                                case 2:
                                    descripcionUso = "Operaciones tácticas";
                                    descripcionValida = true;
                                    break;
                                case 3:
                                    descripcionUso = "Defensa perimetral";
                                    descripcionValida = true;
                                    break;
                                case 4:
                                    descripcionUso = "Operaciones rurales";
                                    descripcionValida = true;
                                    break;
                                case 5:
                                    descripcionUso = "Entrenamiento avanzado";
                                    descripcionValida = true;
                                    break;
                                case 6:
                                    descripcionUso = "Intervenciones de alto riesgo";
                                    descripcionValida = true;
                                    break;
                                default:
                                    System.out.println("Opción inválida. Por favor seleccione una opción válida.");
                                    break;
                            }
                        }

                        System.out.println("Ingrese el nivel del arma (1 a 5):");
                        int nivel = scanner.nextInt();
                        scanner.nextLine(); // Limpiar

                        // Bucle para seleccionar el estado del arma
                        String estado = "";
                        boolean estadoValido = false;
                        while (!estadoValido) {
                            System.out.println("Seleccione el estado del arma:");
                            System.out.println("1. NUEVA");
                            System.out.println("2. EN MANTENIMIENTO");
                            System.out.println("3. EN USO");

                            int estadoSeleccionado = scanner.nextInt();
                            scanner.nextLine(); // Limpiar

                            switch (estadoSeleccionado) {
                                case 1:
                                    estado = "NUEVA";
                                    estadoValido = true;
                                    break;
                                case 2:
                                    estado = "EN MANTENIMIENTO";
                                    estadoValido = true;
                                    break;
                                case 3:
                                    estado = "EN USO";
                                    estadoValido = true;
                                    break;
                                default:
                                    System.out.println("Opción inválida. Por favor seleccione un estado válido.");
                                    break;
                            }
                        }

                    }
                    break;



                case 3:
                    // Mostrar policías registrados
                    System.out.println("\n=== Policías Registrados ===");
                    for (Policia policia : registroPolicias) {
                        System.out.println(policia);
                    }
                    break;

                case 4:
                    // Mostrar armas registradas
                    System.out.println("\n=== Armas Registradas ===");
                    for (Arma arma : registroArmas) {
                        System.out.println(arma);
                    }
                    break;

                case 5:
                    // Salir
                    continuar = false;
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

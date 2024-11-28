package proyectoprogramacion;

import javax.swing.JOptionPane;

public class ProyectoProgramacion {

    public static void main(String[] args) {
        boolean ciclo = true;
        int opcion = 0;
        int opcionGym = 0;
        int cantidadAsientos = 0;
        Cine cine1 = new Cine();
        Entrenador trainer1 = new Entrenador();
        int menu=0;

        //Crear array de entrenadores
        while (ciclo) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Hola!! \n" + "Que desea hacer\n"
                    + "1.Salas Cine\n" + "2.Gimnasio\n" + "3.Sala de Yoga\n" + "4.Sala Baile\n" + "5.Barista\n" + "6.Salir"));
            switch (opcion) {
                case 1:
                    //Entrada Clase Cine

                    //Cantidad de espacios para el cine
                    cantidadAsientos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos son?"));
                    if (cine1.cantidadAsientos(cantidadAsientos) == -1) {
                        JOptionPane.showMessageDialog(null, "La cantidad de asientos no es valida");

                    } else {
                        JOptionPane.showMessageDialog(null, "Los asientos serian: " + cine1.getAsientos());
                    }
                    break;
                case 2:

                    //Entrada Clase Gimnasio
                    //Llamamos el metodo para asignar un entrenador
                    opcionGym = Integer.parseInt(JOptionPane.showInputDialog("Eliga una de la siguientes opcioines\n"
                            + "1.Asignar un entrenador a un trabajador\n" + " 2.Añadir a un entrenador\n" + " 3.Ver entrenadores disponibles\n"));
                    switch (opcionGym) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Hola, desea asignar un entrenador");
                            break;

                        //Añadir un entrenador
                        case 2:
                            //Cantidad de entrenadores a crear
                            trainer1.entrenadorCantidad(Integer.parseInt(JOptionPane.showInputDialog("Cualtos entrenadores va a agregar")));
                            trainer1.fillTrainerList();

                            //Recorrido para llenar la lista creada en la clase
                            break;
                        //Mostrar entrenadores disponibles
                        case 3:
                            JOptionPane.showMessageDialog(null, trainer1.showTrainerList());

                            break;
                    }
                    break;

                case 3:
                    //Sala Yoga
                    break;
                case 4:
                    //Sala Baile
                    break;
                case 5:
                    //Barista
                  //pedido de bebida

                    menu = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere pedir una bebida? \n 1.Sí 2.No"));
                    if (menu == 1) {
                        menu = Integer.parseInt(JOptionPane.showInputDialog("Sus opciones son: \n 1. Cafe normal \n 2. Capuchino \n 3. Capuchino Vainilla \n 4. Chocolate \n 5. Mokachino \n 6. Te chai \n 7.Cafe frio"));

                        Barista.drinkAssignment(menu, Barista.bebida, Barista.condi);
                    }
                    break;
                case 6:
                    ciclo = false;
                    break;
                case 7:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "La opción no es válida\nInténtelo de nuevo");
                    break;

            }

        }

        //Usuarios
        Trabajador user1 = new Trabajador(34, "Francisco", "Marketing", "1");
        Trabajador user2 = new Trabajador(40, "Mariana", "Comercio", "2");
        Trabajador user3 = new Trabajador(24, "Felix", "Profesor de Baile", "3");
        Trabajador user4 = new Trabajador(27, "Matthew", "Entrenador personal", "4");
        Trabajador user5 = new Trabajador(50, "Francisca", "Directora ejecutiva", "5");
        Trabajador user6 = new Trabajador(20, "Lucrecia", "Recepcionista", "6");
        Trabajador user7 = new Trabajador(52, "Max", "Barista", "7");
        Trabajador user8 = new Trabajador(22, "Armando", "Contador", "8");
        Trabajador user9 = new Trabajador(18, "Julieta", "Secretaria", "9");
        Trabajador user10 = new Trabajador(35, "Marco", "Supervisor 1", "10");
        Trabajador user11 = new Trabajador(56, "Carlos", "Supervisor 2", "11");
        Trabajador user12 = new Trabajador(19, "Daniel", "Ingeniero en Sistemas", "12");

        JOptionPane.showMessageDialog(null, "edad : " + user3.getEdad());
        JOptionPane.showMessageDialog(null, "name : " + user3.getNom());
        JOptionPane.showMessageDialog(null, "Puesto de trabajo : " + user3.getPuesto());
        JOptionPane.showMessageDialog(null, "ID: " + user3.getID());

    }

}

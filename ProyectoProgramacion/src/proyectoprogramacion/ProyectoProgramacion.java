package proyectoprogramacion;

import javax.swing.JOptionPane;

public class ProyectoProgramacion {

    public static void main(String[] args) {
        boolean ciclo = true;
        int opcion = 0;
        int cantidadAsientos=0;
        Cine cine1 = new Cine();

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
                    JOptionPane.showMessageDialog(null, "Hola desea asignar un entrenador");

                    //Añadir un entrenador
                    JOptionPane.showMessageDialog(null, "Desea crear un nuevo entrenador?");

                    //Mostrar entrenadores disponibles
                    JOptionPane.showMessageDialog(null, "Desea ver lo entrenadores dispinibles");
                    break;

                case 3:
                    //Sala Yoga
                    break;
                case 4:
                    //Sala Yoga
                    break;
                case 5:
                    //Barista
                    Barista.condi = Integer.parseInt(JOptionPane.showInputDialog("Desea añadir una bebida \n 1. Sí 2. No"));
                    if (Barista.condi == 1) {
                        switch (Barista.condi) {
                            case 1:
                                Barista.count = Barista.count + 1;
                                Barista.bebida = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                            Estas son sus opciones
                                                                             1. cafe normal
                                                                             2.Capuchino 
                                                                            3. Capuchino Vainilla 
                                                                            4.Chocolate 
                                                                            5. Mokachino 
                                                                            6.Te_chai  
                                                                             7.Cafe frio"""));
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "Puede agregar una bebida en otro momento");

                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Ingreso un dato invalido");
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya ingreso una bebida anteriormente");
                    }
                    JOptionPane.showMessageDialog(null, "Su bebida es:" + Barista.menu);
                    break;
                    break;
                case 6:
                    ciclo = false;
                    break;
                case 7:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida\nIntentelo otra vez");
                    break;

            }

        }

        Trabajador user1 = new Trabajador(34, "Francisco", "Marketing", "1");
        Trabajador user2 = new Trabajador(40, "Mariana", "Comercio", "2");
        Trabajador user3 = new Trabajador(24, "Felix", "Profesor de Baile", "3");
        Trabajador user4 = new Trabajador(27, "Matthew", "Entrenador personal", "4");
        Trabajador user5 = new Trabajador(50, "Francisca", "Directora ejecutiva", "5");

        JOptionPane.showMessageDialog(null, "edad : " + user3.getEdad());
        JOptionPane.showMessageDialog(null, "name : " + user3.getNom());
        JOptionPane.showMessageDialog(null, "Puesto de trabajo : " + user3.getPuesto());
        JOptionPane.showMessageDialog(null, "ID: " + user3.getID());

    }

}

package proyectoprogramacion;

import javax.swing.JOptionPane;

public class Entrenador {
    
    private String trainerList[];
    private String nameTrainer;
    private boolean available;
    
    public String getNameTrainer() {
        return nameTrainer;
    }
    
    public void setNameTrainer(String nameTrainer) {
        if (nameTrainer.equals(null)) {
            this.nameTrainer = "No tiene un nombre";
        } else {
            this.nameTrainer = nameTrainer;
        }
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }

    //Estos 3 metodos usados para rellenar la lista
    public void entrenadorCantidad(int cantidadEntrenadores) {
        this.trainerList = new String[cantidadEntrenadores];
    }

    //Podriamos buscar manera de hacer ciclo para que no solicite cantidad inicial???
    public void fillTrainerList() {
        for (int j = 0; j < trainerList.length; j++) {
            trainerList[j] = JOptionPane.showInputDialog("Cual es el nombre del entrenador");
            
        }
    }
    
    public String showTrainerList() {
        String mensaje = "";
        for (int i = 0; i < this.trainerList.length; i++) {
            mensaje += this.trainerList[i] + "\n";
            
        }
        
        return mensaje;
    }
}

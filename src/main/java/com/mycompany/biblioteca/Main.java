package com.mycompany.biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    Client client = new Client();

    public static void main(String[] args) {
        int op;
        try {
            op = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL: NOTAS\n\n"
                    + "1. Crear Cliente \n"
                    + "2. Buscar Cliente/s \n"
                    + "3. Actualizar Cliente \n"
                    + "4. Eliminar Cliente \n"
                    + "5. Salir \n"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR: Formato NO Valido");
        }
        // Aquí irá el menú (Fase 8) 
    }

    public void createClient(){
        try {
            client.setID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Cliente: ")));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Requiere Formato NUMERICO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        client.setName(JOptionPane.showInputDialog(null, "Ingrese el nombre del Cliente: "));
        
        try {
            client.setPhoneNumber(Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de telefono del Cliente: ")));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Requiere Formato NUMERICO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        client.setEmail(JOptionPane.showInputDialog("Ingrese el email del Cliente: "));
        clients.add(client);
    }
}

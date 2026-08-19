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
        long ID;
        try {
            ID = Long.parseLong(JOptionPane.showInputDialog("Ingrese el ID del Cliente: "));
            if(searchID(ID) != null){
                JOptionPane.showMessageDialog(null, "ID ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                client.setID(ID);
                client.setName(JOptionPane.showInputDialog(null, "Ingrese el nombre del Cliente: "));
                client.setPhoneNumber(Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de telefono del Cliente: ")));
                client.setEmail(JOptionPane.showInputDialog("Ingrese el email del Cliente: "));
                clients.add(client);
                JOptionPane.showMessageDialog(null, "Cliente Creado con Exito");
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Requiere Formato NUMERICO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }  
        
    }
    
    public Client searchID(long ID){
        for (Client cl1 : clients){
            if (cl1.getID() == ID){
                return cl1;
            }
        }
        return null;
    }

    public void readClient(){
        long ID;
        Client cl1 = null;
        try {
            ID = Long.parseLong(JOptionPane.showInputDialog("Ingrese el ID del Cliente: "));
            cl1 = searchID(ID);
            if (cl1 != null){
                JOptionPane.showMessageDialog(null, "DATOS DEL CLIENTE CON ID " + ID + "\n"
                + "Nombre: " + cl1.getName() + "\n"
                + "ID: " + cl1.getID() + "\n"
                + "Telefono: " + cl1.getPhoneNumber() + "\n"
                + "Email: " + cl1.getEmail());
            }else{
                JOptionPane.showMessageDialog(null, "No existe cliente registrado con ese ID");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Requiere Formato NUMERICO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void updateClient(){
        long ID;
        Client cl1 = null;
        //cl1 viene siendo Client1, una instancia de tipo Client
        
        String name, email;
        long phoneNumber;
        try {
            ID = Long.parseLong(JOptionPane.showInputDialog("Ingrese el ID del Cliente a Modificar: "));
            cl1 = searchID(ID);
            if (cl1 != null){
                name = JOptionPane.showInputDialog(null, "ACTUALIZACION DE CLIENTE \nn"
                + "Nombre Actualizado: " );
                phoneNumber = Long.parseLong(JOptionPane.showInputDialog(null, "ACTUALIZACION DE CLIENTE \nn"
                + "Numero de Telefono Actualizado: " ));
                email = name = JOptionPane.showInputDialog(null, "ACTUALIZACION DE CLIENTE \nn"
                + "Email Actualizado: " );
                cl1.setName(name);
                cl1.setPhoneNumber(phoneNumber);
                cl1.setEmail(email);
                JOptionPane.showMessageDialog(null, "Cliente Actualizado con Exito");
            }else{
                JOptionPane.showMessageDialog(null, "No existe cliente registrado con ese ID");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Requiere Formato NUMERICO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void deleteClient(){
        long ID;
        Client cl1 = null;
        try {
            ID = Long.parseLong(JOptionPane.showInputDialog("Ingrese el ID del Cliente: "));
            cl1 = searchID(ID);
            if (cl1 != null){
                clients.remove(cl1);
                JOptionPane.showMessageDialog(null, "Cliente eliminado con Exito");
            }else{
                JOptionPane.showMessageDialog(null, "No existe cliente registrado con ese ID");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Requiere Formato NUMERICO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
      
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcproyect;

/**
 *
 * @author USER
 */
public class MVCjava {
    public static void main(String[] args) {
        // Crear instancia del modelo
        Modelo modelo = new Modelo();

        // Crear instancia de la vista
        FrmVista vista = new FrmVista();

        // Crear instancia del controlador
        Controlador controlador = new Controlador(vista, modelo);

        // Mostrar la vista
        vista.setVisible(true);

        // Configurar el botón para que use el controlador
        vista.getBcalcular().addActionListener(e -> controlador.realizarOperacion());
    }
    
}

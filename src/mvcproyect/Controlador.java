
package mvcproyect;


public class Controlador{ 
    //Controlador es una clase compuesta    
    private Modelo model;
    private FrmVista view;
    
    public Controlador(FrmVista view, Modelo model){
        this.view = view;
        this.model = model; 
    }
    
    public void realizarOperacion(){
        int num1 = view.getNumero1();
        int num2 = view.getNumero2();
        view.setResultado(model.multiplicar(num1, num2));
    }
    
    
   
    
}

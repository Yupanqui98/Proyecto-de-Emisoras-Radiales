
public class Sintonizar {
    private double frecuencia;

    public Sintonizar(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    
    public void subir(){
        frecuencia= frecuencia + 0.5;
    }
    
    public void bajar(){
        frecuencia = frecuencia - 0.5;
    }
    
    public void mostrar(){
        System.out.println("La frecuencia actual es " + frecuencia);
    }
    
    public void manejo(){
        if(frecuencia <80){
            frecuencia=180;
        } else if(frecuencia>180){
            frecuencia=80;
        }
    }
    
    
}

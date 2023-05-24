package practicaindividual;

/** @author Iza Duartes*/
public class Evaluaciones {

    private int a;
    private int b;
    private int c;
    private boolean d;

    public Evaluaciones() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }
    
    public String retornCadena(int x, int y){
      
        if (x==y){
            return "Iguales";
        } else {
            return "Diferentes";
        }
    }
    
    public void muestraatributo (int a, int b, int c){
                
        System.out.println("El resultado es: " +(a*5)+(b/2)+(c^0));
    
    }
   
}

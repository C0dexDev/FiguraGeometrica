public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) throws IllegalArgumentException{
        if(radio < 0){
            throw new IllegalArgumentException("El radio debe ser positivo.");
        }
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * (Math.pow(radio, 2));
    }

    public String getName(){
        return "Circulo";
    }
}

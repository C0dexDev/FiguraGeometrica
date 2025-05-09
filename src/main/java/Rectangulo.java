public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) throws IllegalArgumentException{
        if(base < 0 || altura < 0){
            throw new IllegalArgumentException("La base y la altura deben ser positivos.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base*altura;
    }

    public String getName(){
        return "Rectangulo";
    }
}

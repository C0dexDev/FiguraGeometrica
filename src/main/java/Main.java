import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<FiguraGeometrica> list = new ArrayList<>();
        FiguraGeometrica circulo;
        FiguraGeometrica rectangulo;
        try{
            circulo = new Circulo(2);
            rectangulo = new Rectangulo(2, 2);
            rectanguloMal = new Rectangulo(-2, 2);
        }catch(IllegalArgumentException e){
            throw new Exception("Alguna de las figuras es inválida. ERROR: \n"+e);
        }
        list.add(rectangulo);
        list.add(circulo);
        for(FiguraGeometrica f : list){
            System.out.println(f.getName()+": "+f.calcularArea());
        }
    }
}

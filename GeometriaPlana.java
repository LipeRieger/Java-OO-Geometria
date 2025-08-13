public class GeometriaPlana extends Geometria {

    public double areaCirculo(double raio) {
        return pi * (raio * raio);
    }
    public double perimetroCirculo(double raio){
        return  2 * pi * raio;
    }
    public double areaRetangulo(double base, double altura){
        return base * altura;
    }
    public double perimetroRetangulo(double base, double altura){
        return  2 * (base + altura);
    }  
}


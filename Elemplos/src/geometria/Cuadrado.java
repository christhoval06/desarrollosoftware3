public class Cuadrado implements Geometria{
    
    int lado, area, perimetro;
   public void calcularArea(){
        area = lado * lado;
    }
    
    public void calcularPerimetro(){
        perimetro = lado * 4;
    }
    
    
    public int getArea(){
        return area;
    }
    
    public int getPerimetro(){
        return perimetro;
    }
    
    public void setLado( int l){
        lado =l;
    }
    

}
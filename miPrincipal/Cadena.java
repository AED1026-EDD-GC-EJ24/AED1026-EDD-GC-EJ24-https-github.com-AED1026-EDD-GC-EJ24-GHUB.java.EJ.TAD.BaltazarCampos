package miPrincipal;
public class Cadena {
    private char cadena[]=new char[80];
    private int size;
    private final int LIMIT=80;
    public Cadena(){
        size=0;
    }
    public Cadena(char[] cadena){
        this.cadena=cadena;
    }
    public void agregarFinal(char c) throws PositionIlegalException{
        if(size>=LIMIT){throw new PositionIlegalException();}
        boolean esLetraMinuscula=(c>='a'&&c<='z');
        boolean esLetraMayuscula=(c>='A'&&c<='Z');
        boolean esDigito=(c>='0'&&c<='9');
        if(!(esLetraMinuscula||esLetraMayuscula||esDigito)){ throw new PositionIlegalException();}
        cadena[size++]=c;
    }
    public void borrarInicio(){
        for(int i=0;i<=size;i++){
            cadena[i]=cadena[i+1];
        }
        cadena[size]=' ';
        size--;
    }
    public boolean empty(){
        return (size==0);
    }
    public boolean full(){
        return (LIMIT==0);
    }
    public Cadena invertir() throws PositionIlegalException{
        Cadena invertida=new Cadena();
        for(int i=size-1;i>=0;i--){
            invertida.agregarFinal(cadena[i]);
        }
        return invertida;
    }
    @Override
    public String toString() {
        String cadenita="";
        for(int i=0;i<=size;i++){
            cadenita=cadenita+cadena[i];
        }
        return cadenita;
    }
}
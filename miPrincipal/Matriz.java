package miPrincipal;
public class Matriz {
    private int n,m;
    private int matriz[][];
    
    public Matriz(){
        matriz = new int[10][10];
        n=10;
        m=10;
    }
    public Matriz(int n, int m) throws PositionIlegalException{
        if (n<0||m<0) {
            throw new PositionIlegalException();
        }
        matriz=new int[n][m];
        this.n=n;
        this.m=m;
    }
    
    public int[][] getMatriz(){
        return matriz;
    }
    public void asignarMatriz(int r, int c, int valor) throws PositionIlegalException{
        if(r>=n||c>=m||r<0||c<0){throw new PositionIlegalException();}
        matriz[r][c]=valor;
    }
    public int infoMat(int r, int c)throws PositionIlegalException{
        if(r>=n||c>=m||r<0||m<0){throw new PositionIlegalException();}
        return matriz[r][c];
    }
    public int filasMat(){
        return n;
    }
    public int columnasMat(){
        return m;
    }

}
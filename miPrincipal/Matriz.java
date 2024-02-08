package miPrincipal;
public class Matriz {

    private int n,m;
    private int matriz[][];

    public Matriz(){
        Matriz = new int [10][10];
        n = 10;
        m = 10;
    }

    public Matriz(int n, int m) throws Posicionilegalexeption {
        if(n<0 || m<0){
            throws new Posicionilegalexeption();
        }
        matriz = new int[n][m];
        this.n=n;
        this.m=m;
    }

    public int[][] getMatriz(){
        return matriz;
    }

    public void asignarMatriz(int r, int c, int valor) throws Posicionilegalexeption {
        if(r>=n || c>=m || r<0 || c<0) {
            throw new PosicionIlegalException();
        }
        matriz[r][c] = valor;
    }

    public int infoMat(int r, int c){
        if(r>=n || c>=m || r<0 || m<0){
            throw new PosicionIlegalException();
        }
        return matriz[r][c];
    }

    public int filasMat(){
        return n;
    }

    public int columnasMat(){
        return m;
    }

}
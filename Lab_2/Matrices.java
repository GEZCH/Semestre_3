//https://github.com/e-smp
public class Matrices {

   public void funcion1() {
        System.out.println("-DIAGONAL PRINCIPAL-"); 
        int matriz1[][]={{1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};
        for (int i = 0; i < matriz1.length; i++) { 
            for(int j = 0; j < matriz1[0].length; j++) { 
                System.out.print(matriz1[i][j]); 
            }
            System.out.println();
        }   
    }
    public void funcion2() {
        System.out.println("-TRIANGULAR INFERIOR IZQUIERDA-");
        int matriz2[][]={{0,0,0,0}, {1,0,0,0}, {1,1,0,0}, {1,1,1,0}};
        for (int i = 0; i < matriz2.length; i++) { 
            for(int j = 0; j < matriz2[0].length; j++) { 
                System.out.print(matriz2[i][j]); 
            }
            System.out.println();
        }
    }
        public void funcion3() {
            System.out.println("-TRIANGULAR SUPERIOR DERECHA-"); 
            int matriz3[][]={{0,1,1,1}, {0,0,1,1}, {0,0,0,1}, {0,0,0,0}};
            for (int i = 0; i < matriz3.length; i++) { 
                for(int j = 0; j < matriz3[0].length; j++) { 
                    System.out.print(matriz3[i][j]); 
                }
                System.out.println();
            }
        }
}


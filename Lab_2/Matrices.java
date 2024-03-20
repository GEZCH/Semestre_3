//https://github.com/e-smp
public class Matrices {
    int f;
    int c;
    int matriz1[][]={{1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};
    int matriz2[][]={{0,0,0,0}, {1,0,0,0}, {1,1,0,0}, {1,1,1,0}};
    int matriz3[][]={{0,1,1,1}, {0,0,1,1}, {0,0,0,1}, {0,0,0,0}};
   public void diag() {
        for (f = 0; f < 4; f++) { 
            for( c = 0; c < 4; c++) { 
                if (f == c){
                    System.out.print(matriz1[f][c]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }   
    }
    public void tii() {
        for ( f = 0; f < 4; f++) { 
            for(c = 0; c < 4; c++) { 
                if (f > c){
                    System.out.print(matriz2[f][c] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
        public void tsd() {
            for (f = 0; f < 4; f++) { 
                for( c = 0; c < 4; c++) { 
                    if (f < c){
                        System.out.print(matriz3[f][c]+ " "); 
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
}


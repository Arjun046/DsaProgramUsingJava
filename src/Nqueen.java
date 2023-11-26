public class Nqueen {
    static int N=4;

    static int [] ld=new int[30];
    static int [] rd=new int[30];
    static int [] cl=new int[30];
    static void nqueen(int[][] board){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)

            System.out.printf("%d",board[i][j]);
            System.out.println("\n");
        }
    }
    static boolean isSafe(int board[][],int col){
        if(col>=N)//col=0 ,N=4 0>=4 false
            return true;
        for(int i=0;i<N;i++){
            if((ld[i-col+N-1]!=1 && rd[i+col]!=1 && cl[i]!=1)){//ld(0-0+4)!=1 && rd(0+0)!=1 && cl(0)!=1
                board[i][col]=1; //1 0 0 0
                ld[i-col+N-1]=rd[i+col]=cl[i]=1;//ld[0-0+4-1]=rd[0+0]=cl[0]=1 false
                if(isSafe(board,col+1))
                    return true;
                board[i][col]=0;
                ld[i-col+N-1]=rd[i+col]=cl[i]=0;
            }
        }
        return false;
    }
    static boolean solve(){
        int board[][]={{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}};
        if(isSafe(board,0)==false){
            System.out.printf("solution not exist");
            return false;
        }
        nqueen(board);
        return true;
    }
    public static void main(String[] args) {
        solve();
    }
}

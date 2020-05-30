import java.io.IOException;
import java.util.Scanner;

class uva352 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        long imgcnt=0;
        while (sc.hasNextInt()) {
            int d =  sc.nextInt();
            boolean[][] img = new boolean[d][d];
            boolean[][] visit = new boolean[d][d];
            for (int i = 0; i < d; i++) {
                String s = sc.next();
                for (int j = 0; j < d; j++) {
                    img[i][j] = s.charAt(j) == '1';
                }
            }
            imgcnt++;
            int eagles = 0;
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < d; j++) {
                    if (!visit[i][j] && img[i][j]) {
                        dfs(img, visit, i, j);
                        eagles++;
                    } else {
                        visit[i][j] = true;
                    }
                }
            }
            sb.append("Image number "+imgcnt+" contains "+eagles+" war eagles.\n");
        }
        System.out.print(sb.toString());
    }
    static void dfs(boolean[][] img,boolean[][] visit,int i,int j){
        int d=img.length;
        if(i<0 || i>=d || j<0 || j>=d)  return;
        if(visit[i][j]) return;
        visit[i][j]=true;
        if(!img[i][j]) return;
        int [] x={-1,0,1,1,1,0,-1,-1};
        int [] y={1,1,1,0,-1,-1,-1,0};
        for(int k=0;k<x.length;k++){
            int ix=i-x[k];
            int jy=j-y[k];
            dfs(img,visit,ix,jy);
        }
    }

}

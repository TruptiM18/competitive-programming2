package icpc.tab1;

import java.util.*;

class Rect{
    int lx;
    int ly;
    int ux;
    int uy;
    public Rect(int lx,int ly,int ux,int uy){
        this.lx=lx;
        this.ly=ly;
        this.ux=ux;
        this.uy=uy;
    }
}
public class uva460 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            List<Integer> x=new ArrayList<>();
            List<Integer> y=new ArrayList<>();
            Rect rect1=ReadRect(sc,x,y);
            Rect rect2=ReadRect(sc,x,y);
            if(isOverlap(rect1,rect2)){
                Collections.sort(x);
                Collections.sort(y);
                System.out.print(x.get(1)+" "+y.get(1)+" "+x.get(2)+" "+y.get(2)+"\n");
            }
            else{
                System.out.print("No Overlap\n");
            }
            if(i < n-1) {
                System.out.print("\n");
            }
        }
    }
    static boolean isOverlap(Rect rect1, Rect rect2){
        if(rect2.ux<=rect1.lx || rect2.lx>=rect1.ux)
            return false;
        if(rect2.ly>=rect1.uy || rect2.uy<=rect1.ly){
            return false;
        }
        return true;
    }
    static Rect ReadRect(Scanner sc,List<Integer> x,List<Integer> y){
        int lx,ly,ux,uy;
        lx=sc.nextInt();
        ly=sc.nextInt();
        ux=sc.nextInt();
        uy=sc.nextInt();
        x.add(lx); x.add(ux);
        y.add(ly); y.add(uy);
        return new Rect(lx,ly,ux,uy);
    }
}

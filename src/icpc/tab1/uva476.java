package icpc.tab1;

import java.util.*;
class Rectangle{
    double x;
    double y;
    double x1;
    double y1;
    public Rectangle(double x,double y,double x1,double y1){
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1=y1;
    }
}
public class uva476 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Rectangle> rects=new ArrayList<>();
        String c=sc.next();
        while(!c.equals("*")){
            rects.add(new Rectangle(sc.nextDouble(),sc.nextDouble(),
                    sc.nextDouble(),sc.nextDouble()));
            c=sc.next();
        }
        int p=0;
        while(true){
            p++;
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            if(x==9999.9 && y==9999.9)  break;
            boolean isPresent=false;
            for(int i=0;i<rects.size();i++){
                Rectangle thisRect=rects.get(i);
                if(x>thisRect.x && x<thisRect.x1 && y<thisRect.y && y>thisRect.y1){
                    isPresent=true;
                    System.out.print("Point "+p+" is contained in figure "+(i+1)+"\n");
                }
            }
            if(!isPresent){
                System.out.print("Point "+p+" is not contained in any figure\n");
            }
        }
    }
}

package icpc.tab1;

import java.util.*;
class Point{
    double x,y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public boolean equals(Point p){
        return p.x==this.x && p.y==this.y;
    }
}
public class uva10242 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            List<Point> points=new ArrayList<>();
            for(int i=0;i<4;i++){
                points.add(new Point(sc.nextDouble(),sc.nextDouble()));
            }
            int [] samePtInx=new int[2];
            int [] diffPtInx=new int[2];
            for(int i=0;i<4;i++){
                boolean commonPt=false;
                for(int j=i+1;j<4;j++){
                    if(points.get(i).equals(points.get(j))){
                        samePtInx[0]=i;
                        samePtInx[1]=j;
                        commonPt=true;
                        break;
                    }
                }
                if(commonPt)    break;
            }
            int l=0;
            for(int i=0;i<4;i++){
                if(i!=samePtInx[0] && i!=samePtInx[1]){
                    diffPtInx[l]=i;
                    l++;
                }
            }
            Point p1=points.get(diffPtInx[0]);
            Point p2=points.get(samePtInx[0]);
            Point p3=points.get(diffPtInx[1]);
            double x4,y4;
            if(p2.x==p1.x){
                x4=p3.x;
                y4=p3.y-p2.y+p1.y;
            }
            else if(p3.x==p2.x){
                x4=p1.x;
                y4=p3.y-p2.y+p1.y;
            }
            else {
                double m1 = (p2.y - p1.y) / (p2.x - p1.x);
                double m2 = (p3.y - p2.y) / (p3.x - p2.x);
                x4 = (p3.y - p1.y + m2 * p1.x - m1 * p3.x) / (m2 - m1);
                y4 = p3.y - m1 * p3.x + m1 * x4;
            }
            System.out.printf("%.3f %.3f\n",x4,y4);
        }
    }
}

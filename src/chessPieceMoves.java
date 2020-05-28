/* ------------- PROBLEM --------------
The assignment is to write a program that finds at least one
tour for a chess piece on a 10-by-10 chessboard. A tour is
a path for a piece to visit all tiles on the board, following a
set of rules for movement. Assume the piece can start in
any tile.
The four rules of movement for the piece are:
a) The piece can move 3 spaces either North, East, South,
or West.
b) The piece can move 2 spaces diagonally: Northeast,
Southeast, Southwest, or Northwest.
c) Each space can only be visited once.
The diagram shows the seven valid moves and one invalid
move for the piece at P, assuming none of them have been visited previously.

---------------------------------------*/

/* ----------- SOLUTION APPROACH --------

The piece always moves to the square from where
it can have least onward moves.
Piece starts from top left corner of 10x10
board as it can have only 3 possible onwards moves if
it starts it's journey  from corner.
----------------------------------------*/

import java.util.*;
public class chessPieceMoves{
    public static final int SIZE=10;
    public static void main(String[] args){
        // tracks if the square has already been visited or not
        boolean [][] visit = new boolean [SIZE][SIZE];
        // records the number of move at which the piece visited the square - starts from 1
        int [][] sequence = new int [SIZE][SIZE];
        // initilize sequence with false
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                visit[i][j]=false;
            }
        }
        ArrayList<ArrayList<Node>> graph=new ArrayList<ArrayList<Node>>();
        generateGraph(graph);
        //printGraph(graph);
        recursive(0,0,graph,visit,1,sequence);
        printSequence(sequence);
    }

    /* --- Generates a graph from allowed moves from each square of the board --- */
    public static void generateGraph(ArrayList<ArrayList<Node>> graph){
        // displacement array represents allowed moves
        Node [] displacement={new Node(-2,-2),new Node(0,-3),new Node(2,2),new Node(3,0),
                new Node(2,-2),new Node(0,3),new Node(-3,0),new Node(-2,2) };

        for(int i=0;i<SIZE*SIZE;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                for(int k=0;k<displacement.length;k++){
                    int nx=i+displacement[k].x;
                    int ny=j+displacement[k].y;
                    if(nx>=0 && nx<SIZE && ny>=0 && ny<SIZE){
                        int index=i*10+j;
                        graph.get(index).add(new Node(nx,ny));
                    }
                }
            }
        }
    }

    /* --- Prints the graph (used for debugging) ---*/
    public static void printGraph(ArrayList<ArrayList<Node>> graph){
        for(int i=0;i<SIZE*SIZE;i++){
            System.out.println(i/SIZE + " " + i%SIZE + "->");
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j).x + " " +graph.get(i).get(j).y + ", ");
            }
            System.out.println();
        }
    }

    /* --- Prints the sequence ---*/
    public static void printSequence(int [][] sequence){
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                System.out.print(sequence[i][j]+" ");
            }
            System.out.println();
        }
    }

    /* -- Main function that recursively calls itself to find the next possible move, with least onward move options --*/
    public static void recursive(int x,int y,ArrayList<ArrayList<Node>> graph,boolean [][] visit,int move,int [][] sequence){
        if(!visit[x][y]){
            sequence[x][y]=move;
            int index=x*SIZE+y;
            visit[x][y]=true;
            Node minOptionChildIndex=new Node(10,10);
            int minOptionChildren=Integer.MAX_VALUE;
            for(int i=0;i<graph.get(index).size();i++){
                int nx=graph.get(index).get(i).x;
                int ny=graph.get(index).get(i).y;
                if(!visit[nx][ny]){
                    if(minOptionChildren > findNumOfValidChildren(nx,ny,graph,visit)){
                        minOptionChildren=findNumOfValidChildren(nx,ny,graph,visit);
                        minOptionChildIndex=graph.get(index).get(i);
                    }
                }
            }
            if(minOptionChildren==Integer.MAX_VALUE)    return;
            recursive(minOptionChildIndex.x,minOptionChildIndex.y,graph,visit,move+1,sequence);
        }
        else{
            return;
        }
    }

    /* --- Finds valid possible moves from a particular square ----*/
    public static int findNumOfValidChildren(int x,int y,ArrayList<ArrayList<Node>> graph,boolean [][] visit){
        int result=0;
        int index=x*SIZE+y;
        for(int i=0;i<graph.get(index).size();i++){
            int cx=graph.get(index).get(i).x;
            int cy=graph.get(index).get(i).y;
            if(visit[cx][cy]==false){
                result++;
            }
        }
        return result;
    }
}

/*-- class Node is instance of square with it's x and y coordinates --- */
/* Reference point for x,y coordinates is top left corner with co-ordinates (0,0) */
class Node{
    public int x;
    public int y;
    public Node(int x,int y){
        this.x=x;
        this.y=y;
    }
}

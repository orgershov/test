import java.util.Scanner;

public class gameMaster {
    Scanner sc = new Scanner(System.in);




    public int calculateDistance(int room1x,int room1y,int room2x,int room2y){


    int distance =0;
              distance=(room1x-room2x)+(room1y-room2y);
    return distance;


    }

    public boolean makeMove(int move,room[][]maze,int i,int j,String pos[][],int player){
        boolean possibleMove=false;

        //move right
        if(move==1&&pos[0][0]=="ok"){
            if(i==0){
                System.out.println("you lost");
                return false;
            }
            if (player==1) {
                maze[i][j].AddPlyer(" ");
                maze[i - 1][j].AddPlyer("p");
            }
            if (player==2) {
                maze[i][j].AddPlyer2(" ");
                maze[i - 1][j].AddPlyer2("o");
            }
            System.out.println("moved up");
            possibleMove=true;
        }
        else if(move==1&&pos[0][0]!="ok"){
            System.out.println("can't do it make valid move");
            possibleMove=false;
        }
        //move left
        if(move==2&&pos[1][0]=="ok"){
            if(j==0){
                System.out.println("you lost");
                return false;
            }
            if (player==1) {
                maze[i][j].AddPlyer(" ");
                maze[i][j-1].AddPlyer("p");
            }
            if (player==2) {
                maze[i][j].AddPlyer2(" ");
                maze[i][j-1].AddPlyer2("o");
            }
            System.out.println("moved left");
            possibleMove=true;
        }
        else if(move==2&&pos[1][0]!="ok"){
            System.out.println("can't do it make valid move");
            possibleMove=false;
        }
        //move down
        if(move==3&&pos[0][1]=="ok"){
            if(i==4){
                System.out.println("you lost");
                return false;
            }
            if (player==1) {
                maze[i][j].AddPlyer(" ");
                maze[i+1][j].AddPlyer("p");
            }
            if (player==2) {
                maze[i][j].AddPlyer2(" ");
                maze[i+1][j].AddPlyer2("o");
            }
            System.out.println("moved down");
            possibleMove=true;
        }
        else if(move==3&&pos[0][1]!="ok"){
            System.out.println("can't do it make valid move");
            possibleMove=false;
        }
        //move right
        if(move==4&&pos[1][1]=="ok"){
            if(j==4){
                System.out.println("you lost");
                return false;
            }
            if (player==1) {
                maze[i][j].AddPlyer(" ");
                maze[i ][j+1].AddPlyer("p");
            }
            if (player==2) {
                maze[i][j].AddPlyer2(" ");
                maze[i][j+1].AddPlyer2("o");
            }
            System.out.println("moved right");
            possibleMove=true;
        }
        else if(move==4&&pos[1][1]!="ok"){
            System.out.println("can't do it make valid move");
            possibleMove=false;
        }
      return possibleMove;


    }

    public String[][] moves(String[][] room){
        String[][] pos;

        pos=isDoor(room);

        if(pos[0][0]=="ok")
        System.out.println("1.press 1 to go up");
        if(pos[1][0]=="ok")
        System.out.println("2.press 2 to go left");
        if(pos[0][1]=="ok")
        System.out.println("3.press 3 to go down");
        if(pos[1][1]=="ok")
        System.out.println("4.press 4 to go right");
     return pos;
    }

    public String[][] isDoor(String[][] door){
        String[][] directions=new String[2][2];

        if(door[0][2]=="*")
            directions[0][0]="ok";
        if(door[2][0]=="*")
            directions[1][0]="ok";
        if(door[4][2]=="*")
            directions[0][1]="ok";
        if(door[2][4]=="*")
            directions[1][1]="ok";


        return directions;
    }

    public boolean isOffLimits(String[][] room){
        boolean empty=false;
        if(room[0][2]=="-")
            empty=true;
        return empty;
    }

    public boolean isTrusare(String[][] room){

        boolean tes=false;
        if(room[0][0]=="not")
            tes=true;

        return tes;
    }

    public int sclculteDistance(){
         int distance=0;
        return distance;
    }
}

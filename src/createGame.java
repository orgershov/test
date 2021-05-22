import java.util.ArrayList;

public class createGame {

    public void crateMaze( String[][] mazeGrid, ArrayList<room> roomsList){
        int count=0;
        int count2=0;

        for (int i = 0; i < mazeGrid.length; i++) {

            for (int j = 0; j < mazeGrid.length; j++) {
                if (i == 0 || i == 5 || i == 10 || i == 15 || i == 20 ) {
                    if (count == 5)
                     count=0;
                     count2=setCounter(i,j);
                    mazeGrid[i][j] = roomsList.get(count2).getWall(0, count);
                    count++;
                }
                if (i == 1 || i == 6 || i == 11 || i == 16 || i == 21 ) {
                    if (count == 5)
                        count = 0;
                    count2=setCounter(i,j);
                    mazeGrid[i][j] = roomsList.get(count2).getWall(1, count);
                    count++;
                }
                if (i == 2 || i == 7 || i == 12 || i == 17 || i == 22 ) {
                    if (count == 5)
                        count = 0;
                    count2=setCounter(i,j);
                    mazeGrid[i][j] = roomsList.get(count2).getWall(2, count);
                    count++;
                }
                if (i == 3 || i == 8 || i == 13 || i == 18 || i == 23 ) {
                    if (count == 5)
                        count = 0;
                    count2=setCounter(i,j);
                    mazeGrid[i][j] = roomsList.get(count2).getWall(3, count);
                    count++;
                }
                if (i == 4 || i == 9 || i == 14 || i == 19 || i == 24 ) {
                    if (count == 5)
                        count = 0;
                    count2=setCounter(i,j);
                    mazeGrid[i][j] = roomsList.get(count2).getWall(4, count);
                    count++;
                }
            }

        }
        System.out.println();
        System.out.println();;

    }

    private  int setCounter(int i, int j){
         int location=0;
        //firs row
        if (j == 0 || j == 1 || j == 2||j==3||j==4){
            if (i == 0)
                location=0;
            if (i == 5)
                location=5;
            if (i == 10)
                location=10;
            if (i == 15)
                location=15;
            if (i == 20)
                location=20;

        }

        if( j == 5 || j == 6 || j == 7||j==8||j==9){
            if (i == 0)
                location=1;
            if (i == 5)
                location=6;
            if (i == 10)
                location=11;
            if (i == 15)
                location=16;
            if (i == 20)
                location=21;
        }
        if( j == 10 || j == 11 || j == 12||j==13||j==14){
            if (i == 0)
                location=2;
            if (i == 5)
                location=7;
            if (i == 10)
                location=12;
            if (i == 15)
                location=17;
            if (i == 20)
                location=22;
        }
        if( j == 15 || j == 16 || j == 17||j==18||j==19){
            if (i == 0)
                location=3;
            if (i == 5)
                location=8;
            if (i == 10)
                location=13;
            if (i == 15)
                location=18;
            if (i == 20)
                location=23;
        }
        if( j == 20 || j ==21 || j == 22||j==23||j==24){
            if (i == 0)
                location=4;
            if (i == 5)
                location=9;
            if (i == 10)
                location=14;
            if (i == 15)
                location=19;
            if (i == 20)
                location=24;
        }

        //secund row
        if (j == 0 || j == 1 || j == 2||j==3||j==4){
            if (i == 1)
                location=0;
            if (i == 6)
                location=5;
            if (i == 11)
                location=10;
            if (i == 16)
                location=15;
            if (i == 21)
                location=20;
        }
        if( j == 5 || j == 6 || j == 7||j==8||j==9){
            if (i == 1)
                location=1;
            if (i == 6)
                location=6;
            if (i == 11)
                location=11;
            if (i == 16)
                location=16;
            if (i == 21)
                location=21;
        }
        if( j == 10 || j == 11 || j == 12||j==13||j==14){
            if (i == 1)
                location=2;
            if (i == 6)
                location=7;
            if (i == 11)
                location=12;
            if (i == 16)
                location=17;
            if (i == 21)
                location=22;
        }
        if( j == 15 || j == 16 || j == 17||j==18||j==19) {
            if (i == 1)
                location = 3;
            if (i == 6)
                location = 8;
            if (i == 11)
                location = 13;
            if (i == 16)
                location = 18;
            if (i == 21)
                location = 23;
        }
        if( j == 20 || j ==21 || j == 22||j==23||j==24){
            if (i == 1)
                location=4;
            if (i == 6)
                location=9;
            if (i == 11)
                location=14;
            if (i == 16)
                location=19;
            if (i == 21)
                location=24;
        }

        //third row
        if (j == 0 || j == 1 || j == 2||j==3||j==4){
            if (i == 2)
                location=0;
            if (i == 7)
                location=5;
            if (i == 12)
                location=10;
            if (i == 17)
                location=15;
            if (i == 22)
                location=20;
        }
        if( j == 5 || j == 6 || j == 7||j==8||j==9){
            if (i == 2)
                location=1;
            if (i == 7)
                location=6;
            if (i == 12)
                location=11;
            if (i == 17)
                location=16;
            if (i == 22)
                location=21;
        }
        if( j == 10 || j == 11 || j == 12||j==13||j==14){
            if (i == 2)
                location=2;
            if (i == 7)
                location=7;
            if (i == 12)
                location=12;
            if (i == 17)
                location=17;
            if (i == 22)
                location=22;
        }
        if( j == 15 || j == 16 || j == 17||j==18||j==19){
            if (i == 2)
                location = 3;
            if (i == 7)
                location = 8;
            if (i == 12)
                location = 13;
            if (i == 17)
                location = 18;
            if (i == 22)
                location = 23;
        }
        if( j == 20 || j ==21 || j == 22||j==23||j==24){
            if (i == 2)
                location=4;
            if (i == 7)
                location=9;
            if (i == 12)
                location=14;
            if (i == 17)
                location=19;
            if (i == 22)
                location=24;
        }
        //fourth row
        if (j == 0 || j == 1 || j == 2||j==3||j==4){
            if (i == 3)
                location=0;
            if (i == 8)
                location=5;
            if (i == 13)
                location=10;
            if (i == 18)
                location=15;
            if (i == 23)
                location=20;
        }
        if( j == 5 || j == 6 || j == 7||j==8||j==9){
            if (i == 3)
                location=1;
            if (i == 8)
                location=6;
            if (i == 13)
                location=11;
            if (i == 18)
                location=16;
            if (i == 23)
                location=21;
        }
        if( j == 10 || j == 11 || j == 12||j==13||j==14){
            if (i == 3)
                location=2;
            if (i == 8)
                location=7;
            if (i == 13)
                location=12;
            if (i == 18)
                location=17;
            if (i == 23)
                location=22;
        }
        if( j == 15 || j == 16 || j == 17||j==18||j==19){
            if (i == 3)
                location = 3;
            if (i == 8)
                location = 8;
            if (i == 13)
                location = 13;
            if (i == 18)
                location = 18;
            if (i == 23)
                location = 23;
        }
        if( j == 20 || j ==21 || j == 22||j==23||j==24){
            if (i == 3)
                location=4;
            if (i == 8)
                location=9;
            if (i == 13)
                location=14;
            if (i == 18)
                location=19;
            if (i == 23)
                location=24;
        }
        //fifth row
        if (j == 0 || j == 1 || j == 2||j==3||j==4){
            if (i == 4)
                location=0;
            if (i ==9)
                location=5;
            if (i == 14)
                location=10;
            if (i == 19)
                location=15;
            if (i == 24)
                location=20;
        }
        if( j == 5 || j == 6 || j == 7||j==8||j==9){
            if (i == 4)
                location=1;
            if (i ==9)
                location=6;
            if (i == 14)
                location=11;
            if (i == 19)
                location=16;
            if (i == 24)
                location=21;
        }
        if( j == 10 || j == 11 || j == 12||j==13||j==14){
            if (i == 4)
                location=2;
            if (i ==9)
                location=7;
            if (i == 14)
                location=12;
            if (i == 19)
                location=17;
            if (i == 24)
                location=22;
        }
        if( j == 15 || j == 16 || j == 17||j==18||j==19){
            if (i == 4)
                location = 3;
            if (i ==9)
                location = 8;
            if (i == 14)
                location = 13;
            if (i == 19)
                location = 18;
            if (i == 24)
                location = 23;
        }
        if( j == 20 || j ==21 || j == 22||j==23||j==24){
            if (i == 4)
                location=4;
            if (i ==9)
                location=9;
            if (i == 14)
                location=14;
            if (i == 19)
                location=19;
            if (i == 24)
                location=24;
        }
        return location;
    }

    public void printMaze(String[][] gamePrinter){
        for (int i = 0; i < gamePrinter.length; i++) {

            for (int j = 0; j < gamePrinter.length; j++) {
                System.out.print(gamePrinter[i][j]);

            }
            System.out.println();
        }
    }

    public  void addRomToMaze(room[][] maze, ArrayList<room> roomsList){
        int count=0;
        for (int i = 0; i < maze.length; i++) {

            for (int j = 0; j < maze[i].length; j++) {

                maze[i][j] = roomsList.get(count);

                count++;
            }

        }

    }

    public  ArrayList<room> initalizeRooms(ArrayList<room> roomsList){
        room singleRoom = new room(1);
        for (int i = 0; i < 25; i++) {
            if(i==0||i==4||i==8){
                singleRoom = new room(1);
            }
            if(i==21){
               singleRoom = new room(2);
            }

            if(i==23||i==17){
               singleRoom = new room(4);
            }

            if(i==13||i==20||i==22){
                 singleRoom = new room(6);
            }
            if(i==9){
                 singleRoom = new room(7);
            }
            if(i==7||i==24){
                singleRoom = new room(8);
            }

            if(i==5||i==6){
                singleRoom = new room(9);
            }
            if(i==11||i==13){
                singleRoom = new room(10);
            }
            if(i==12){
                singleRoom = new room(11);
            }
            if(i==16||i==18){
                singleRoom = new room(12);
            }
            if(i==15){
                singleRoom = new room(13);
            }
            if(i==1|i==2||i==3||i==10||i==19){
                singleRoom = new room(14);
            }

            roomsList.add(singleRoom);



        }
        return roomsList;
    }
}

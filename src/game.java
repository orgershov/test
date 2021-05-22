import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        boolean isMoved = false;
        boolean victory = false;
        gameMaster startGame = new gameMaster();
        //the maze
        room maze[][] = new room[5][5];
        room singleRoom = new room();
        //the arry used to print the maze
        String[][] mazeGrid = new String[25][25];
        String[][] psition = new String[2][2];
        String[][] emptySpace = new String[2][2];
        ArrayList<room> roomsList = new ArrayList<>();
        createGame gameMaster = new createGame();
        String[][] trusereroom = new String[5][5];
        int playerApoints = 20;
        int playerBpoints = 20;
        int score;
        int player = 1;
        //initalize the rooms
        roomsList = gameMaster.initalizeRooms(roomsList);
        // add rooms
        gameMaster.addRomToMaze(maze, roomsList);

        //setting the tresure
        int tresure = 20;
        maze[4][4].AddPlyer(String.valueOf(tresure));
        //adding the players
        maze[0][0].AddPlyer("p");
        maze[0][0].AddPlyer2("o");

        //create the maze
        gameMaster.crateMaze(mazeGrid, roomsList);
        //print the maze
        gameMaster.printMaze(mazeGrid);
        int choise = 0;
        int xPosP1 = 0;
        int yPosP1 = 0;
        int xPosP2 = 0;
        int yPosP2 = 0;
        int help = 5;
        boolean isEmpty;
        boolean player1Status = false;
        boolean player2Status = false;
        System.out.println("the ruls:\n press 1 to gu up , press 2 to go left , press 3 to go down ,press 4 " +
                "to go right,press 5 to stay in the same room, press 6 to ask help");
        while (!victory) {

            while (!isMoved && player == 1 && !player1Status&&!victory) {
                System.out.println("p1 you move");
                psition = startGame.moves(maze[xPosP1][yPosP1].getRoom());
                System.out.println("press 5 for help, press 6 to not move");
                choise = sc.nextInt();
                if (choise<5){
                while (!isMoved) {
                    isMoved = startGame.makeMove(choise, maze, xPosP1, yPosP1, psition, player);
                    if (isMoved)
                        break;
                    choise = sc.nextInt();
                }
                if (isMoved) {

                    if (choise == 1) {
                        xPosP1 -= 1;
                        isEmpty = startGame.isOffLimits(maze[xPosP1][yPosP1].getRoom());

                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            isMoved = false;
                            player = 2;
                            player1Status = true;
                            break;
                        }
                        playerApoints -= 1;

                    }
                    if (choise == 2) {
                        yPosP1 = +1;
                        isEmpty = startGame.isOffLimits(maze[xPosP1][yPosP1].getRoom());
                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            isMoved = false;
                            player = 2;
                            player1Status = true;
                            break;
                        }
                        playerApoints -= 1;
                    }

                    if (choise == 3) {
                        xPosP1 += 1;
                        isEmpty = startGame.isOffLimits(maze[xPosP1][yPosP1].getRoom());
                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            isMoved = false;
                            player = 2;
                            player1Status = true;
                            break;
                        }
                        playerApoints -= 1;
                    }
                    if (choise == 4) {
                        yPosP1 += 1;
                        isEmpty = startGame.isOffLimits(maze[xPosP1][yPosP1].getRoom());
                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            isMoved = false;
                            player = 2;
                            player1Status = true;
                            break;
                        }
                        playerApoints -= 1;
                    }
                }

                }
                if (choise == 5) {
                    System.out.println("witch room you want to know the contact?");
                    System.out.println("1- left room,2-top room,3-right room,4bottom room");
                    System.out.println("5 the distance to the treasure");
                    help = sc.nextInt();
                    //get the contnant of the left room
                    if (help == 1 && yPosP1 > 0)
                        maze[xPosP1][yPosP1].getNibghorRoom(maze[xPosP1][yPosP1 - 1].getRoom());
                    //get the contnant of the top room
                    if (help == 2 && xPosP1 > 0)
                        maze[xPosP1][yPosP1].getNibghorRoom(maze[xPosP1 - 1][yPosP1].getRoom());
                    //get the contnant of the right room
                    if (help == 3 && yPosP1 < 4)
                        maze[xPosP1][yPosP1].getNibghorRoom(maze[xPosP1][yPosP1 + 1].getRoom());
                    //get the contnant of the down room
                    if (help == 4 && xPosP1 < 4)
                        maze[xPosP1][yPosP1].getNibghorRoom(maze[xPosP1 + 1][yPosP1].getRoom());

                    if (help == 5) {
                        int dis = 0;
                        dis = startGame.calculateDistance(xPosP1, yPosP1, 4, 4);
                        if (dis < 0)
                            dis *= -1;
                        System.out.println("distance is: " + dis + " rooms");
                        playerApoints -= 1;
                    }


                }
                if (choise == 6) {
                    System.out.println("you chose not to move ");
                    playerApoints -= 1;
                } else if (!isMoved) {
                    break;

                }
                if (xPosP1 == 4 && yPosP1 == 4) {
                    score = tresure - playerApoints;
                    System.out.println("win your score is:" + score);
                    victory = true;
                    break;
                }
                gameMaster.crateMaze(mazeGrid, roomsList);
                gameMaster.printMaze(mazeGrid);
            }
            isMoved = false;
            isEmpty = false;
            player = 2;
            while (!isMoved && player == 2 && !player2Status&&!victory) {
                System.out.println("p2 you move");

                psition = startGame.moves(maze[xPosP2][yPosP2].getRoom());

                choise = rand.nextInt(4) + 1;
                while (!isMoved) {
                    isMoved = startGame.makeMove(choise, maze, xPosP2, yPosP2, psition, player);
                    if (isMoved)
                        break;
                    choise = rand.nextInt(4) + 1;
                }

                if (isMoved) {

                    if (choise == 1) {
                        xPosP2 -= 1;
                        isEmpty = startGame.isOffLimits(maze[xPosP2][yPosP2].getRoom());
                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            isMoved = false;
                            player = 1;
                            player2Status = true;
                            break;
                        }
                        playerBpoints -= 1;
                    }
                    if (choise == 2) {
                        yPosP2 -= 1;
                        isEmpty = startGame.isOffLimits(maze[xPosP2][yPosP2].getRoom());
                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            isMoved = false;
                            player = 1;
                            player2Status = true;
                            break;
                        }
                        playerBpoints -= 1;
                    }

                    if (choise == 3) {
                        xPosP2 += 1;
                        isEmpty = startGame.isOffLimits(maze[xPosP2][yPosP2].getRoom());
                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            player2Status = true;
                            isMoved = false;
                            player = 1;
                            break;
                        }
                        playerBpoints -= 1;
                    }
                    if (choise == 4) {
                        yPosP2 += 1;
                        isEmpty = startGame.isOffLimits(maze[xPosP2][yPosP2].getRoom());
                        if (isEmpty) {
                            System.out.println("you got out of bounds and lost");
                            isMoved = false;
                            player = 1;
                            player2Status = true;
                            break;
                        }
                        playerBpoints -= 1;
                    }

                }


                if (xPosP2 == 4 && yPosP2 == 4) {
                    score = tresure - playerBpoints;
                    System.out.println("win your score is:" + score);
                    victory = true;
                    break;
                }
                gameMaster.crateMaze(mazeGrid, roomsList);
                gameMaster.printMaze(mazeGrid);

                isMoved = false;


                player = 1;

            }

        }
    }
}




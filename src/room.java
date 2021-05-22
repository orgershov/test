import java.util.ArrayList;

public class room{
    String[][] room1 = new String[5][5];

    public room(){}
  public room (int location){
       if(location==1){
           setRoom1();
           setRest();
       }
       if(location==2){
           setRoom2();
           setRest();}
       if(location==3){
           setRoom3();
           setRest();}
       if(location==4){
           setRoom4();
           setRest();
       }

       if(location==5){  setRoom5();  setRest();}

       if(location==6){ setRoom6();  setRest();}

       if(location==7){ setRoom7();  setRest();}

       if(location==8){ setRoom8();  setRest();}
      if(location==9){ setRoom9();  setRest();}
      if(location==10){ setRoom10();  setRest();}
      if(location==11){ setRoom11();  setRest();}
      if(location==12){ setRoom12();  setRest();}
      if(location==13){ setRoom13();  setRest();}
       if(location==14)
           setEmpty();




    }

    public String getWall(int i, int j)
    {

        return room1[i][j];
    }
    public void printRoom(){

        for(int i=0 ;i<room1.length;i++) {

            for (int j = 0; j < room1.length; j++) {
                System.out.print(room1[i][j]);

                }

            System.out.println();
            }


        }


   public void AddPlyer(String p){

         room1[2][1]=p;

   }
    public void AddPlyer2(String p){
        room1[2][2]=p;
    }
  public String[][] getRoom(){

      return room1;
    }
public void getNibghorRoom(String[][] room){
    for(int i=0 ;i<room.length;i++) {

        for (int j = 0; j < room.length; j++) {
            System.out.print(room[i][j]);

        }

        System.out.println();
    }

}



    private void setRest(){

      //set the corners
        room1[0][0] = "#";
        room1[4][0] = "#";
        room1[0][4] = "#";
        room1[4][4] = "#";

        //set the middle
        room1[1][1] = " ";
        room1[1][2] = " ";
        room1[1][3] = " ";
        room1[2][1] = " ";
        room1[2][2] = " ";
        room1[2][3] = " ";
        room1[3][1] = " ";
        room1[3][2] = " ";
        room1[3][3] = " ";
    }
    private void setEmpty(){

      for(int i = 0;i<room1.length;i++){
          for(int j = 0;j<room1.length;j++){

              room1[i][j]="-";
          }

      }
    }
    public  void setRoom1(){
        room1[1][0] = "#";
        room1[2][0] = "#";
        room1[3][0] = "#";

        //roof
        room1[0][1] = "#";
        room1[0][2] = "#";
        room1[0][3] = "#";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "#";
        room1[2][4] = "#";
        room1[3][4] = "#";
    }
    public  void setRoom2(){
        room1[1][0] = "#";
        room1[2][0] = "#";
        room1[3][0] = "#";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "#";
        room1[4][2] = "#";
        room1[4][3] = "#";

        //right wall
        room1[1][4] = "*";
        room1[2][4] = "*";
        room1[3][4] = "*";
    }
    public  void setRoom3(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "#";
        room1[2][4] = "#";
        room1[3][4] = "#";

        //right wall
        room1[1][4] = "#";
        room1[2][4] = "#";
        room1[3][4] = "#";
    }
    public  void setRoom4(){
        room1[1][0] = "#";
        room1[2][0] = "#";
        room1[3][0] = "#";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "*";
        room1[2][4] = "*";
        room1[3][4] = "*";
    }
    public  void setRoom5(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "#";
        room1[4][2] = "#";
        room1[4][3] = "#";

        //right wall
        room1[1][4] = "*";
        room1[2][4] = "*";
        room1[3][4] = "*";
    }
    public  void setRoom6(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "#";
        room1[4][2] = "#";
        room1[4][3] = "#";

        //right wall
        room1[1][4] = "#";
        room1[2][4] = "#";
        room1[3][4] = "#";
    }
    public  void setRoom7(){
        room1[1][0] = "#";
        room1[2][0] = "#";
        room1[3][0] = "#";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "#";
        room1[2][4] = "#";
        room1[3][4] = "#";
    }
    public  void setRoom8(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "#";
        room1[0][2] = "#";
        room1[0][3] = "#";
        //floor
        room1[4][1] = "#";
        room1[4][2] = "#";
        room1[4][3] = "#";

        //right wall
        room1[1][4] = "#";
        room1[2][4] = "#";
        room1[3][4] = "#";
    }

    public  void setRoom9(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "*";
        room1[2][4] = "*";
        room1[3][4] = "*";
    }
    public  void setRoom10(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "*";
        room1[0][2] = "*";
        room1[0][3] = "*";
        //floor
        room1[4][1] = "#";
        room1[4][2] = "#";
        room1[4][3] = "#";

        //right wall
        room1[1][4] = "*";
        room1[2][4] = "*";
        room1[3][4] = "*";
    }
    public  void setRoom11(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "#";
        room1[0][2] = "#";
        room1[0][3] = "#";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "*";
        room1[2][4] = "*";
        room1[3][4] = "*";
    }
    public  void setRoom12(){
        room1[1][0] = "*";
        room1[2][0] = "*";
        room1[3][0] = "*";

        //roof
        room1[0][1] = "#";
        room1[0][2] = "#";
        room1[0][3] = "#";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "#";
        room1[2][4] = "#";
        room1[3][4] = "#";
    }
    public  void setRoom13(){
        room1[1][0] = "#";
        room1[2][0] = "#";
        room1[3][0] = "#";

        //roof
        room1[0][1] = "#";
        room1[0][2] = "#";
        room1[0][3] = "#";
        //floor
        room1[4][1] = "*";
        room1[4][2] = "*";
        room1[4][3] = "*";

        //right wall
        room1[1][4] = "*";
        room1[2][4] = "*";
        room1[3][4] = "*";
    }
}



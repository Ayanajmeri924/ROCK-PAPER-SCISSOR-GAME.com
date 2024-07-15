/*
 * ROCK PAPER scissors GAME:
 */

 package harrych1;
 import java.util.*;
 import java.util.Random;
  public class ch4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random=new Random();
        int round=0;
        int compwin=0;
        int humanwin=0;
        System.out.print("----ENTER NO OF ROUND YOU WANNA PLAY---- :");
        int n=in.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("----RAGE IS FROM 1 TO 3----");
            System.out.println("----ENTER 1 FOR ROCK----");
            System.out.println("----ENTER 2 FOR PAPER----");
            System.out.println("----ENTER 3 FOR scissor----");

            round=round+1;
            System.out.println("round no: "+round);
            System.out.print("----ENTER HUMAN CHOICE---- : ");
            int humanMove=in.nextInt();
            switch (humanMove) {
                case 1:System.out.println("----YOUR CHOICE IS ROCK----");
                    
                    break;
                case 2:System.out.println("----YOUR CHOICE IS PAPER----");
                    
                    break;
                case 3:System.out.println("YOUR CHOICE IS scissors");
                    
                break;    
                default:
                System.out.println("INVALID CHOICE");
                    break;
            }
            //now random number by computer
            //computer choice
            int compMOve=random.nextInt(1,4);
            System.out.println("COMPUTER CHOICE :"+compMOve);
            switch (compMOve) {
                case 1:System.out.println("----COMPUTER CHOICE IS ROCK----");
                    
                    break;
                case 2:System.out.println("----COMPUTER CHOICE IS PAPER----");
                    
                    break;
                case 3:System.out.println("----COMPUTER CHOICE IS scissors----");
                    
                break;    
                default:
                // System.out.println("INVALID CHOICE");
                    break;
            }  
            if(humanMove==compMOve){
                System.out.println("<_________tired_____________>");
            }else if(humanMove==1 && compMOve==2 || humanMove==2 && compMOve==3 || humanMove==3 && compMOve==1){
                System.out.println("<___________computer win___________>");
                compwin=compwin+1;
            }else if(compMOve==1 && humanMove==2 || humanMove==3 && compMOve==2 || humanMove==1 && compMOve==3){
                System.out.println("<_____________HUMAN win<______________>");
                humanwin=humanwin+1;
            }
            
        }
        System.out.println("*****************FINAL SCORE*****************");
        System.out.println("TOTAL NO OF ROUND = "+round);
        System.out.println("HUMAN POINT = "+humanwin);
        System.out.println("COMPUTER POINT = "+compwin);
        System.out.println("*****************OVER ALL WIN*******************");
        if(humanwin==compwin){
            System.out.println("****************TOUGH MATCH, TIRED*******************");
        }else if(humanwin>compwin){
            System.out.println("*******************HUMAN WIN******************");
        }else{
            System.out.println("********************COMPUTER WIN*****************");
        }
        
        in.close();
        

    }
  }

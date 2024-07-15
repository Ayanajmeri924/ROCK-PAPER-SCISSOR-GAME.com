//  package harrych1;
// // import java.util.*;

// // public class ch4 {
// //     public static void main(String[] args) {
// //         Scanner in = new Scanner(System.in);
//         // System.out.println("enter math marks out of 100 marks:");
//         // float math=in.nextInt();
//         // System.out.println("enter physics marks out of 100 marks:");
//         // float physics=in.nextInt();
//         // System.out.println("enter chemistry marks out of 100 marks:");
//         // float chemistry=in.nextInt();
//         // // in.close();
//         // float total=math+physics+chemistry;
//         // float percentage=(total/300)*100;
//         // in.close();

//         // if (chemistry>=33 && physics>=33 && math>=33 || percentage>=40){
//         //     System.out.println("pass with percentage of "+percentage+"%");
//         // } else{
//         //     System.out.println("fail with percentage of "+percentage+"%");
//         // }
//         // System.out.println(percentage);
//         // System.out.println(total);

//         //QUESTION LEAP YEAR
//         // System.out.println("enter year to check leap or not :");
//         // int year=in.nextInt();
//         // if(year%4==0 &&( year%100==0 || year%400!=0)){
//         //     System.out.println("leap year"+year);

//         // }else{
//         //     System.out.println("not a leap year"+year);
//         // }

//         // Java program to demonstrate 
// // method calls of Random class 

// import java.util.Random;
// import java.util.Scanner; 

// public class ch4 
// { 
// 	public static void main(String[] args) 
// 	{ 
//         Scanner in=new Scanner(System.in);
// 		Random random = new Random(); 
//         System.out.println("range from 1 to 5");
//         System.out.println("enter human choice");
//         int humanMove=in.nextInt();
// 		int compMOve=random.nextInt(1,4); 
//         in.close();
//         if(humanMove==compMOve){
//             System.out.println("happy birthday , computer move and human = "+compMOve);
//         }else if(humanMove>=5){
//             System.out.println("out of range"+humanMove);
//         }else{
//             System.out.println("unlucky ,computer move = "+compMOve+ " & human move = "+humanMove);
//         }

// 	// 	System.out.println(random.nextBoolean()); 
// 	// 	System.out.println(random.nextDouble()); 
// 	// 	System.out.println(random.nextFloat()); 
// 	// 	System.out.println(random.nextGaussian()); 
// 	// 	byte[] bytes = new byte[10]; 
// 	// 	random.nextBytes(bytes); 
// 	// 	System.out.printf("["); 
// 	// 	for(int i = 0; i< bytes.length; i++) 
// 	// 	{ 
// 	// 		System.out.printf("%d ", bytes[i]); 
// 	// 	} 
// 	// 	System.out.printf("]\n"); 
		
// 	// 	System.out.println(random.nextLong()); 
// 	// System.out.println(random.nextInt()); 
	
// 	// long seed = 95; 
// 	// random.setSeed(seed); 
		
// 	// Note: Running any of the code lines below 
// 	// will keep the program running as each of the 
// 	// methods below produce an unlimited random 
// 	// values of the corresponding type 

// 	/* System.out.println("Sum of all the elements in the IntStream returned = " + 
// 		random.ints().count()); 
// 	System.out.println("Count of all the elements in the DoubleStream returned = " + 
// 		random.doubles().count()); 
// 	System.out.println("Count of all the elements in the LongStream returned = " + 
// 		random.longs().count()); 
	
// 	*/
	
//     } 
// }	 

// //     }
// // }

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

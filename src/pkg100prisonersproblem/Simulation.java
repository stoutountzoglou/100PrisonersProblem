/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100prisonersproblem;
import java.util.Random;
/**
 *
 * @author lenovo
 */
public class Simulation {
    
    int[] prisoners=new int[100];
    int[] boxes=new int[100];
    Random randomGen = new Random();
    
    /*Constructor Simulation Creates a Prisoner array and shuffles the boxes Array*/
    public Simulation(){
 
        for (int i=0;i<prisoners.length;i++){
            prisoners[i]=i;
        }
        this.shuffleBoxes();
    }
    /*Method shuffleBoxes() gives random integer values from 0 to 99, one time each
      to the boxes array.*/
    public void shuffleBoxes(){
        int RandInt;
        int SearchExists;
        
        for (int j=0;j<boxes.length;j++){
            boxes[j]=-1;
        }
        
        for (int i=0;i<prisoners.length;i++){
            do{
                RandInt = randomGen.nextInt(100);
                SearchExists=0;
                for (int j=0;j<boxes.length;j++){
                    if (boxes[j]==RandInt){
                        SearchExists=1;
                        break;
                    }
                }
            }while (SearchExists==1);
            boxes[i]=RandInt;
        }
    }
    
    public boolean startSearch(){
        boolean success;
        int currentNum;
        int i;
        int j;
        
        success=true;
        i=0;
        j=0;
        for (i=0;i<100;i++){           
            currentNum=i;
            for(j=0;j<50;j++){
                if (i==boxes[currentNum]){
                    break;
                }
                else {
                    currentNum=boxes[currentNum];
                }
            }
            if (j==50){
                success=false;
                break;
            }
        }
                
        return success;
    }
    
    
}

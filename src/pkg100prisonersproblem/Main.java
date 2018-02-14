/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100prisonersproblem;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count;
        int k;
        int SimulationsNum;
        
        SimulationsNum=1000;
        count = 0;
        Simulation Sim = new Simulation();
        
        for (k=0;k<SimulationsNum;k++){
            Sim.shuffleBoxes();
            if (Sim.startSearch()==true){
                count++;
            }
        }
        System.out.println("Simulation " + count + " out of " + k + " succeeded.");
        System.out.println("Propability: " + ((double)count/(double)SimulationsNum)*100 + " %.");
    }
    
}

package runner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import simulatedAnnealing.SimulatedAnnealing;
import simulatedAnnealing.*;

public class run {

    public static void main(String[] args) throws Exception{
        long tempo;
        NQueen nq;
        int tolerancia = 0;
        int temperatura = 500;
        int resfriamento = 1;
        //for (int i =1; i < 20; i++) {
        	int i = 10;
            System.out.println("N = " + i);
            System.out.println("Tolerancia = " + tolerancia);
            System.out.println("Temperatura = " + temperatura);
            System.out.println("Resfriamento = " + resfriamento);
            nq = new SimulatedAnnealing(i,tolerancia,temperatura, resfriamento);
            tempo = System.currentTimeMillis();
            nq.solve();
            tempo = System.currentTimeMillis()-tempo;
            nq.show();
            System.out.println("T:" + tempo);
        //}

    }

}

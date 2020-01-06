package class_1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComputeMain {
    public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Compute[] compute = new Compute[3];
	    for(int i = 0; i < compute.length; i++) {
	    	compute[i] = new Compute();
	    	System.out.print("x입력: ");
	    	compute[i].setX(Integer.parseInt(br.readLine()));
	    	System.out.print("y입력: ");
	    	compute[i].setY(Integer.parseInt(br.readLine()));
	    	compute[i].calc();
	    	System.out.println();
	    }
	    System.out.println("x\ty\tsum\tsub\tmul\tdiv");
	    for(Compute data : compute) {
	    	System.out.println(data.getX()+"\t"+data.getY()+"\t"+data.getSum()+"\t"+data.getSub()+"\t"+data.getMul()+"\t"+String.format("%.2f", data.getDiv())+"\t");
	    }
	}
}

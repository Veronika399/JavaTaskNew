package hr.atos.praksa.veronikapavlik.zadatak12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Zadatak12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
        System.out.print("Unesite putanju datoteke: ");
        String filePath = myObj.nextLine();
        
        File file=new File(filePath);
        
        if (file.exists()) {
        	System.out.println("U datoteci "+ file.getName()+" nalaze se sljedece rijeci:");
        	System.out.println("------------------------");
            System.out.println("Rijec (broj ponavljanja)");
            System.out.println("------------------------");
            
            String words[];
            //HashSet<String> words[] = new HashSet<String>();
            int count=0;
        	int allWords=0;

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                	words = line.replaceAll("[^a-zA-Z\\s]", "").split("\\s");
                	Arrays.sort(words);
                	for(int i=0;i<words.length;i++) {
                		allWords++;
                		for(int j=0;j<words.length;j++)
                			if(words[i].equalsIgnoreCase(words[j])) {
                				count+=1;
                			}
                		
                		System.out.println(words[i] + "  ("+ count+")");
                		count=0;
                	}
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            System.out.println("------------------------");
            
        }
        else {
            System.out.println("Datoteka ne postoji!");
        }
        
}	


}

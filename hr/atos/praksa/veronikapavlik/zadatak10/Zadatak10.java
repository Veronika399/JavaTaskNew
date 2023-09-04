package hr.atos.praksa.veronikapavlik.zadatak10;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner myObj = new Scanner(System.in);
        System.out.print("Unesite putanju direktorija: ");
        String directoryPath = myObj.nextLine();

        System.out.print("Unesite tekstualnu frazu za pretragu: ");
        String searchPhrase = myObj.nextLine();
        myObj.close();


        Pattern pattern = Pattern.compile(searchPhrase);

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            searchFilesInDirectory(directory, pattern);
        } else {
            System.out.println("Direktorij ne postoji ili nije direktorij.");
        }
	}
	
    private static void searchFilesInDirectory(File directory, Pattern pattern) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchFilesInDirectory(file, pattern);
                } else if (file.isFile() && (file.getName().endsWith(".csv") || file.getName().endsWith(".txt"))) {
                    searchInFile(file, pattern);
                }
            }
        }
    }
    
    private static void searchInFile(File file, Pattern pattern) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println("Datoteka u kojoj se nalazi fraza: " + file.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	

}

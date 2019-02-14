import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Spider {

	public static void main(String[] args) throws IOException {
		
		/*try {
        
			String dbURL = "jdbc:sqlserver://localhost";
            String user = "sa";
            String pass = "reallyStrongPwd123";
            Connection conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
            	System.out.println("Connection Made.");
            	DatabaseMetaData dm = conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
		*/
		//aSecondChanceLeg();
		justinBarlett();
	}
	

	public static void aSecondChanceLeg() throws IOException {
		Document doc = Jsoup.connect("https://www.asecondchancerescue.org/animals/list?Species=Dog").get();
		Element table = doc.select("tbody").last(); // select the first table.
		String text = table.text();
		text = text.replace("I WANT TO FOSTER TO ADOPT Dog - Terrier ", "");
		text = text.replace(" / ", "/");
		text = text.replace(" Dog - ", "#");
		if (text.contains("Female")) {
			text = text.replace(" Female ", "@Female*\n");
		}
		if (text.contains("Male")) {
			text = text.replace(" Male ", "@Male*\n");
		}
		if (text.contains("adoption pending")) {
			text = text.replace(" (adoption pending)", "");
		}
		if (text.contains(" Female")) {
			text = text.replace(" Female", "@Female*\n");
		}
		if (text.contains(" Male")) {
			text = text.replace(" Male", "@Male*\n");
		}

		//String[] names;

		System.out.println(text);

		String currentName;
		int lNameLocation = 0;
		int fNameLocation = 0;
		int starLocation = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (text.charAt(i) == '*') {
				starLocation = i;
			}
			if (c == '#' && fNameLocation == 0) {
				fNameLocation = lNameLocation;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);

				fNameLocation = 1;

			
					Random rand = new Random();
					int x = rand.nextInt(3000);
					//addName(x, currentName, 1);
				
				
				
			} else if (c == '#') {
				fNameLocation = starLocation + 2;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);
				
					Random rand = new Random();
					int x = rand.nextInt(3000);
					//addName(x, currentName, 1);
				}

			}

		
		}
	

	public static void justinBarlett() throws IOException {
		Document doc = Jsoup.connect("https://www.justinbartlettanimalrescue.org/animals/list?Species=Dog").get();
		Element table = doc.select("tbody").last(); // select the first table.
		String text = table.text();
		text = text.replace("General Sponsorship Option Dog - Terrier / Mixed ", "");
		text = text.replace(" / ", "/");
		text = text.replace(" Dog - ", "#");
		if (text.contains("Female")) {
			text = text.replace(" Female ", "@Female*\n");
		}
		if (text.contains("Male")) {
			text = text.replace(" Male ", "@Male*\n");
		}
		if (text.contains("adoption pending")) {
			text = text.replace(" (adoption pending)", "");
		}
		if (text.contains(" Female")) {
			text = text.replace(" Female", "@Female*\n");
		}
		if (text.contains(" Male")) {
			text = text.replace(" Male", "@Male*\n");
		}

		System.out.println(text);

		//david ! 134-148

		int firstPlace = 0;
		int lastPlace = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(c == '#') {
				firstPlace = lastPlace;
				lastPlace = i;
				String tempText = text.substring(firstPlace, lastPlace);
				System.out.println(tempText);
				if ((tempText).contains("Mixed")){
					text = text.replace(text.substring(firstPlace, tempText.indexOf(" ")), "");
				}
				//Ropie#Labrador Retriever/Mixed Roro#Terrier/Mixed@Female*

			}
		}
		String[] names;

		System.out.println(text);
		
		String currentName;
		int lNameLocation = 0;
		int fNameLocation = 0;
		int starLocation = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (text.charAt(i) == '*') {
				starLocation = i;
			}
			if (c == '#' && fNameLocation == 0) {
				fNameLocation = lNameLocation;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);

				fNameLocation = 1;
				
				//addName()
			} else if (c == '#') {
				fNameLocation = starLocation + 2;
				lNameLocation = i;

				currentName = text.substring(fNameLocation, lNameLocation);
				System.out.println(currentName);

			}

		
		}
		
	}

	public static void leg3() throws IOException {

	}
	

	public static void addDog(int dogID, String name, String breed, String gender, int shelterID) {
		
		
		if(shelterID == 1) {
			
			
			String query = "IF NOT EXISTS (SELECT * FROM aSecondChance WHERE dogName = '" + name + "')" + 
					"BEGIN" + 
					"INSERT INTO aSecondChance(ID,dogname,breed,gender) VALUES ('" + dogID + "',"+ "'" + name + "','" + breed + "','" + gender + "';"
					+ "END";
			
		}
		
		if(shelterID == 2) {
			
		}
		
		if(shelterID == 3) {
			
		}
		
	}
}

package Properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class GenerateProperties {
	final static String directory = System.getProperty("user.home");
	final static String folderName = ".test_for_properties";
	final static String archiveName = ".connectionDB";
	final static String url = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSSL=true";
	static String user;
	static String password;
	
	public static Properties createProperties() {		
		File folder = createFolder();
		setUserPassword();
		
		Properties properties = new Properties();
		properties.setProperty("db.url", url);
		properties.setProperty("db.user", user);
		properties.setProperty("db.password", password);
		
		File propertiesArchive = new File(folder, archiveName);
		
		try (FileWriter writer = new FileWriter(propertiesArchive)) {
			properties.store(writer, "Archive generate");
			System.out.println("Arquivo .properties oculted is created on: " + propertiesArchive.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("Error to generate properties");
			e.printStackTrace();
		}
		
		return properties;
	}
	
	public static File createFolder() {
		File folder = new File(directory, folderName);
		
		if(!folder.exists()) {
			folder.mkdirs();
			System.out.println("Folder is created on " + folder.getAbsolutePath());
			return folder;
		} else {
			System.out.println("This folder already exists!");
			return folder;
		}
	}
	
	public static void setUserPassword() {
		Scanner into = new Scanner(System.in);
		
		System.out.print("Creating .properties archive...\n"
				+ "Which user name of the DB? ");
		user = into.next();
		into.nextLine();
		
		System.out.print("Write your password: ");
		password = into.next();
		into.nextLine();
		
		into.close();
	}
	
	
}

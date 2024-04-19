package Properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

//	Veja a explicação da aula após o código abaixo...

public class GenerateProperties {
	//Abaixo estão variáveis responsáeis por dar nome ao nosso arquivo .properties
	//bem como a pasta onde ele será armazenado e aos valores que iremos armazenar
	//dentro dele...
	final static String directory = System.getProperty("user.home"); //referencia ao diretório de usuário...
	final static String folderName = ".test_for_properties"; //Esse será o nome da pasta oculta
	final static String archiveName = ".connectionDB"; //Esse será o nome do arquivo .properties oculto
	final static String url = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSSL=true"; //url do banco de dados...
	static String user; //login de acesso ao banco de dados...
	static String password; //senha de acesso
	
	//Esse método executa a lógica de criação do nosso arquivo ".properties"...
	public static Properties createProperties() {		
		File folder = createFolder(); //Armazenando informações da pasta que foi criada para guardar o arquivo...
		setUserPassword(); //Capturando o login e senha do usuário para poder armazenar...
		
		Properties properties = new Properties(); //Criado um objeto que irá gerar o arquivo ".properties"...
		properties.setProperty("db.url", url); //armazenando dados da url no objeto Properties...
		properties.setProperty("db.user", user); //armazenando dados do login no objeto Properties...
		properties.setProperty("db.password", password); //armazenando dados da senha no objeto Properties...
		
		File propertiesArchive = new File(folder, archiveName); //Gerando caminho de criação do arquivo .properties...
		
		try (FileWriter writer = new FileWriter(propertiesArchive)) { //Gerando objeto que irá armazenar o arquivo na pasta...
			properties.store(writer, "Archive generate"); //Armazenando arquivo na pasta e infomação adicional em forma de comentário no arquivo...
			System.out.println("Arquivo .properties oculted is created on: " + propertiesArchive.getAbsolutePath()); //Mostrando path do arquivo...
		} catch (IOException e) {
			System.out.println("Error to generate properties");
			e.printStackTrace();
		}
		
		return properties;
	}
	
	//Esse método executa a lógica de criação da nossa pasta oculta 
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
	
	//Esse método executa a lógica de captura o login e senha por parte do usuário...
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
	
	//Após isso vá até a classe "ConnectionWithDB para ver como fizemos para capturar
	//os valores a partir de um arquivo ".properties" e passar esses valores para o 
	//JDBC para acessarmos ao banco de dados e usarmos esses valores...
	
}

/*	PROPERTIES

	Nesta aula vamos aprender como o que são e como usar arquivos ".properties" pa-
	ra auxiliar na segurança das nossas aplicações quando lidamos com dados sensíve-
	is como informações de login e senha.
	
	Arquivos .properties são arquivos textuais que podem ser armazenados na nossa 
	própria máquina ou na máquina dos usuários para guardar informações importantes 
	como "login" e "senha" de aplicações. Geralmente esses arquivos ficam ocultos ou 
	armazenados dentro de uma pasta oculta na pasta padrão de usuários nos sistemas 
	operacionais, mas podemos escondê-la onde nós desejarmos.
	
	Arquivos .properties possuem uma estrutura chave valor (assim como o json) onde 
	armazenam informações importantes que podem ser resgatadas pela classe "Properti-
	es" de java.util.
	
	A sintaxe de um arquivo .properties é a seguinte...
	
		chave=valor
		
	Onde chave é o nome o identificador do valor que desejamos resgatar e valor é o
	próprio valor que será resgatado.
	
	Podemos colocar comentários também usando "#" da seguinte forma:
	
		#comentários...
		
	Qualquer texto que tiver uma linha como prefixo é um comentário.
	
	Veja no exemplo acima como usamos o java tanto para gerar um arquivo ".properti-
	es" como para escondê-lo dentro de uma pasta oculta e capturar os valores obti-
	dos a partir dele...

*/






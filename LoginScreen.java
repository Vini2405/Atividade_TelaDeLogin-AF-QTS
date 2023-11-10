import java.util.HashMap;
import java.util.Map;


// Classe onde irá efetuar uma autenticação simples, simulando uma autenticação com um banco de dados.
public class LoginScreen {	
	private Map<String, String> userDatabase;
	// Comando que irá criar um banco de dados simulado, onde será armazenado o usuário (username) e a senha (password).

	
	// Construtor da classe acima (Login Screen), onde é criado um hashmap responsável por simular o banco de dados e inserir duas entradas.
	 
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
/*
 * Método que faz a tentativa de login, usando o username e password informados pelo usuário.
 * @param username corresponde ao "username" (nome de usuário) informado pelo usuário que está tentando logar.
 * @param password corresponde a "password" (senha) informada pelo usuário que está tentando logar.
 * @return {@code true} caso a autenticação tenha sucesso, {@code false} caso o login fracasse.
 */
	public boolean login(String username, String password) {	
		if (userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true;// Login com sucesso
			}
		}
		return false;// Login fracassado
	}

	/*
	 * Adiciona um novo usuário ao "banco de dados". Destaca-se que esse método é apenas uma simplificação 
	 * de como um método de "cadastro" funcionaria. O uso do mesmo em projetos reais é contraindicado,
	 * já que ele não possuí as devidas medidas de segurança.
	 * @param username o username (nome de usuário) do usuário a ser criado.
	 * @param password a password (senha) do usuário a ser criado.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}
}

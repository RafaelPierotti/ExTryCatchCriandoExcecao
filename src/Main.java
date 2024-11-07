import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a senha do usuário: ");
        password = scanner.nextLine();

        if (password.length() < 8){
            throw new SenhaInvalidaException ("Senha precisa ter 8 caracteres");
        }

        try {

        }
    }
}
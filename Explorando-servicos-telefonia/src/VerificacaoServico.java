import java.util.Scanner;

public class VerificacaoServico {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Digite o nome do serviço a ser verificado (movel, fixa, banda larga, tv)");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite seu nome e os serviços contratados, separados por virgula");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String [] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        for (String verifica : partes) {
            if (verifica.equals(servico)) {
                contratado = true;
            }
        
        
        }
        System.out.println(retornar(contratado));
    
    
           
        // TODO: Verifique se o serviço está na lista de serviços contratados
    
    
        scanner.close();
    }
    public static String retornar (Boolean contratado){
        if (contratado == true)
            return "sim";
        else
            return "não";
    }    

}
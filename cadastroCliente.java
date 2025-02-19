
/**
 * Escreva uma descrição da classe CadastroCliente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class cadastroCliente
{
 private Cliente[] cadastroCliente;
 private int proximaPosicao;
 public int tamanho = 9;
    public cadastroCliente(int tamanho){
        cadastroCliente = new Cliente[tamanho];
        proximaPosicao = 0;
        }
    

     public Cliente[] getCadastro(){return cadastroCliente;}
 
     public boolean adicionaCliente(Cliente x) throws ArrayIndexOutOfBoundsException{
        if(proximaPosicao < cadastroCliente.length){
            cadastroCliente[proximaPosicao] = x;
            proximaPosicao++;
            return true;
        } else { return false; }        
        }
    
        public Cliente buscaClientepeloNome(String nome) throws ArrayIndexOutOfBoundsException{        
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroCliente[i].getNome().equals(nome)){
                return cadastroCliente[i];
            }
        }
        return null;        
    }
    
        public static String mostraCliente(Cliente x) throws ArrayIndexOutOfBoundsException{
        System.out.println("Os dados dos clientes são: ");
        for(int i = 0; i < 9; i++){
            System.out.println(toString(Cliente)); // corrige
            
        }
    }

}

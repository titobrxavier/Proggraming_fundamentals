
/**
 * Escreva uma descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Cliente
{
    private int matricula;
    private String nome;
    private String empresa;
    private Equipamento dados;
    
    public Cliente(int matricula, String nome, String empresa, Equipamento dados){
    this.matricula = matricula;
    this.nome = nome;
    this.empresa = empresa;
    this.dados = dados;
    }
    
    public int getMatricula(){ return matricula;}
    public String getNome(){ return nome;}
    public String getEmpresa(){ return empresa;}
    public Equipamento getDados(){ return dados;}
    
    public void setMatricula(int matricula){this.matricula = matricula;}
    public void setNome(String nome){this.nome = nome;}
    public void setEmpresa(String empresa){this.empresa = empresa;}
    public void setDados(Equipamento dados){this.dados = dados;}
    
    public String toString(){
        return "Mátricula: " + matricula +
        "\nNome: " + nome +
        "\nEmpresa: " + empresa + 
        "\nDados: " + dados;
    }
}

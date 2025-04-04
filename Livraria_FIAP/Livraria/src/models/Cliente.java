package models;

public class Cliente {

    private String nomeUsuario;
    private String loginUsuario;
    private int senhaUsuario;
    private long CPF;

    public Cliente() {
        //Construtor vazio, para que eu possa criar um Objeto cliente depois.
        //Faz com que eu não precise criar o models.Cliente com os dados da classe models.Cliente.
    }

    public Cliente(String nomeUsuario, String loginUsuario, int senhaUsuario, long CPF) {
        //Caso eu use esse construtor, Java me obriga a passar os dados quando criado um models.Cliente.
        this.nomeUsuario = nomeUsuario;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
        this.CPF = CPF;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuarioUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getLoginUsuario()  {
        return loginUsuario;
    }

    public int getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(int senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    //criando o toString
    public String toString() {
        return " nomeUsuario: " + nomeUsuario +
                "loginUsuario: " + loginUsuario +
                "senhaUsuario: " + senhaUsuario + 
                "CPF: " + CPF;
                
    }
}

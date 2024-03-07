package  Usuario;

public class Usuario {
    private String nome;
    private String telefone;
    private String cpf;
    private String email;


    // Construtor
    public Usuario(String nome, String telefone, String cpf, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }


    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


//     Método para validar CPF
//    public boolean validarCPF() {
//         Implemente a lógica de validação do CPF aqui
//         Retorne true se o CPF for válido, caso contrário, retorne false
//        return true;
//    }


}

package modelo;

import java.io.Serializable;


public class Contato implements Serializable{
	
	public Contato() {
		
		
	}
	
	private String nome;
	private String telefoneCelular;
	private String telefoneResid;
	private String dataNascimento;
	private String email;
	
	
	 public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getTelefoneCelular() {
	        return telefoneCelular;
	    }

	    public void setTelefoneCelular(String telefoneCelular) {
	        this.telefoneCelular = telefoneCelular;
	    }

	    public String getTelefoneResid() {
	        return telefoneResid;
	    }

	    public void setTelefoneResid(String telefoneResid) {
	        this.telefoneResid = telefoneResid;
	    }

	    public String getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

}

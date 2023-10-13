package modelo;

import java.util.ArrayList;

public class BancoContato {

	private ArrayList<Contato> contatos;
    private static BancoContato instancia;

    private BancoContato() {
        contatos = new ArrayList<>();
    }
    
    public static synchronized BancoContato getInstancia() {
        if (instancia == null) {
            instancia = new BancoContato();
        }
        return instancia;
    }
	
    public ArrayList<Contato> listarContatos() {
        return contatos;
    }

    public void adicionarContato(Contato contato) {
    	System.out.println(contato.getNome());
        contatos.add(contato);
    }

   
    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
        	System.out.println(contato.getNome() + " aqui em buscar");
            if (contato.getNome().equals(nome)) {
                return contato; 
            }
        }
        return null; 
    }
    
    public boolean excluirContatoPorNome(String nome) {
        Contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contatos.remove(contato); 
            return true;
        }
        return false; 
    }
    
}

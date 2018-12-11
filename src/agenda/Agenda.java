package agenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {
	
	Set<Contato> Agenda = new HashSet<Contato>();
	
	
	
	public ArrayList<Contato> converterHashSet(Set<Contato> Agenda){
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		for (Contato contato : contatos) {
			
			contatos.add(contato);
		}
		
		return contatos;
		
	}
	
	public void ordenaNome() {
		
		ComparadorNome compara = new ComparadorNome();
		List <Contato> lista =  converterHashSet(Agenda);
		lista.addAll(Agenda);
		Collections.sort(lista, compara);
		for (Contato contato : lista) {
			
			System.out.println(contato);
			
		}
		
	}
	
	public void ordenaId() {
		
		ComparadorNome compara = new ComparadorNome();
		List <Contato> lista =  converterHashSet(Agenda);
		lista.addAll(Agenda);
		Collections.sort(lista, compara);
		for (Contato contato : lista) {
			
			System.out.println(contato);
			
		}
		
	}
	
	public void atualizarNome(int id,String Nome){
		

			Contato c = buscaContato(id);
			c.setNome(Nome);
		
		
	}
	
	public void atualizarTelefone(int id,String Telefone){
		

		Contato c = buscaContato(id);
		c.setNome(Telefone);
	
	
	}
	public void atualizarEmail(int id,String Email){
		

		Contato c = buscaContato(id);
		c.setNome(Email);
	
	
	}
	
	public Contato buscaContato(int id){
		
		for (Contato contato : Agenda) {
			
			if(contato.getId()==id) {
				
				return contato;
				
			}

		}
		return null;
		
	}
	
	
	/*public void atualizar(int id,String Nome){
		
		try {
			Contato c = buscaContato(id);
			c.setNome(Nome);
		} catch (ContatoNotFoudException e) {
			
			System.out.println(e);
		}
		
	}
	
	public Contato buscaContato(int id) throws ContatoNotFoudException{
		
		for (Contato contato : Agenda) {
			
			if(contato.getId()==id) {
				
				return contato;
				
			}
			else {
				
				throw new ContatoNotFoudException("Contato não encontrado");
				
			}
			
		}
		return null;
		
		
	}*/
	
	public void removerContato(Contato c){
		
		try {
			excluir(c);
		}catch (ContatoNotFoudException e) {
			
			System.out.println(e);
		}
		
	}
	
	public void excluir(Contato c) throws ContatoNotFoudException{
		
		if(Agenda.remove(c)==false){
			
			throw new ContatoNotFoudException("Contato Não Existe");
			
		}
		else{
			
			System.out.println("Contato Removido Com Sucesso");
			
		}
		
	}
	
	public void adicionar(Contato c){
		
		Agenda.add(c);
		
	}
	
	public void listar(){
				
		
		for (Contato contato : Agenda) {
			
			System.out.println(contato);
			
		}
		
	}

}

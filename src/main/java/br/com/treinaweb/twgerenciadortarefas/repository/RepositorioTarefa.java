package br.com.treinaweb.twgerenciadortarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.treinaweb.twgerenciadortarefas.models.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {
	
	
}

package sistema.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sistema.modelos.Professor;

public class ProfessorService {

	private ArrayList <Professor> professores = new ArrayList();
	
	public ProfessorService()
	{

	}
	
	public void salvar(Professor professor)
	{
		professores.add(professor);
	}
	

	public List <Professor> getProfessores()
	{
		
		return professores;
		
	}
	
	
}

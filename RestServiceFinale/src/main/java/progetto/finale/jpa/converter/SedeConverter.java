package progetto.finale.jpa.converter;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import progetto.finale.jpa.entity.Sede;
import progetto.finale.jpa.dto.SedeDTO;

@Component
public class SedeConverter {

	
	public SedeDTO entityToDto(Sede sede) {
		
		SedeDTO dto = new SedeDTO();
		dto.
		dto.setName(student.getName());
		dto.setUsename(student.getUsername());
		dto.setPassword(student.getPassword());
		
		return dto;
	}
	public  List<StudentDto> entityToDto(List<Student> student) {
		
		return	student.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
		
	}
	
	
	public Student dtoToEntity(StudentDto dto)
	{
		Student st = new Student();
		st.setId(dto.getId());
		st.setName(dto.getName());
		st.setPassword(dto.getPassword());
		st.setUsername(dto.getUsename());
		
		return st;
	}
	
	public List<Student> dtoToEntity(List<StudentDto> dto)
	{

		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
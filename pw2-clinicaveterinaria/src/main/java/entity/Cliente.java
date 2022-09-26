package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "Cliente")
public class Cliente {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "IDTUTOR")
	@Id
	private int IDTUTOR;
    
    @Column (name = "NOME_TUTOR")
    private String NOME_TUTOR;
    
    @Column (name = "CELULAR_TUTOR")
    private String CELULAR_TUTOR;
    
    @Column (name = "CPF_TUTOR")
    private String CPF_TUTOR;
    
    
}

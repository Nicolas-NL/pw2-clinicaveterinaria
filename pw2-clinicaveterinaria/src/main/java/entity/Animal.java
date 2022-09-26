package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Enums.TipoAnimalEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ANIMAL")
public class Animal {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "IDANIMAL")
	@Id
	private int IDANIMAL;
    
    @Column (name = "NOME_ANIMAL")
    private String NOME_ANIMAL;
    
    @Enumerated(EnumType.STRING)
    @Column (name = "TIPO")
    private TipoAnimalEnum TIPO;
    
    @Column (name = "RACA_ANIMAL")
    private String RACA_ANIMAL;
    
    @Column (name = "PESO ")
    private float PESO;
    
    @OneToMany
    @JoinColumn (name = "Cliente")
    private int DONO;
}

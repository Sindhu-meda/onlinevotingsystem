package com.cg.society.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="nominated_tbl")
public class NominatedCandidate
{
	@OneToOne(targetEntity=VotedList.class,cascade=CascadeType.ALL)
	private VotedList vote;
    @Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
    //@Column(name="candidateid")
	private int candidateid;
    
   @Column(name="nominationformno")
 

	@NotNull
	//@Pattern(regexp = "[a-z][A-Z][0-9]!@#{8}")
	private String nominationFormNo;
//   @OneToOne(targetEntity=VotedList.class,cascade=CascadeType.ALL)
//   @JoinColumn(name="NcVl_fk",referencedColumnName="id")
    
} 
//	@OneToMany(targetEntity=RegisteredSocietyVoters.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="NcRs_fk",referencedColumnName="id")
//	private List<RegisteredSocietyVoters> cast;
	
	


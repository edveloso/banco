package br.com.edveloso.banco;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BIDDERS")
@DiscriminatorValue("B")
public class Bidder extends User{
	
	private Long bid;

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}
	 

}

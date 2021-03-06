package entita;

import java.sql.Date;

public class Offerta {

	private String codice;
	private String nome;
	private String descrizione;
	private Date dataInizio;
	private Date dataFine;
	private int percentualeSconto;
	private String nomeParco;
	private String nomeAttivita;
	
	public Offerta(String codice, String nome, String descrizione, Date dataInizio, Date dataFine,
			int percentualeSconto, String nomeParco, String nomeAttivita) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.percentualeSconto = percentualeSconto;
		this.nomeParco = nomeParco;
		this.nomeAttivita = nomeAttivita;
	}
	public String getCodice() {
		return codice;
	}
	public String getNome() {
		return nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public int getPercentualeSconto() {
		return percentualeSconto;
	}
	public String getNomeParco() {
		return nomeParco;
	}
	public String getNomeAttivita() {
		return nomeAttivita;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	public void setPercentualeSconto(int percentualeSconto) {
		this.percentualeSconto = percentualeSconto;
	}
	public void setNomeParco(String nomeParco) {
		this.nomeParco = nomeParco;
	}
	public void setNomeAttivita(String nomeAttivita) {
		this.nomeAttivita = nomeAttivita;
	}
	
	@Override
	public String toString() {
		return codice + ", " + nome + ", " + descrizione + ", " + dataInizio + ", " + dataFine + ", "
				+ percentualeSconto + ", " + nomeParco + ", " + nomeAttivita;
	}
	
}
package br.com.quintoads.imoveis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Vendedor")
public class Vendedor {
	
	@Id
	private int cdVendedor;

	@NotNull
	@Column(name = "nmVendedor")
	private String nmVendedor;

	@Column(name = "nmEndereco")
	private String nmEndereco;

	@Column(name = "nrCpf")
	private String nrCpf;
	
	@Column(name = "telVendedor")
	private String telVendedor;
	
	@Column(name = "dtNascimento")
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	
	@ManyToOne
	@JoinColumn(name = "cdBairro")
	private Bairro bairro;

	public Vendedor() {	}

	public Vendedor(int cdVendedor, @NotNull String nmVendedor, String nmEndereco, String nrCpf, String telVendedor,
			Date dtNascimento) {
		this.cdVendedor = cdVendedor;
		this.nmVendedor = nmVendedor;
		this.nmEndereco = nmEndereco;
		this.nrCpf = nrCpf;
		this.telVendedor = telVendedor;
		this.dtNascimento = dtNascimento;
	}

	public int getCdVendedor() {
		return cdVendedor;
	}

	public void setCdVendedor(int cdVendedor) {
		this.cdVendedor = cdVendedor;
	}

	public String getNmVendedor() {
		return nmVendedor;
	}

	public void setNmVendedor(String nmVendedor) {
		this.nmVendedor = nmVendedor;
	}

	public String getNmEndereco() {
		return nmEndereco;
	}

	public void setNmEndereco(String nmEndereco) {
		this.nmEndereco = nmEndereco;
	}

	public String getNrCpf() {
		return nrCpf;
	}

	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
	}

	public String getTelVendedor() {
		return telVendedor;
	}

	public void setTelVendedor(String telVendedor) {
		this.telVendedor = telVendedor;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public Bairro getBairro() {
		return this.bairro;
	}
	
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "{cdVendedor:" + cdVendedor + ",\n nmVendedor:" + nmVendedor + ",\n nmEndereco:" + nmEndereco
				+ ",\n nrCpf:" + nrCpf + ",\n telVendedor:" + telVendedor + ",\n dtNascimento:" + dtNascimento
				+ ",\n bairro:" + bairro.toString() + " }";
	}


}

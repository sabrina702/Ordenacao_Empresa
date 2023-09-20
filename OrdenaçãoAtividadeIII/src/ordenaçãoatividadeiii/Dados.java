/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaçãoatividadeiii;

/**
 *
 * @author Lenovo
 */
public class Dados implements Comparable<Dados>{
    private int classificacao;
    private String empresa;
    private String mercado;
    private String receita;
    private String funcionario; 
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    
    @Override
    public int compareTo(Dados outroDado) {
        return Integer.compare(this.classificacao, outroDado.classificacao);
    }
    
    @Override
    public String toString(){
        return getEmpresa()+ " : " + getEmpresa();
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return empresa.equals(dados.empresa);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author DiogoGuilhermeMarcioVictor
 */
public class Hospede extends Pessoa{
    private String cpf;
    private double taxaDesconto;
    
    private ArrayList<Registro> registros;
    
    public Hospede(String cpf, String nome) {
        super(nome);
        
        this.cpf = cpf;
        registros = new ArrayList<Registro>();
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }
    
    public void addRegistro(Registro reg){
        registros.add(reg);
        reg.setHospede(this);
    }
    
    public ArrayList<Registro> getRegistros(){
        return this.registros;
    }
    
    public static boolean validarCPF(String cpf){
        String cleanCpf = cpf.replace("-", "").replace(".","");
        
        int sum1 = 0;
        int sum2 = 0;
        int dig1 = 0;
        int dig2 = 0;
        
        if(cleanCpf.length() != 11) return false;
        for(int i=0;i<9;i++){
            sum1 += Integer.valueOf(cleanCpf.substring(i, i+1)).intValue()*(i+1);
            sum2 += Integer.valueOf(cleanCpf.substring(i, i+1)).intValue()*(11-i);
        }
        
        dig1 = sum1 % 11;
        if (dig1 == 10) dig1 = 0;
        
        sum2 += dig1 * 2;
        dig2 = (sum2*10) % 11;
        if (dig2 == 10) dig2 = 0;

        if(dig1 != Integer.valueOf(cleanCpf.substring(9, 10)).intValue()){
            return false;
        }
        if(dig2 != Integer.valueOf(cleanCpf.substring(10, 11)).intValue()){
            return false;
        }
        return true;
    }
}

package com.deitel;

public class Fatura {

    private String num;
    private String desc;
    private Integer quant;
    private Double val;

    public Fatura(String num, String desc, Integer quant, Double val) {
        this.num = num;
        this.desc = desc;
        this.quant = quant;
        this.val = val;
    }

    public Double getTotalFatura() {
        Double total = this.quant * this.val ;
        if (total < 0) {
            total = 0.0;
        } 
        return total;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }
    
}

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Invoice {
    private String partNum;
    private String partDesc;
    private int quantity;
    private double price;

    public Invoice (String partNum, String partDesc, int quantity, double price)
    {
        this.partNum = partNum;
        this.partDesc = partDesc;
        if (quantity > 0)
        {
            this.quantity = quantity;
        }
        else {
            this.quantity = 0;
        }

        if (price > 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 0.0;
        }

    }

    public String  getPartNum() {
        return partNum;
    }
    public void setPartNum (String partNum)
    {
        this.partNum = partNum;
    }

    public String getPartDesc () {
        return  partDesc;
    }
    public void setPartDesc(String partDesc){
        this.partDesc = partDesc;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity > 0 ){
            this.quantity = quantity;
        }
        else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price)
    {
        if (price > 0)
        {
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }

}

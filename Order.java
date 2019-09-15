package com.codecool.uml.overriding;

public class Order implements Orderable {

    private int id;
    private String status = "new";

    public Order() {
        id++;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
        if (this.status.equals("new")) {
            this.status = "checked";
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay() {
        if (this.status.equals("checked")) {
            this.status = "paid";
            return true;
        } else {
            return false;
        }
    }
}

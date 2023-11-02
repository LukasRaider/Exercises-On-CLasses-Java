

class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "Id = " + id + ", desc = " + desc + ", qty = " + qty + ", unitPrice = " + unitPrice;
    }
}

class TestInvoiceItem {

    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("1", "fruit", 15, 45);
        System.out.println(i1.toString());
        i1.setUnitPrice(30);
        System.out.println("Total price " + i1.getTotal());

        InvoiceItem i2 = new InvoiceItem("2", "meat", 2, 300);
        System.out.println(i2.toString());
        System.out.println("Total price " + i2.getTotal());

        i2.setUnitPrice(100);
        i2.setQty(50);
        System.out.println("Total price " + i2.getTotal());
        System.out.println(i2.toString());
    }
}

package com.trail.trailv1.Entity;

import javax.persistence.*;
import java.util.List;

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="itemId")
    private Integer itemId;

    @Column(name="itemName")
    private String itemName;

    @Column(name="itemDesc")
    private String itemDesc;

    @Column(name="basePrice")
    private int basePrice;

    @Column(name="sellingPrice")
    private int sellingPrice;

    @ManyToOne
    @JoinColumn(name="ownerId",referencedColumnName = "userId",foreignKey = @ForeignKey(name = "userId"))
    List<User> ownerId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public List<User> getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(List<User> ownerId) {
        this.ownerId = ownerId;
    }
}

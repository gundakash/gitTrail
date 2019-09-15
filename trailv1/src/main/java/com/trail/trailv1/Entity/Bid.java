package com.trail.trailv1.Entity;

import javax.persistence.*;

@Table(name="bidTable")
@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer bidId;

    @ManyToMany
    @JoinColumn(name="item", referencedColumnName = "itemId" ,foreignKey = @ForeignKey(name="itemId"))
    Item item;

    @ManyToMany
    @JoinColumn(name="user",referencedColumnName = "userId", foreignKey  =@ForeignKey(name="userId"))
    User user;

    @Column(name="bidAmount")
    int bidAmount;

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

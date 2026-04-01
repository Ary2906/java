package org.internship.relationship;

class Product {
    int id;
    Product(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Product ID: " + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        return this.id == ((Product) obj).id;
    }
}
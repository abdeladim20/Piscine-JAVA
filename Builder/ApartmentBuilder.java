class ApartmentBuilder implements HousingBuilder {
    private Apartment apartment;

    public ApartmentBuilder() {
        this.apartment = new Apartment();
    }

    public HousingBuilder setSize(int size) {
        apartment.setSize(size);
        return this;
    }

    public HousingBuilder setPrice(int price) {
        apartment.setPrice(price);
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        apartment.setRooms(rooms);
        return this;
    }

    public HousingBuilder setName(String name) {
        apartment.setName(name);
        return this;
    }

    public Housing build() {
        return apartment;
    }
}
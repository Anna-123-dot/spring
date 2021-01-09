package com.sda.spring.person;

public class Dom {
    private int id = 4;

    private PersonInt personInt;



    public void setPerson(PersonInt personInt) {
        this.personInt = personInt;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "id=" + id +
                ", person.properities=" + personInt +
                '}';
    }
}

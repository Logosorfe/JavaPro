package com.telran.prof.lessonten;

public class Cat {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        //1
        if (this == obj) return true;
        //2
        if (obj == null) return false;
        //3
        if (!(obj instanceof Cat)) return false;
        //4
        Cat cat = (Cat) obj;

        if(this.age != cat.age) return false;

        if (this.name == null) return cat.name == null;

        return this.name.equals(cat.name);
    }

}

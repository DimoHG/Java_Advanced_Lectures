package com.softuni;

import java.io.Serializable;

@Subject(categories ={"Reflection", "Annotation"})
public class Example implements Serializable {

    private static final String nickName = "Pinguin";
    public String name;
    protected String webAddress;
    String email;
    private int zip;

    public Example() {
        this.setName("Java");
        this.setWebAddress("oracle.com");
        this.setEmail("mail@oracle.com");
        this.setZip(1407);
    }

    private Example(String name, String webAddress, String email) {
        this.setName(name);
        this.setWebAddress(webAddress);
        this.setEmail(email);
        this.setZip(2300);
    }
    protected Example(String name, String webAddress, String email, int zip) {
        this.setName(name);
        this.setWebAddress(webAddress);
        this.setEmail(email);
        this.setZip(2300);
    }
    @Author(name = "Dimo")
    public String print(String something){
        System.out.println(something);
        return "Pesho";
    }
    @Author(name = "Dimo")
    public static void something(){

    }

    @Author(name = "Miroslav")
    public final String getName() {
        return name;
    }

    @Author(name = "Aleksandar")
    private void setName(String name) {
        this.name = name;
    }

    @Author(name = "Petar")
    protected String getWebAddress() {
        return webAddress;
    }

    @Author(name = "Borislaw")
    private void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    @Author(name = "Stoyan")
    public String getEmail() {
        return email;
    }

    @Author(name = "Жулиян")
    public void setEmail(String email) {
        this.email = email;
    }

    protected final int getZip() {
        return zip;
    }

    private void setZip(int zip) {
        this.zip = zip;
    }

    public String toString() {
        String result = "Name: " + getName() + "\n";
        result += "WebAddress: " + getWebAddress() + "\n";
        result += "email: " + getEmail() + "\n";
        result += "zip: " + getZip() + "\n";
        return result;
    }
}

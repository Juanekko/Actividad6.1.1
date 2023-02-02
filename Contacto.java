public class Contacto {
    private String name;
    private String phonenumber;
    public Contacto(String name,String phonenumber){
        this.name=name;
        this.phonenumber=phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static Contacto creatContact(String name,String phonenumber){
        Contacto c=new Contacto(name,phonenumber);
        return c;
    }
}

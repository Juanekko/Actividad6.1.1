import java.util.ArrayList;

public class TelefonoMovil {
    private ArrayList<Contacto>myContacts=new ArrayList<Contacto>();
    public TelefonoMovil(){
    }
    public boolean addNewContact(Contacto contacto){
        if (myContacts.contains(contacto)){
            return false;
        }
        else{
            myContacts.add(contacto);
            return true;
        }
    }
    public  boolean updateContact(Contacto contAnt,Contacto contNew){
        int ind=myContacts.indexOf(contAnt);
        if (ind>=0){
            myContacts.set(ind,contNew);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contacto contact){
        int ind=myContacts.indexOf(contact);
        if (ind>=0){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    public int findContact(Contacto contacto){
        if (myContacts.contains(contacto)){
            return myContacts.indexOf(contacto);
        }
        else return -1;
    }
    public boolean findContact(String name){
        int ind=myContacts.indexOf(name);
        if (ind>=0){
            myContacts.get(ind);
            return true;
        }
        return false;
    }
    public Contacto queryContact(String name){
        int ind=myContacts.indexOf(name);
        if (ind>=0){
            return myContacts.get(ind);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Tienes "+myContacts.size()+"contactos");
        for (Contacto myContact : myContacts) {
            System.out.println(myContact);
        }
    }
}

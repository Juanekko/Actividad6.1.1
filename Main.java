import java.util.Scanner;

public class Main {
    private static final Scanner sc=new Scanner(System.in);
    private static final TelefonoMovil tlmov=new TelefonoMovil();
    public static void menu(){
        System.out.println("0 - Para salir");
        System.out.println("1 - Para imprimir contactos");
        System.out.println("2 - Para añadir contacto");
        System.out.println("3 - Para modificar contacto");
        System.out.println("4 - Para eliminar contacato");
        System.out.println("5 - Para buscar contacto");
        System.out.println("6 - Para mostrar opciones");
    }
    public static void addContact(){
        System.out.println("introduzca el contacto");
        Contacto cont=new Contacto(sc.nextLine(), sc.nextLine());
        tlmov.addNewContact(cont);
    }
    public static void modyfycontact(){
        System.out.println("Introduce contacto antiguo");
        Contacto contant=new Contacto(sc.nextLine(), sc.nextLine());
        System.out.println("Introduce el nuevo nuevo contacto");
        Contacto contnew=new Contacto(sc.nextLine(), sc.nextLine());
        tlmov.updateContact(contant,contnew);
    }
    public static void deletecontact(){
        System.out.println("Introduce el contacto que desea eliminar");
        Contacto cnt=new Contacto(sc.nextLine(), sc.nextLine());
        tlmov.removeContact(cnt);
    }
    public static void findContact(){
        System.out.println("Introduce el nombre");
        String name= sc.nextLine();
        tlmov.queryContact(name);
    }
    public static void main(String[]arg){
        boolean next=true;
        int opc=0;
        menu();
        while (next){
            System.out.println("Elige la opción");
            opc=sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 0:
                    next=false;
                    break;
                case 1:
                    tlmov.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modyfycontact();
                    break;
                case 4:
                    deletecontact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    menu();
                    break;
            }
        }
    }
}

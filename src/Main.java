import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        cliente clientes[]  = new cliente[100];
        monitor  monitors[] = new monitor[20];
        limpiador  limpiadors[] = new limpiador[10];
        actividades  actividadess[] = new actividades[4];

        //monitores
            monitor mon1 = new monitor();
            monitors[0]=mon1;

            monitor mon2 = new monitor();
            monitors[1]=mon2;

            monitor mon3 = new monitor();
            monitors[2]=mon3;

            monitor mon4 = new monitor();
            monitors[3]=mon4;

            //limpiador
        limpiador limp1 = new limpiador();
        limpiadors[0] = limp1;

        limpiador limp2 = new limpiador();
        limpiadors[1] = limp2;

        limpiador limp3 = new limpiador();
        limpiadors[2] = limp3;

        limpiador limp4 = new limpiador();
        limpiadors[3] = limp4;

        //cliente
        cliente cli1 = new cliente();
        clientes[0] = cli1;
        cliente cli2 = new cliente();
        clientes[1] = cli2;
        cliente cli3 = new cliente();
        clientes[2] = cli3;
        cliente cli4 = new cliente();
        clientes[3] = cli4;
        //actividades
        actividades act1 = new actividades();
        actividadess[0] = act1;
        actividades act2 = new actividades();
        actividadess[1] = act2;
        actividades act3 = new actividades();
        actividadess[2] = act3;
        actividades act4 = new actividades();
        actividadess[3] = act4;





        //monitor1
        monitors[0].setNombre("carlo"); monitors[0].setDNI("2b");monitors[0].setSueldo_base(2000);monitors[0].setTarifaporactividad(22);
        //monitor2
        monitors[1].setNombre("alber");monitors[1].setDNI("3c");monitors[1].setSueldo_base(3000);monitors[1].setTarifaporactividad(23);

        //limpiador1
        limpiadors[0].setNombre("susana"); limpiadors[0].setDNI("2b");limpiadors[0].setSueldo_base(1000);limpiadors[0].setTarifaporcliente(22);
        //limpiador2
        limpiadors[1].setNombre("Alex");limpiadors[1].setDNI("3c");limpiadors[1].setSueldo_base(4267);limpiadors[1].setTarifaporcliente(25);
        //limpiador2
        limpiadors[2].setNombre("Cristian");limpiadors[2].setDNI("4d");limpiadors[2].setSueldo_base(982);limpiadors[2].setTarifaporcliente(30);


        //cliente1
        clientes[0].setNombre("Alejandra"); clientes[0].setDNI("9j");clientes[0].setDinero(2212);
        //cliente2
        clientes[1].setNombre("Adrian"); clientes[1].setDNI("23232l");clientes[1].setDinero(4242);
        //cliente3
        clientes[2].setNombre("Manuel"); clientes[2].setDNI("12i");clientes[2].setDinero(566);
        //cliente4
        clientes[3].setNombre("Pedro"); clientes[3].setDNI("18k");clientes[3].setDinero(123);

        //actividad1
        actividadess[0].setNombre("Bodypump");actividadess[0].setPrecio(200);actividadess[0].setMaximoClientesPermitidas(30);actividadess[0].setMonitorenc(null);
        //actividad1
        actividadess[1].setNombre("Bodypump");actividadess[1].setPrecio(200);actividadess[1].setMaximoClientesPermitidas(30);actividadess[1].setMonitorenc(null);
        //actividad1
        actividadess[2].setNombre("Bodypump");actividadess[2].setPrecio(200);actividadess[2].setMaximoClientesPermitidas(30);actividadess[2].setMonitorenc(null);
        //actividad1
        actividadess[3].setNombre("Bodypump");actividadess[3].setPrecio(200);actividadess[3].setMaximoClientesPermitidas(30);actividadess[3].setMonitorenc(null);

        do {
            System.out.println("**** GIMNASIO LAS ENCINAS ****");
            System.out.println("1.- Mostrar monitores y limpiadores, o solo clientes");
            System.out.println("2.- Asociar monitor a una actividad");
            System.out.println("3.- Matricular Cliente a una actividad");
            System.out.println("4.- Mostrar dinero acumulado de cada limpiador");
            System.out.println("5.- Eliminar una actividad");
            System.out.println("6.- Mostrar una lista de actividades");
            System.out.println("7.- Salir");
            System.out.print(": ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    int submenu;
                    System.out.println("Mostrar monitores y limpiadores = 1, solo clientes = 2");
                    submenu = sc.nextInt();

                    if (submenu == 1) {
                        int h = 0, j = 0;
                        System.out.println("Monitores --> ");
                        for (int i = 0; i < 2; i++) {

                            System.out.println("Monitor -- " + monitors[i].getNombre() + " DNI: " + monitors[i].getDNI() + " sueldo base: " + monitors[i].getSueldo_base() + " tarifa por actividad: " + monitors[i].getTarifaporactividad());

                        }
                        System.out.println("\nLimpiadores --> ");
                        for (int i = 0; i < 3; i++) {

                            System.out.println("Limpiador -- " + limpiadors[i].getNombre() + " DNI: " + limpiadors[i].getDNI() + " sueldo base: " + limpiadors[i].getSueldo_base() + " tarifa por actividad: " + limpiadors[i].getTarifaporcliente());

                        }
                        System.out.println("\n");

                    } else if (submenu == 2) {
                        System.out.println("Clientes-- ");
                        for (int i = 0; i < 4; i++) {
                            System.out.println(clientes[i].getNombre() + " DNI " + clientes[i].getDNI() + " ,dinero: " + clientes[i].getDinero() + "Actividades " + clientes[i].getActividad());

                        }
                    }

                    break;
                case 2:
                    sc.nextLine();
                    String nwdni;
                    String xd = " ";
                    int actividad;
                    do {


                        System.out.println("Dame el dni del monitor");
                        nwdni = sc.nextLine();
                        if (!(nwdni.equals(monitors[0].getDNI()) || nwdni.equals(monitors[1].getDNI()))) {
                            System.out.println("Este dni no corresponde con ningun monitor");
                        }
                    } while (!(nwdni.equals(monitors[0].getDNI()) || nwdni.equals(monitors[1].getDNI())));

                    actividadess[0].mostraractividades();
                    actividad = sc.nextInt();

                    if (actividad == 1) {
                        xd = "BODYPUMP";

                    } else if (actividad == 2) {
                        xd = "CROSSFIT";
                    } else if (actividad == 3) {
                        xd = "LIBRE";
                    } else if (actividad == 4) {
                        xd = "NATACION";
                    }

                    for (int i = 0; i < 2; i++) {
                        if (nwdni.equals(monitors[i].getDNI())) {

                            if (actividadess[actividad - 1].getMonitorenc() == null) {
                                actividadess[actividad - 1].setMonitorenc(xd);

                            } else {
                                System.out.println("La actividad ya tiene monitor");
                            }


                        }


                    }


                    break;
                case 3:

                    sc.nextLine();
                    String nwdni2;

                    do {
                        System.out.println("Dame el dni del monitor");
                        nwdni2 = sc.nextLine();
                        if ((nwdni2.equals(clientes[0].getDNI()) || nwdni2.equals(clientes[1].getDNI()) || nwdni2.equals(clientes[2].getDNI()) || nwdni2.equals(clientes[3].getDNI()))) {
                            System.out.println("Este dni no corresponde con ningun monitor");
                        }
                    } while (!(nwdni2.equals(clientes[0].getDNI()) || nwdni2.equals(clientes[1].getDNI()) || nwdni2.equals(clientes[2].getDNI()) || nwdni2.equals(clientes[3].getDNI())));
                    actividadess[0].mostraractividades();
                    actividad = sc.nextInt();

                    if (actividad == 1) {
                        xd = "BODYPUMP";

                    } else if (actividad == 2) {
                        xd = "CROSSFIT";
                    } else if (actividad == 3) {
                        xd = "LIBRE";
                    } else if (actividad == 4) {
                        xd = "NATACION";
                    }

                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {



                        }
                    }
            break;





                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Hasta pronto");
                    break;


            }






        }while (menu != 7);





    }
}
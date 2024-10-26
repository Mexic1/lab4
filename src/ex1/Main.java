package ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\cmora\\Desktop\\Faculta\\Anul3\\Sem1\\PJ\\lab4\\src\\ex1\\echipamente"));
        List<String> items = new ArrayList<>();
        List<echipamente> echip = new ArrayList<>();


        while(sc.hasNextLine())
        {
            items=List.of(sc.nextLine().split(";"));
            if(items.get(5).equals("sistem de calcul"))
            {
                echip.add(new sistem(items.get(0),Integer.parseInt(items.get(1)),Integer.parseInt(items.get(2)),items.get(3),items.get(4),items.get(5),items.get(6),Double.parseDouble(items.get(7)),Integer.parseInt(items.get(8)), items.get(9)));
            }
            else if(items.get(5).equals("imprimanta"))
            {
                echip.add(new Imprimante(items.get(0),Integer.parseInt(items.get(1)),Integer.parseInt(items.get(2)),items.get(3),items.get(4),items.get(5),Integer.parseInt(items.get(6)),items.get(7),Integer.parseInt(items.get(8)),items.get(9)));
            }
            else if(items.get(5).equals("copiator"))
            {
                echip.add(new Copiatoare(items.get(0),Integer.parseInt(items.get(1)),Integer.parseInt(items.get(2)),items.get(3),items.get(4),items.get(5),Integer.parseInt(items.get(6)),items.get(7)));
            }
        }
        sc.close();

        Scanner sc1=new Scanner(System.in);
        int optiune;

        while(true)
        {
            System.out.println("\n");
            System.out.println("1. Afisarea tuturor echipamentelor");
            System.out.println("2. Afisarea imprimantelor");
            System.out.println("3. Afisarea copiatoarelor");
            System.out.println("4. Afisarea sistemelor de calcul");
            System.out.println("5. Modificarea starii in care se afla un obiect");
            System.out.println("6. Setarea unui anumit mod de scriere pentru o imprimanta");
            System.out.println("7. Setarea unui format de copiere pentru copiatoare");
            System.out.println("8. Instalarea unui anumit sistem de operare pe un sistem de calcul ");
            System.out.println("9. Afişarea echipamentelor vândute ");
            System.out.println("10.Să se realizeze două metode statice pentru serializarea / deserializarea colecției de\n" +
                                    "obiecte în fișierul echip.bin  ");
            System.out.println("0. Iesire");
            System.out.println("Introduceti optiunea dorita: ");
            optiune = sc1.nextInt();

            switch (optiune)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Afisarea tuturor echipamentelor");
                    for(echipamente e:echip)
                    {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("Afisarea imprimantelor");
                    for(echipamente e:echip)
                    {
                        if(e instanceof Imprimante)
                        {
                            System.out.println(e);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Afisarea copiatoarelor");
                    for(echipamente e:echip)
                    {
                        if(e instanceof Copiatoare)
                        {
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Afisarea sistemelor de calcul");
                    for(echipamente e:echip)
                    {
                        if(e instanceof sistem)
                        {
                            System.out.println(e);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Modificarea starii in care se afla un obiect");
                    System.out.println("Introduceti numele echipamentului: ");
                    String nume=sc1.next();
                    System.out.println("Introduceti noua situatie: ");
                    String situatie=sc1.next();
                    for(echipamente e:echip)
                    {
                        if(Objects.equals(e.getNume(), nume))
                        {
                            e.setSituatie(situatie);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Setarea unui anumit mod de scriere pentru o imprimanta");
                    System.out.println("Introduceti numele imprimantei: ");
                    String nume1=sc1.next();
                    System.out.println("Introduceti modul de scriere: ");
                    String mod_scriere=sc1.next();
                    for(echipamente e:echip)
                    {
                        if(e instanceof Imprimante)
                        {
                            if(Objects.equals(e.getNume(), nume1))
                            {
                                ((Imprimante) e).setcolor(mod_scriere);
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Setarea unui format de copiere pentru copiatoare");
                    System.out.println("Introduceti numele copiatorului: ");
                    String nume2=sc1.next();
                    System.out.println("Introduceti modul de scriere: ");
                    String format=sc1.next();
                    for(echipamente e:echip)
                    {
                        if(e instanceof Copiatoare)
                        {
                            if(Objects.equals(e.getNume(), nume2))
                            {
                                ((Copiatoare) e).setFormat(format);
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.println("Instalarea unui anumit sistem de operare pe un sistem de calcul");
                    System.out.println("Introduceti numele sistemului de calcul: ");
                    String nume3=sc1.next();
                    System.out.println("Introduceti sistemul de operare: ");
                    String sys_op=sc1.next();
                    for(echipamente e:echip)
                    {
                        if(e instanceof sistem)
                        {
                            if(Objects.equals(e.getNume(), nume3))
                            {
                                ((sistem) e).setSys_op(sys_op);
                            }
                        }
                    }
                    break;
                case 9:
                    System.out.println("Afişarea echipamentelor vândute");
                    for(echipamente e:echip)
                    {
                        if(Objects.equals(e.getSituatie(), "vandut"))
                        {
                            System.out.println(e);
                        }
                    }
                    break;
                case 10:
                    try {
                       // FileWriter oos=new FileWriter("C:\\Users\\cmora\\Desktop\\Faculta\\Anul3\\Sem1\\PJ\\lab4\\src\\ex1\\echip.bin");
                        //PrintWriter pw = new PrintWriter(oos);

                        FileOutputStream fout=new FileOutputStream("C:\\Users\\cmora\\Desktop\\Faculta\\Anul3\\Sem1\\PJ\\lab4\\src\\ex1\\echip.txt");
                        ObjectOutputStream out=new ObjectOutputStream(fout);

                        System.out.println("1. Serializare");
                        System.out.println("2. Deserializare");
                        int optiune1 = sc1.nextInt();
                        if (optiune1 == 1)
                        {
                            for (echipamente e : echip)
                            {
                                out.writeObject(e);
                            }
                            echip.clear();

                            out.close();
                            fout.close();
                        } else if (optiune1 == 2) {
                            FileInputStream fin=new FileInputStream("C:\\Users\\cmora\\Desktop\\Faculta\\Anul3\\Sem1\\PJ\\lab4\\src\\ex1\\echip.txt");
                            ObjectInputStream in=new ObjectInputStream(fin);

                            while(fin.available()>0)
                            {
                                for(int i=0;i<3;i++)
                                {
                                    echip.add((Imprimante)in.readObject());
                                }
                                for(int i=0;i<3;i++)
                                {
                                    echip.add((Copiatoare)in.readObject());
                                }
                                for(int i=0;i<3;i++)
                                {
                                    echip.add((sistem)in.readObject());
                                }
                            }
//                            {
//                                if(items.get(5).equals("sistem de calcul"))
//                                {
//                                    echip.add(new sistem(items.get(0),Integer.parseInt(items.get(1)),Integer.parseInt(items.get(2)),items.get(3),items.get(4),items.get(5),items.get(6),Double.parseDouble(items.get(7)),Integer.parseInt(items.get(8)), items.get(9)));
//                                }
//                                else if(items.get(5).equals("imprimanta"))
//                                {
//                                    echip.add(new Imprimante(items.get(0),Integer.parseInt(items.get(1)),Integer.parseInt(items.get(2)),items.get(3),items.get(4),items.get(5),Integer.parseInt(items.get(6)),items.get(7),Integer.parseInt(items.get(8)),items.get(9)));
//                                }
//                                else if(items.get(5).equals("copiator"))
//                                {
//                                    echip.add(new Copiatoare(items.get(0),Integer.parseInt(items.get(1)),Integer.parseInt(items.get(2)),items.get(3),items.get(4),items.get(5),Integer.parseInt(items.get(6)),items.get(7)));
//                                }
//                            }
                            in.close();
                            fin.close();
                        }

                    }
                    catch (FileNotFoundException e)
                    {
                        System.out.println("Fisierul nu a fost gasit");
                    }
                    catch (Exception e)
                    {
                        System.out.println("Eroare");
                    }
                    break;
                default:
                    System.out.println("Optiune invalida");
            }

        }
    }


}

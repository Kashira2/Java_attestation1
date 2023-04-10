package Java_attestation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook();
        NoteBook notebook2 = new NoteBook();
        NoteBook notebook3 = new NoteBook();
        NoteBook notebook4 = new NoteBook();
        NoteBook notebook5 = new NoteBook();
        NoteBook notebook6 = new NoteBook();

        notebook1.setName("Huawei MateBook D 15 BoD-WFH9", "Черный", "Windows");
        notebook2.setName("Huawei MateBook D 15 BoD-WDH9", "Серебристый", "Windows");
        notebook3.setName("Apple MacBook Pro A2485", "Черный", "Mac OS");
        notebook4.setName("Apple MacBook Pro A2485", "Серебристый", "Mac OS");
        notebook5.setName("MSI Creator Z16P B12UHST-028RU", "Черный", "Windows");
        notebook6.setName("Acer Extensa 15 EX215-31-C36W", "Серебристый", "Windows");

        notebook1.setRam(16);
        notebook2.setRam(8);
        notebook3.setRam(16);
        notebook4.setRam(16);
        notebook5.setRam(32);
        notebook6.setRam(4);

        notebook1.setHdd(512);
        notebook2.setHdd(256);
        notebook3.setHdd(512);
        notebook4.setHdd(1024);
        notebook5.setHdd(2048);
        notebook6.setHdd(256);

        HashSet laptops = new HashSet<>();
        laptops.add(notebook1);
        laptops.add(notebook2);
        laptops.add(notebook3);
        laptops.add(notebook4);
        laptops.add(notebook5);
        laptops.add(notebook6);

        Scanner scr = new Scanner(System.in);
        System.out.println("Доброго дня.\nВыберите нужный параметр ноутбука для фильтрации:");
        System.out.println("""
                1 - ОЗУ
                2 - Объем ЖД
                3 - Операционная система
                4 - Цвет""");
        int n = scr.nextInt();

        findLaptops(laptops, n, scr);
        
    }

    private static void findLaptops(HashSet laptops, int n, Scanner scr) {
        switch (n) {
            case (1):
                System.out.println("Выберите минимальный параметр:");
                System.out.println("""
                        1 - 4 ГБ
                        2 - 8 ГБ
                        3 - 16 ГБ
                        4 - 32 ГБ""");
                n = scr.nextInt();
                switch (n) {
                    case 1:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getRam() >= 4)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    case 2:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getRam() >= 8)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    case 3:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getRam() >= 16)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    case 4:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getRam() >= 32)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    default:
                        System.out.println("Нужно указать цифру соответствующую парметру.");
                        break;
                }
                break;
            case (2):
                System.out.println("Выберите минимальный параметр:");
                System.out.println("""
                        1 - 256 ГБ
                        2 - 512 ГБ
                        3 - 1024 ГБ
                        4 - 2048 ГБ""");
                n = scr.nextInt();

                switch (n) {
                    case 1:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getHdd() >= 256)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    case 2:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getHdd() >= 512)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    case 3:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getHdd() >= 1024)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    case 4:
                        for (Object items : laptops) {
                            if (((NoteBook) items).getHdd() >= 2048)
                                System.out.println(((NoteBook) items).getName());
                        }
                        break;
                    default:
                        System.out.println("Нужно указать цифру соответствующую парметру.");
                        break;
                }
                break;
            case (3):
                System.out.println("Выберите слудующий параметр:");
                System.out.println("""
                        1 - Windows
                        2 - Mac OS""");
                n = scr.nextInt();
                if (n == 1) {
                    for (Object items : laptops) {
                        if (((NoteBook) items).getOc().equals("Windows"))
                            System.out.println(((NoteBook) items).getName());
                    }
                } else if (n == 2) {
                    for (Object items : laptops) {
                        if (((NoteBook) items).getOc().equals("Mac OS"))
                            System.out.println(((NoteBook) items).getName());
                    }
                } else
                    System.out.println("Нужно указать цифру соответствующую парметру.");
                break;
            case (4):
                System.out.println("Выберите слудующий параметр:");
                System.out.println("""
                        1 - Серебристый
                        2 - Черный""");
                n = scr.nextInt();
                if (n == 1) {
                    for (Object items : laptops) {
                        if (((NoteBook) items).getColor().equals("Серебристый"))
                            System.out.println(((NoteBook) items).getName());
                    }
                } else if (n == 2) {
                    for (Object items : laptops) {
                        if (((NoteBook) items).getColor().equals("Черный"))
                            System.out.println(((NoteBook) items).getName());
                    }
                } else
                    System.out.println("Нужно указать цифру соответствующую парметру.");
                break;
            default:
                System.out.println("Нужно указать цифру соответствующую парметру.");
                break;

        }
    }

}

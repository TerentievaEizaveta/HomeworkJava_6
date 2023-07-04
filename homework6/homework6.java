/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и 
 * методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации 
и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */
package homework6;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.*;



public class homework6 {

    public static void main(String[] args) {

        NoteBook notebook1 = new NoteBook();
        notebook1.setName ("Irbis NB260");
        notebook1.setRAM (4);
        notebook1.setHDD (64);
        notebook1.setOS ("Windows 10");
        notebook1.setColor("Black"); 

        NoteBook notebook2 = new NoteBook();
        notebook2.setName ("Irbis NB260");
        notebook2.setRAM (4);
        notebook2.setHDD (64);
        notebook2.setOS ("Windows 10");
        notebook2.setColor("White");

        NoteBook notebook3 = new NoteBook();
        notebook3.setName ("ASUS R429KA-BV131W");
        notebook3.setRAM  (4);
        notebook3.setHDD (128);
        notebook3.setOS ("Windows 11");
        notebook3.setColor ("Blue");

        NoteBook notebook4 = new NoteBook();
        notebook4.setName ( "ASUS nbtop 14 E410KA-BV119W");
        notebook4.setRAM  (4);
        notebook4.setHDD  (128);
        notebook4.setOS  ("Windows 11");
        notebook4.setColor  ("Black");

        NoteBook notebook5 = new NoteBook();
        notebook5.setName  ("DEXP Aquilon");
        notebook5.setRAM  (8);
        notebook5.setHDD (128);
        notebook5.setOS ("Windows 11");
        notebook5.setColor ("Silver");

        NoteBook notebook6 = new NoteBook();
        notebook6.setName  ("Lenovo IdeaPad 3 15ITL05");
        notebook6.setRAM  (8);
        notebook6.setHDD (256);
        notebook6.setOS  ("Windows 11");
        notebook6.setColor ("Blue");

        NoteBook notebook7 = new NoteBook();
        notebook7.setName ( "Infinix InBook X2 XL23");
        notebook7.setRAM  (8);
        notebook7.setHDD  (512);
        notebook7.setOS  ("Windows 11");
        notebook7.setColor  ("Green");


        //System.out.println(w1==w4);
        //System.out.println(notebook1.equals(w4));
        //var notebook = new HashSet<NoteBook>(Arrays.asList(notebook1, notebook2, notebook3,
        //                                            notebook4,notebook5, notebook6, notebook7));
        //System.out.println(notebook);

        HashSet <NoteBook> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3,
                                                      notebook4,notebook5, notebook6, notebook7));
        HashSet <NoteBook> res = new HashSet<>();
       // try
        //{
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
            if(n==1){
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if(n==2){
                System.out.println("Введите минимальный объем ЖД" );
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if(n==3){
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if(n==4){
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
        }
        for (java.util.Map.Entry<String, Object> entry : filters.entrySet()){ 
            if(entry.getKey().equals("RAM")){
                Iterator<NoteBook> it = notebooks.iterator();
                while( it.hasNext()){
                    NoteBook nb =  it.next();
                    if(nb.getRAM()>=(Integer)entry.getValue()){
                        res.add(nb);
                    }
                }
            }
            if(entry.getKey().equals("HDD")){
                Iterator<NoteBook> it = notebooks.iterator();
                while(it.hasNext()){
                    NoteBook nb = (NoteBook)it.next();
                    if(nb.getHDD()>=(Integer)entry.getValue()){
                        res.add(nb);
                    }
                }
            }
            if(entry.getKey().equals("OS")){
                Iterator<NoteBook> it = notebooks.iterator();
                while(it.hasNext()){
                    NoteBook nb = (NoteBook)it.next();
                        if(nb.getOS().equals(entry.getValue())){
                            res.add(nb);
                        }
                }
            }
            if(entry.getKey().equals("color")){
                Iterator<NoteBook> it = notebooks.iterator();
                while(it.hasNext() ){
                    NoteBook nb = (NoteBook)it.next();
                        if(nb.getColor().equals(entry.getValue())){
                            res.add(nb);
                        }
                }
            }
        }
        Iterator<NoteBook> it = res.iterator();
        while(it.hasNext()){
            NoteBook nb = (NoteBook)it.next();
        System.out.println(nb.toString());
        System.out.println();
        }
        sc.close();
        
    }
    
}  
 
    

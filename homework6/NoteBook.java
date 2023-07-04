package homework6;

public class NoteBook {
    String name;
    int ram;
    int hdd;
    String os;
    String color;
    


    public String getName(){
        return this.name;
    }

    public Integer getRAM(){
        return this.ram;
    }
    public Integer getHDD(){
        return this.hdd;
    }
    public String getOS(){
        return this.os;
    }
    public String getColor(){
        return this.color;
    }
    public void setName(String name){
        this.name =name;
    }
    
    public void setRAM(Integer RAM){
        this.ram = RAM;
    }
    public void setHDD(Integer HDD){
        this.hdd = HDD;
    }

    public void setOS(String OS){
        this.os = OS;
    }
    public void setColor(String color){
        this.color =color;
    }
    @Override
    public String toString() {
        return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем жд %d Гб \n ОС %s \n Цвет %s ",
                    this.name, this.ram, this.hdd, this.os, this.color);
    }
}



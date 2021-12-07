package KOLOS_2_ASD.A;

public class Zad1_NA5 {

    private Student[] table;
    private int nElements;

    public Zad1_NA5(int maxSize){
        table = new Student[maxSize];
        nElements = 0 ;
    }

    public void add(Student value){
        if(nElements >= table.length){
            Student [] locTable = new Student[table.length*2];
            for(int i = 0 ; i < table.length ; i++) locTable[i] = table[i];
            table = locTable;
        }
        table[nElements] = value;
        nElements++;
    }

    public Student get(int index){
        return table[index];
    }

    public int size(){
        return nElements;
    }

    public boolean remove(int index){
        if(nElements == 0 || index >= nElements || index <0){
            return false;
        }
        for(int i = index ; i < nElements -1; i++){
            table[i] = table[i+1];
        }
        nElements--;
        return true;
    }

    public int find(Student searchElemn){
        for(int i =0 ; i < nElements ; i++){
            if(table[i].equals(searchElemn)) return i;
        }
        return -1;
    }

    public void print(){
        for(int i =0 ; i < nElements; i ++){
            System.out.println(get(i).toString()+ "\n");
        }
    }


    public static void main(String[] args) {
        int maxSize = 1;
        Zad1_NA5 array = new Zad1_NA5(maxSize);
        Student s1;
        s1 = new Student("Ola" , "Nowak", 13322);
        array.add(s1);
        Student st2 = new Student("Kamil" , "Baran" , 33221);
        array.add(st2);
        array.print();
        array.remove(1);
        System.out.println("PO USUNIECU");
        array.print();

        System.out.println(array.find(s1));

    }
}


    class Student{
        private String imie;
        private String nazwisko;
        private int album;

        public Student(String imie, String nazwisko, int album) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.album = album;
        }

        public Student(){
            imie = "";
            nazwisko = "";
            album = 0;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public void setAlbum(int album) {
            this.album = album;
        }

        public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public int getAlbum() {
            return album;
        }

        public String toString(){
            return "Student{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", album=" + album + '}';
        }
}


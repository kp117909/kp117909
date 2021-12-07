package cwiczimy;


public class wybieranie {

  private Student[] table;
  private int nElems;

  public wybieranie(int maxSize){
    table = new Student[maxSize];
    nElems = 0;
  }

  public void add(Student elem){
    if(nElems >= table.length){
      Student temp[] = new Student[table.length*2];
      for(int i = 0 ; i < nElems -1  ; i++) temp[i] = table[i];
      table = temp;
    }
    table[nElems] = elem;
    nElems++;
  }

  public Student get(int index){
    return table[index];
  }

  public boolean remove(int index){
    if (index < 0 || index >= nElems || nElems == 0) {
      return false;
    }
    for(int i = index ; i < nElems ; i ++){
      table[i] = table[i+1];
    }
    nElems--;
    return true;
  }

  public int find(int searchElem){
    if(searchElem < 0) return -1;
    for(int i =0 ; i < nElems ; i++){
     if(table[i].equals(searchElem)) return i;
    }
    return -1;
  }

  public void print(){
    for(int i = 0 ; i < nElems ; i++){
      System.out.println(get(i).toString());
    }
  }

  public static void main(String[] args) {
    int maxSize = 1;
    wybieranie array = new wybieranie(maxSize);
    Student s1 = new Student("maciej" , "walczak" , 5);
    array.print();
  }

}

class Student{

  private String imie;
  private String nazwisko;
  private int wiek;

  public Student(String imie, String nazwisko, int wiek) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
  }

  public Student(){
    wiek = 0;
    nazwisko = "";
    imie = "";
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public int getWiek() {
    return wiek;
  }

  public void setWiek(int wiek) {
    this.wiek = wiek;
  }

  public String toString(){
    return "Imie " + imie;
  }
}


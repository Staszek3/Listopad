package PakListop_3_4_2018;

public class Person implements Comparable<Person> {

    public String name;
    public String surname;
    public Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

   // @Override
 //   public boolean equals(Object obj) {
    //    if(obj instanceof Person){
       //     return
       // }
      // return super.equals(obj);
   // }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.getAge()) {
            return 1;
        } else if (this.age < o.getAge()) {
            return -1;
        }
        return 0;
    }
}

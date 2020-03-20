public class Student implements Comparable<Student> {
    String name;
    int age;
    int id;

    Student(String name, int age, int id){
        this.name=name;
        this.age= age;
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        int i= name.compareTo(o.name);
        if(i==0){
            i=Integer.compare(age,o.age);
            if(i==0){
                i=Integer.compare(id,o.id);
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}'+"\n";
    }
}

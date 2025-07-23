package is_a;

public class student extends person{
    String degree;
    String usn;
    student(String name,String gender,long phno,String degree,String usn){
        super(name,gender,phno);

        this.degree=degree;
        this.usn=usn;
    }
}

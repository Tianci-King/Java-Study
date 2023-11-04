import jdk.nashorn.internal.ir.Symbol;

/**
 * @author tiancy
 * 1）包括成员变量：“姓名”、“身份证号”、“性别”和“年龄”，所有成员变量的访问控制方式（即修饰词）为private；
 * 2）包括成员方法：“获得姓名”、“获得身份证号”、“获得性别”、“获得年龄”，“设置姓名”、“设置身份证号”、“设置性别”、“设置年龄”；
 * 3）包括方法printInfo：输出该人的姓名、身份证号、性别和年龄；
 * 4）包括两个构造方法，原型分别为：public Criminal()和public Criminal(String name, String personID, boolean gender, int age)；
 */
public class Criminal {
    private String name;
    private String id;
    private boolean sex;
    private Number age;

    public Criminal() {}
    public Criminal(String name, String personID, boolean sex, int age) {
        setName(name);
        setId(personID);
        setAge(age);
        setSex(sex);
    }
    public void printInfo() {
        System.out.println("姓名：" + name);
        System.out.println("身份证号：" + id);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public boolean getSex() {
        return sex;
    }
    public Number getAge() {
        return age;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setId(String newId) {
        id = newId;
    }
    public void setSex(boolean newSex) {
        sex = newSex;
    }
    public void setAge(Number newAge) {
        age = newAge;
    }
}

package system;

public class Xueshengxuanke {
	    public static void main(String[] args) {
	        System.out.println("-------------------学生信息--------------------");
	        Student xuesheng = new Student();
	        xuesheng.setName("王某");
	        xuesheng.setAge(20);
	        xuesheng.setNumber(201933333);
	        xuesheng.setSex("男");
	        System.out.println("学生姓名:" + xuesheng.getName());
	        System.out.println("学生年龄:" + xuesheng.getAge());
	        System.out.println("学生编号:" + xuesheng.getNumber());
	        System.out.println("学生性别:" + xuesheng.getSex());

	        System.out.println("------------------教师信息---------------------");
	        Teacher laoshi = new Teacher();
	        laoshi.setName("社会王");
	        laoshi.setAge(30);
	        laoshi.setNumber(996433);
	        laoshi.setSex("男");
	        laoshi.setLesson_1("概率");
	        System.out.println("授课教师:" + laoshi.getName());
	        System.out.println("教师年龄:" + laoshi.getAge());
	        System.out.println("教师编号:" + laoshi.getNumber());
	        System.out.println("教师性别:" + laoshi.getSex());

	        System.out.println("------------------课程信息---------------------");
	        Lesson_1 kecheng = new Lesson_1();
	        kecheng.setName("概率");
	        kecheng.setTime("每周三 晚上7:00-9:40");
	        kecheng.setNumber(12138);
	        kecheng.setPlace("综合楼");
	        System.out.println(kecheng.toString());

	        System.out.println("------------------课程详情---------------------");
	        System.out.println("选课成功");

	    }

	}


	class People{
	    public People(){

	    }
	    public People(String name,int age,int number,String sex){
	        this.name = name;
	        this.age = age;
	        this.number = number;
	        this.sex = sex;
	    }

	    private String name;
	    private int age;
	    private int number;
	    private String sex;

	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getSex() {
	        return sex;
	    }
	    public int getNumber() {
	        return number;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setAge(int age) {
	            this.age = age;
	    }
	    public void setNumber(int number) {
	        this.number = number;
	    }
	    public void setSex(String sex) {
	        this.sex = sex;
	    }

	}

	class Student extends People{
	    public Student(){

	    }
	    public Student(String name,int age,int number,String sex){
	        super(name, age, number, sex);
	    }
	}

	class Teacher extends People{
	    public Teacher(){

	    }
	    public Teacher(String name,int age,int number,String sex){
	        super(name, age, number, sex);
	    }
	    String lesson_1;
	    public String getLesson_1() {
	        return lesson_1;
	    }
	    public void setLesson_1(String lesson_1) {
	        this.lesson_1 = lesson_1;
	    }


	}


	class Lesson{
	    public Lesson(){

	    }
	    public Lesson(String name,String time,int number,String place){
	        this.name = name;
	        this.time = time;
	        this.number = number;
	        this.place = place;
	    }

	    private String name;
	    private String time;
	    private int number;
	    private String place;


	    public String getName() {
	        return name;
	    }
	    public String getTime() {
	        return time;
	    }

	    public String getPlace() {
	        return place;
	    }
	    public int getNumber() {
	        return number;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setTime(String time) {
	        this.time = time;
	    }
	    public void setNumber(int number) {
	        this.number = number;
	    }
	    public void setPlace(String place) {
	        this.place = place;
	    }

	}


	class Lesson_1 extends Lesson{
	    public Lesson_1(){

	    }
	    public Lesson_1(String name,String time,int number,String place){
	        super(name, time, number, place);
	    }
	    public String toString() {
	        return "课程名称：" + getName()+ "\n" + "上课时间：" + getTime() + "\n" + "课程编号：" + getNumber()+ "\n" + "授课地点：" + getPlace()+ "\n";
	    }
	}


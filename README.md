# JAVA2
java课程作业仓库
# 实验目的 
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法； 
2.掌握面向对象的类设计方法（属性、方法）； 
3.掌握类的继承用法，通过构造方法实例化对象； 
4.学会使用super()，用于实例化子类； 
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

# 实验要求 
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。

# 实验过程 
1.编辑实体类，设定属性 
2.为变量分类并赋值 
3.分别创建老师和课程信息类输入并赋值 
4.输出结果，检查代码，运行并输出

# 核心方法
...............................
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
.................................

# 实验结果
![image](https://github.com/liangbiii/JAVA2/blob/main/image/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201101233549.png)

# 实验感想
充分掌握子类继承父类的方法，学会了将子类实例化，了解了使用tostring()方法将信息输出。上网查询了很多资源，自己实在是不会。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManagementSystem implements StudentFunctionc {


    //学生姓名
    private String name;
    //学生年龄
    private String age;
    //学号
    private String id;
    //学生专业
    private String specialized;
    //学生年级
    private String grade;
    //居住地址
    private String address;

    //添加学生属性
    private ArrayList<HashMap<String,String>> Attribute;
    //将学生数据与学生ID关联
    public HashMap<String, ArrayList<HashMap<String,String>>> Information=new HashMap<String, ArrayList<HashMap<String,String>>>();

    public  HashMap<String,String> Addname(String name){
        /*
        添加学生名称
         */
        HashMap<String,String> StudentName=new HashMap<String,String>();
        StudentName.put("name",name);
        return StudentName;
    }

    public  HashMap<String,String> Addage(String age){
        /*
        添加学生年龄
         */
        HashMap<String,String> Studentage=new HashMap<String,String>();
        Studentage.put("age",age);
        return Studentage;
    };
    public  HashMap<String,String> Addspecialized(String specialized){
       /*
        添加学生专业
         */
        HashMap<String,String> Studentspecialized=new HashMap<String,String>();
        Studentspecialized.put("specialized",specialized);
        return Studentspecialized;
    };
    public  HashMap<String,String> Addgrade(String grade){
        /*
        添加学生年级
         */
        HashMap<String,String> Studentgrade=new HashMap<String,String>();
        Studentgrade.put("grade",grade);
        return Studentgrade;
    };
    public  HashMap<String,String> Address(String ress){
         /*
        添加学生地址
         */
        HashMap<String,String> Studentaddress=new HashMap<String,String>();
        Studentaddress.put("ress",ress);
        return Studentaddress;
    };

    public ArrayList<HashMap<String,String>> AddData(HashMap<String,String> name,HashMap<String,String> age,HashMap<String,String> specialized,HashMap<String,String> grade,HashMap<String,String> address){
        /*
        将学生的信息存在一个列表
         */
        ArrayList<HashMap<String,String>> AddData=new ArrayList<HashMap<String,String>>();
        AddData.add(name);
        AddData.add(age);
        AddData.add(specialized);
        AddData.add(grade);
        AddData.add(address);
        return AddData;
    }

    @Override
    public void AddStudentInformation(String id,ArrayList<HashMap<String,String>> data) {
        /*
        添加学生信息
         */
        Information.put(id,data);
    }

    @Override
    public void AlterStudentInformation(String id,String Attribute,String Content) {
        /*
        修改学生信息
         */
        ArrayList<HashMap<String,String>> data=Information.get(id);
        data.forEach(i ->{
            if (i.containsKey(Attribute)){
                i.replace(Attribute,Content);
            }
        });
    }

    @Override
    public void CutOutStudentInformation(String id) {
        /*
        删除学生信息
         */
        Information.remove(id);
    }

    @Override
    public ArrayList<HashMap<String,String>> MakeEnquiriesStudentInformation(String id) {
        /*
        查询学生信息
         */
        return Information.get(id);
    }

    @Override
    public void LaunchTheSystem() {
        /*
        //退出系统
         */
        System.out.println("感谢使用，欢迎下次再来！");
    }

    public  boolean istrue(String s){
        String str="^[a-z0-9A-z]+$";
        return s.matches(str);
    }

}

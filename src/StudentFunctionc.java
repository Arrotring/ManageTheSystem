import java.util.ArrayList;
import java.util.HashMap;

public interface StudentFunctionc {
    /*
    1、新增学生信息
    2、修改学生信息
    3、删除学生信息
    4、查询学生信息
    5、退出系统
     */
    //新增学生信息
    public abstract void AddStudentInformation(String id, ArrayList<HashMap<String,String>> data);

    //修改学生信息
    public abstract void AlterStudentInformation(String id,String Attribute,String Content);

    //删除学生信息
    public abstract void CutOutStudentInformation(String id);

    //查询学生信息
    public abstract  ArrayList<HashMap<String,String>> MakeEnquiriesStudentInformation(String id);

    //退出系统
    public abstract void LaunchTheSystem();


}

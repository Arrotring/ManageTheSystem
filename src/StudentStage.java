import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentStage {
    public static void main(String[] args) {
        StudentManagementSystem oa = new StudentManagementSystem();
        label:
        while (true) {
            System.out.println("欢迎光临学生管理系统\n请输入对应序号进行操作：\n" +
                    "    1、新增学生信息\n" +
                    "    2、修改学生信息\n" +
                    "    3、删除学生信息\n" +
                    "    4、查询学生信息\n" +
                    "    5、退出系统");
            Scanner inputs = new Scanner(System.in);
            String input = inputs.next();
            switch (input) {
                case "1":
                    while (true) {
                        System.out.println("请输入学生的学号（返回上级页面请输入：esc）");
                        Scanner inputId = new Scanner(System.in);
                        String id = inputId.next();
                        if (id.equals("esc")) {
                            System.out.println("正在返回上级页面\n");
                            continue label;
                        }
                        else if (oa.Information.containsKey(id)) {
                            System.out.println("该学号已存在");
                        }
                        else if (oa.istrue(id)) {

                            System.out.println("请输入学生姓名（返回上级页面请输入：esc）");
                            Scanner inputname = new Scanner(System.in);
                            String name = inputname.next();
                            if (name.equals("esc")){
                                System.out.println("正在返回上级页面\n");
                                continue ;
                            }
                            HashMap<String, String> StudentName = oa.Addname(name);

                            System.out.println("请输入学生专业（返回上级页面请输入：esc）");
                            Scanner inputage = new Scanner(System.in);
                            String age = inputage.next();
                            HashMap<String, String> Studentage = oa.Addage(age);
                            if (age.equals("esc")){
                                System.out.println("正在返回上级页面\n");
                                continue ;
                            }
                            System.out.println("请输入学生年龄（返回上级页面请输入：esc）");
                            Scanner inputspecialized = new Scanner(System.in);
                            String specialized = inputspecialized.next();
                            HashMap<String, String> Studentspecialized = oa.Addspecialized(specialized);
                            if (specialized.equals("esc")){
                                System.out.println("正在返回上级页面\n");
                                continue;
                            }
                            System.out.println("请输入学生年级（返回上级页面请输入：esc）");
                            Scanner inputgrade = new Scanner(System.in);
                            String grade = inputgrade.next();
                            HashMap<String, String> Studentgrade = oa.Addgrade(grade);
                            if (grade.equals("esc")){
                                System.out.println("正在返回上级页面\n");
                                continue ;
                            }
                            System.out.println("请输入学生居住地址（返回上级页面请输入：esc）");
                            Scanner inputress = new Scanner(System.in);
                            String ress = inputress.next();
                            HashMap<String, String> Studentress = oa.Address(ress);

                            //将学生信息添加进一个列表
                            ArrayList<HashMap<String, String>> data = oa.AddData(StudentName, Studentage, Studentspecialized, Studentgrade, Studentress);
                            oa.AddStudentInformation(id, data);
                            System.out.println("学生信息添加成功（返回上级页面请输入：esc）");
                            continue label;
                        }
                        else {
                            System.out.println("请输入正确的学号（数字+字符）\n");
                        }
                    }
                case "2":
                    while (true) {
                        System.out.println("请输入要修改学生信息的学号（返回上级页面请输入：esc）");
                        Scanner inputid = new Scanner(System.in);
                        String id = inputid.next();
                        if (oa.Information.containsKey(id)) {
                            labels:
                            while (true) {
                                System.out.println("请输入对应选择要修改学生的信息（返回上级页面请输入：esc)\n" +
                                        "1：学生姓名\t" +
                                        "2：学生年龄\t" +
                                        "3：学生专业\t" +
                                        "4：学生年级\t" +
                                        "5：居住地址"
                                );
                                Scanner inputSerial = new Scanner(System.in);
                                String Serial = inputSerial.next();
                                switch (Serial) {
                                    case "1":
                                        System.out.println("请输入学生姓名（返回上级页面请输入：esc）");
                                        Scanner inputname = new Scanner(System.in);
                                        String name = inputname.next();
                                        if (name.equals("esc")) {
                                            continue;
                                        } else {
                                            oa.AlterStudentInformation(id, "name", name);
                                            System.out.println("修改成功！");
                                            continue;
                                        }

                                    case "2":
                                        System.out.println("请输入学生年龄（返回上级页面请输入：esc）");
                                        Scanner inputage = new Scanner(System.in);
                                        String age = inputage.next();
                                        if (age.equals("esc")) {
                                            continue;
                                        } else {
                                            oa.AlterStudentInformation(id, "age", age);
                                            System.out.println("修改成功！");
                                            continue;
                                        }

                                    case "3":
                                        System.out.println("请输入学生专业（返回上级页面请输入：esc）");
                                        Scanner inputspecialized = new Scanner(System.in);
                                        String specialized = inputspecialized.next();
                                        if (specialized.equals("esc")) {
                                            continue;
                                        } else {
                                            oa.AlterStudentInformation(id, "specialized", specialized);
                                            System.out.println("修改成功！");
                                            continue;
                                        }

                                    case "4":
                                        System.out.println("请输入学生年级（返回上级页面请输入：esc）");
                                        Scanner inputgrade = new Scanner(System.in);
                                        String grade = inputgrade.next();
                                        if (grade.equals("esc")) {
                                            continue;
                                        } else {
                                            oa.AlterStudentInformation(id, "grade", grade);
                                            System.out.println("修改成功！");
                                            continue;
                                        }

                                    case "5":
                                        System.out.println("请输入居住地址（返回上级页面请输入：esc）");
                                        Scanner inputress = new Scanner(System.in);
                                        String ress = inputress.next();
                                        if (ress.equals("esc")) {
                                            continue;
                                        } else {
                                            oa.AlterStudentInformation(id, "ress", ress);
                                            System.out.println("修改成功！");
                                            continue;
                                        }
                                    case "esc":
                                        break labels;
                                    default:
                                        System.out.println("请输入正确的序号");
                                        continue labels;

                                }
                            }
                        }
                        else if (id.equals("esc")) {
                            System.out.println("正在返回上级页面\n");
                            continue label;
                        }
                        else {
                            System.out.println("您输入的学号不存在");
                            continue;
                        }
                    }
                case "3":
                    System.out.println("请输入要删除的学生学号（返回上级页面请输入：esc）");
                    Scanner inputid = new Scanner(System.in);
                    String id = inputid.next();
                    if (oa.Information.containsKey(id)) {
                        oa.CutOutStudentInformation(id);
                        continue ;
                    }
                    else if (id.equals("esc")) {
                        System.out.println("正在返回上级页面\n");
                        continue;
                    }
                    else {
                        System.out.println("该学号不存在");
                    }
                case "4":
                    while (true){
                        System.out.println("请输入要查询学生学号（返回上级页面请输入：esc）");
                        Scanner inputids = new Scanner(System.in);
                        String ids = inputids.next();
                        if (oa.Information.containsKey(ids)) {
                            System.out.println(oa.MakeEnquiriesStudentInformation(ids));
                            continue label;
                        }
                        else if (ids.equals("esc")) {
                            System.out.println("正在返回上级页面\n");
                            continue label ;
                        }
                        else {
                            System.out.println("该学号不存在");
                        }
                    }

                case "5":
                    oa.LaunchTheSystem();
                    break label;

                default:
                    System.out.println("请输入正确的序号\n");
                }

            }
        }
    }

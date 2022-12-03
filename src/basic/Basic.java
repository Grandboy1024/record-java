package basic;

public class Basic {
    public static void main(String[] args) {
        /**
         * 8 种基本数据类型
         * */ 
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4l;

        float f = 1.0f;
        double d = 1.05;

        char c = 'a';
        boolean bool = true;
        // i = (int)bool;   // 整型值和布尔值之间不能转换

        System.out.println("byte 变量 b 的值：" + b);
        System.out.println("short 变量 s 的值：" + s);
        System.out.println("int 变量 i 的值：" + i);
        System.out.println("long 变量 l 的值：" + l);
        System.out.println("float 变量 f 的值：" + f);
        System.out.println("double 变量 d 的值：" + d);
        System.out.println("char 变量 c 的值：" + c);
        System.out.println("boolean 变量 bool 的值：" + bool);

        /**
         * 变量和常量
         * */ 
        int variable;   // 变量声明
        variable = 5;   // 变量初始化
        variable = 10;  // 变量赋值
        final int CONSTANT_VALUE = 5;
        // constant = 10; // 常量初始化后，不能再修改值
        System.out.println("int 变量 variable 的值：" + variable);
        System.out.println("int 常量 constant 的值：" + CONSTANT_VALUE);

        /**
         * 枚举：
         * 1. 声明
         * 2. 使用
         * */ 
        Size enumVariable;
        enumVariable = Size.SMALL;
        System.out.println("枚举 Size 变量 enumVariable 的值：" + enumVariable);

        /**
         * 运算符
         * 1. 算术运算符：需注意运算后的值的类型
         * */ 
        // byte byteAddByte = b + b;
        // short byteAddShort = b + s;
        int byteAddInt = b + i;
        long byteAddLong = b + l;
        // System.out.println("两数相加的值：" + byteAddByte);
        // System.out.println("两数相加的值：" + byteAddShort);
        System.out.println("两数相加的值：" + byteAddInt);
        System.out.println("两数相加的值：" + byteAddLong);

        int shortAddByte = s + b;   // 要理解为什么用 int 类型变量来装相加后的值
        int shortAddShort = s + s;
        int shortAddInt = s + i;
        long shortAddLong = s + l;
        System.out.println("两数相加的值：" + shortAddByte);
        System.out.println("两数相加的值：" + shortAddShort);
        System.out.println("两数相加的值：" + shortAddInt);
        System.out.println("两数相加的值：" + shortAddLong);

        int intAddByte = i + b;
        int intAddShort = i + s;
        int intAddInt = i + i;
        long intAddLong = i + l;
        System.out.println("两数相加的值：" + intAddByte);
        System.out.println("两数相加的值：" + intAddShort);
        System.out.println("两数相加的值：" + intAddInt);
        System.out.println("两数相加的值：" + intAddLong);

        long longAddByte = l + b;
        long longAddShort = l + s;
        long longAddInt = l + i;
        long longAddLong = l + l;
        System.out.println("两数相加的值：" + longAddByte);
        System.out.println("两数相加的值：" + longAddShort);
        System.out.println("两数相加的值：" + longAddInt);
        System.out.println("两数相加的值：" + longAddLong);

        double intAddFloat = i + f;
        double intAddDouble = i + d;
        System.out.println("两数相加的值：" + intAddFloat);
        System.out.println("两数相加的值：" + intAddDouble);

        /**
         * 关系运算符，也叫逻辑运算符
         * */ 
        int first = 10;
        int second = 20;
        boolean isTrue = first > second;
        System.out.println("isTrue的值：" + isTrue);
        isTrue = first >= second;
        System.out.println("isTrue的值：" + isTrue);
        isTrue = first == second;
        System.out.println("isTrue的值：" + isTrue);
        isTrue = first <= second;
        System.out.println("isTrue的值：" + isTrue);
        isTrue = first < second;
        System.out.println("isTrue的值：" + isTrue);
    }
}

// 枚举声明
enum Size { 
    SMALL, 
    MEDIUM, 
    LARGE, 
    EXTRA_LARGE 
}
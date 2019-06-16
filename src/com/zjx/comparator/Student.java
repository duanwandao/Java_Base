package com.zjx.comparator;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-02 17:33
 */
class Student implements Comparable<Student> {    // 指定类型为Student

    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //  返回-1则在前
    public int compareTo(Student stu) {    // 覆写compareTo()方法，实现排序规则的应用
        if (this.score > stu.score) {
            return -1;
        } else if (this.score < stu.score) {
            return 1;
        } else {
            if (this.age > stu.age) {
                return 1;
            } else if (this.age < stu.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"score\":")
                .append(score);
        sb.append("}\n");
        return sb.toString();
    }
}


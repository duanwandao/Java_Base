package com.zjx.serializableDemo;

import java.io.*;
import java.util.Date;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-05-25 11:15
 */
public class serializableDemo {

    public static void main(String[] args) {
        //Initializes The Object
        User user = new User();
        user.setName("hollis");
        user.setGender("male");
        user.setAge(23);
        user.setBirthday(new Date());
        System.out.println(user);

        //Write Obj to File
        ObjectOutputStream objectOutputStream=null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("tempFile.txt"));
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file=new File("tempFile.txt");
        ObjectInputStream objectInputStream=null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            User newUser = (User) objectInputStream.readObject();
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

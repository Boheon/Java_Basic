package javabasic.chapter03;

import javax.swing.*;

public class Address {
    public static void main(String[] args) {
        String id = "root";
        String pwd = "pass";

        String loginId = JOptionPane.showInputDialog("아이디 입력");
        String loginPw = JOptionPane.showInputDialog("패스워드 입력");

        if(id.equals(loginId) && pwd.equals(loginPw)){
            System.out.println("로그인 성공");
        }else{
            System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
        }
    }
}

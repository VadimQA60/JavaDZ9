package ru.netology;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Вадим";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (916)-926-99-95";
        post.surname = "Иванов";
        post.subscription = true;


        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1997;

    }
}
package com.abdul.javacore.chapter06;

class BoxTwo {
    double width;
    double height ;
    double depth ;
    //Это конструктор класса Вох
    BoxTwo(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
